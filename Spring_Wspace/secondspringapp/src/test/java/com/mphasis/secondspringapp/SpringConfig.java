package com.mphasis.secondspringapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.mphasis.secondspringapp.service.MailServerConfig;
import com.mphasis.weatherapp.WeatherService;

@Configuration
@ComponentScan(basePackages = {"Com.mphasis.secondspringapp"})
@EnableAspectJAutoProxy
public class SpringConfig {
	
	@Bean("weatherService")
	@Scope("singleton")
	public WeatherService weatherService() {
		return new WeatherService();
	}
	@Bean("mailServerConfigA")
	
	public MailServerConfig mailServerConfigA(){
		MailServerConfig mailServerConfig = new MailServerConfig();
		mailServerConfig.setIp("192.168.12.1");
		mailServerConfig.setLogin("Tom");
		mailServerConfig.setToken("X@34RTG");
		return mailServerConfig;
	}
	@Bean("mailServerConfigB")

	public MailServerConfig mailServerConfigB(){
		MailServerConfig mailServerConfig = new MailServerConfig();
		mailServerConfig.setIp("192.168.12.2");
		mailServerConfig.setLogin("Tim");
		mailServerConfig.setToken("X@356TG");
		return mailServerConfig;
	}
}
