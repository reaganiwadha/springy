package me.melunian.springy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringyApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder app){
		return app.sources(SpringyApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringyApplication.class, args);
	}

}

@RestController
class MainRestController{
	@RequestMapping("/")
	String RootEndpoint(){
		return "The springy server is running!";
	}

	@RequestMapping("/hello")
	String HelloEndpoint(){
		return "Hello!";
	}

	@RequestMapping("/hello/{name}")
	String HelloNameEndpoint(@PathVariable String name){
		return "Hello "+name;
	}
}