package br.com.shiroma.bruno.shiromaartifact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShiromawebsoapApplication {

	/* http://www.davismol.net/2017/03/26/jaxb-marshalling-from-java-object-to-xml/ 
	 * https://spring.io/guides/gs/consuming-web-service/
	 * 
	 * */
	public static void main(String[] args) {
		SpringApplication.run(ShiromawebsoapApplication.class, args);
	}

}
