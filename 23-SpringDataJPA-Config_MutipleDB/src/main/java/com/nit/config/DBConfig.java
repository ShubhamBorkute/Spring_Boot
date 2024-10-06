package com.nit.config;

import java.util.HashMap;

import javax.sql.DataSource;

import org.hibernate.jpa.boot.spi.EntityManagerFactoryBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories()
public class DBConfig {
	
	
	@Primary
	@Bean(name="dataSource")
	@ConfigurationProperties(prefix = "spring.db1.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}
	
	LocalContainerEntityManagerFactoryBean entityFactoryBean(EntityManagerFactoryBuilder buider , @Qualifier("dataSource") DataSource dataSource) {
		
		HashMap<String, Object> properties=new HashMap();
		properties.put("hibernate.hbmddl.auto", "update");
		
		return  buider.dataSource(dataSource).properties(properties).package s
	}

}
