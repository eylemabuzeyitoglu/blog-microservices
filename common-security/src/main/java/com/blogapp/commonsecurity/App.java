package com.blogapp.commonsecurity;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.blogapp.commonsecurity.client")
public class App 
{
    public static void main( String[] args ) {}
}
