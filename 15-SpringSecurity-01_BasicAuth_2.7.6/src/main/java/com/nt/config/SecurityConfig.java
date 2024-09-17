package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvcSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
	/* $2a$10$NXeXhFVi.riwRRFuC7nOHOFgQvkPAzYpxbVPULtV7Y0BKSUCl8U0q
		$2a$10$a6MCnZiHC1g1KTYEd31l4.OZaTWYOHXGkKKeVYz7gmO7h48ubMn2e
		$2a$10$5Sti6CDljTFR4YXceZ091O9YKgVFjXZd2Q7x/zEW4.zK4mvwnHhve
		$2a$10$VXpjtf8T9QJvKH4vgT9fv.fAljFaYkW98lfDfbL/f/IJauyojT9fa
		*/
		// for authentication info provider Configuration
		auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("shubham").password("$2a$10$NXeXhFVi.riwRRFuC7nOHOFgQvkPAzYpxbVPULtV7Y0BKSUCl8U0q").roles("customer");
		auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("yash").password("$2a$10$a6MCnZiHC1g1KTYEd31l4.OZaTWYOHXGkKKeVYz7gmO7h48ubMn2e").roles("manager");
		auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("kapil").password("$2a$10$5Sti6CDljTFR4YXceZ091O9YKgVFjXZd2Q7x/zEW4.zK4mvwnHhve").roles("manager","customer'");
		auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("sumit").password("$2a$10$VXpjtf8T9QJvKH4vgT9fv.fAljFaYkW98lfDfbL/f/IJauyojT9fa").roles("visitor");
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().antMatchers("/").permitAll()
		.antMatchers("/offers").authenticated()
		.antMatchers("/balance").hasAnyRole("customer","manager")
		.antMatchers("/loanApprove").hasRole("manager")
		.anyRequest().authenticated()
		//.and().httpBasic()  // normal pop up for enter details
		.and().formLogin()  // form based authentication
		.and().rememberMe()
		.and().logout()
		.and().exceptionHandling().accessDeniedPage("/denied")//for configure custom handler page bad request
		.and().sessionManagement().maximumSessions(2).maxSessionsPreventsLogin(true );
	}
	
}
