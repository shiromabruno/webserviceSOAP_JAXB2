package br.com.shiroma.bruno.shiromaartifact.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class WebServiceConfig {

	
	@Bean
	public Jaxb2Marshaller marshaller(){
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("src.main.wsdl.generated.service._do.info.para.namespace._do.url");
		return marshaller;
	}
	
	/*@Bean
	public WebServiceCliente serviceClient(Jaxb2Marshaller marshaller) {
		WebServiceCliente cliente = new WebServiceCliente();
		cliente.setDefaultUri();
		cliente.setMashaller(marshaller);
		cliente.setUnmashaller(marshaller);
		cliente.setMessageSender(defaultMwMessageSender());
	}
	*/
	

	/*
	public WebServiceRisk serviceCliente(Jaxb2Marshaller marshaller){

	}
	*/

}
