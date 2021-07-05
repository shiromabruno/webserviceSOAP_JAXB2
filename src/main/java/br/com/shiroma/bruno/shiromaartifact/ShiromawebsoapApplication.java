package br.com.shiroma.bruno.shiromaartifact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShiromawebsoapApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShiromawebsoapApplication.class, args);
	}

/*	@Bean
	public Jaxb2Marshaller marshaller(){
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("br.com.shiroma.bruno.shiromaartifact.jaxbobjects");
		return marshaller;
	}
	*/

	/*
	public WebServiceRisk serviceCliente(Jaxb2Marshaller marshaller){

	}
	*/

}
