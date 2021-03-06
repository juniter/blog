package com.juniter.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.juniter.blog.conf.DefaultConfiguration;

@SpringBootApplication
@EnableConfigurationProperties(DefaultConfiguration.class)
public class SpringBootEntry 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(SpringBootEntry.class, args);
    }
}
