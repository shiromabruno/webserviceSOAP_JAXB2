package br.com.shiroma.bruno.shiromaartifact.configuration;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;


import br.com.shiroma.bruno.shiromaartifact.service.WebServiceCliente;

@Configuration
public class WebServiceConfig {

	
	@Bean
	public Jaxb2Marshaller marshaller(){
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("src.main.wsdl.generated.service._do.info.para.namespace._do.url");
		return marshaller;
	}
	
	@Bean
	public WebServiceCliente serviceClient(Jaxb2Marshaller marshaller) {
		WebServiceCliente cliente = new WebServiceCliente();
		cliente.setDefaultUri("URL");
		cliente.setMarshaller(marshaller);
		cliente.setUnmarshaller(marshaller);
		cliente.setMessageSender(defaultMwMessageSender());
		return cliente;
	}
	
	@Bean
	public HttpComponentsMessageSender defaultMwMessageSender(){
		HttpComponentsMessageSender messageSender = new HttpComponentsMessageSender();
		messageSender.setCredentials(new UsernamePasswordCredentials("UserNameHere", "PasswordHere"));
		return messageSender;
	}
	

}
