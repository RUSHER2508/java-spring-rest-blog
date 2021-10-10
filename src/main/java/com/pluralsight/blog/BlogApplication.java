package com.pluralsight.blog;

import com.pluralsight.blog.data.DatabaseLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.xml.crypto.Data;

@SpringBootApplication
@ComponentScan(basePackages = "com.pluralsight")
public class BlogApplication {


	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

}
