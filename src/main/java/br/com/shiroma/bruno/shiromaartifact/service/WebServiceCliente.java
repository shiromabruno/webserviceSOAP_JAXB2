package br.com.shiroma.bruno.shiromaartifact.service;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import br.com.shiroma.bruno.shiromaartifact.configuration.WebServiceConfig;
import service._do.info.para.namespace._do.url.GetInfoDoSolicitante;
import service._do.info.para.namespace._do.url.GetInfoDoSolicitanteResponse;

@Service
public class WebServiceCliente extends WebServiceGatewaySupport{
	
	@Autowired
	WebServiceConfig webServiceConfig;
	
	public JAXBElement<GetInfoDoSolicitanteResponse> getCliente(String codigoCliente, String tipoCliente, String dataBase, String auto){
		GetInfoDoSolicitante request = new GetInfoDoSolicitante();
		request.setCodigoDoClient(codigoCliente);
		request.setTipoClient(tipoCliente);
		request.setDataAlvo(dataBase);
		request.setAuthor(auto);
		
		JAXBElement<GetInfoDoSolicitanteResponse> response = null;
		
		try {
			/*WebServiceCliente wsc = new WebServiceCliente();
			wsc.setDefaultUri("URL");
			Jaxb2Marshaller marshaler = webServiceConfig.marshaller();
			wsc.setMarshaller(marshaler);
			wsc.setUnmarshaller(marshaler);
			wsc.setMessageSender(webServiceConfig.defaultMwMessageSender());
			*/
			
			WebServiceCliente wsc = new WebServiceCliente();
			Jaxb2Marshaller marshaler = new Jaxb2Marshaller();
			
			marshaler = webServiceConfig.marshaller();
			wsc = webServiceConfig.serviceClient(marshaler);
			wsc.setMessageSender(webServiceConfig.defaultMwMessageSender());
			
			// getWebServiceTemplate() eh da propria classe extends WebServiceGatewaySupport
			response = (JAXBElement<GetInfoDoSolicitanteResponse>) wsc.getWebServiceTemplate().marshalSendAndReceive(request);
		}
		catch(Exception e) {
			System.out.println("Error: " + e);
		}
		return response;
	}


}
