package com.example.WebAppAspect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true) //It enables support for handling components marked with AspectJ’s @Aspect annotation. It is used with @Configuration annotation. We can control the type of proxy by using the proxyTargetClass attribute. Its default value is false.
public class WebAppAspectApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppAspectApplication.class, args);
	}

}
