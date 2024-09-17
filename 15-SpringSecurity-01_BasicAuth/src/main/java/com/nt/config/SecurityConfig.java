package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvcSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		// for authentication info provider Configuration
		auth.inMemoryAuthentication().withUser("shubham").password("{noop}123").roles("customer");
		auth.inMemoryAuthentication().withUser("shubham1").password("{noop}1234").roles("manager");
		auth.inMemoryAuthentication().withUser("shubham2").password("{noop}12345").roles("manager","customer'");
		auth.inMemoryAuthentication().withUser("shubham3").password("{noop}123456").roles("visitor");
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().antMatchers("/").permitAll()
		.antMatchers("/offers").authenticated()
		.antMatchers("/balance").hasAnyRole("customer","manager")
		.antMatchers("/loanApprove").hasRole("manager")
		.anyRequest().authenticated()
		//.and().httpBasic()
		.and().formLogin()  // form based authentication
		.and().logout()
		.and().exceptionHandling().accessDeniedPage("/denied");//for configure custom handler page bad request
	}
}
