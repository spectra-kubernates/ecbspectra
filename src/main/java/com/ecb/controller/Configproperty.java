package com.ecb.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@ConfigurationProperties(prefix="ecb")
@Configuration
@Data
public class Configproperty {
	
	private String error;

}
