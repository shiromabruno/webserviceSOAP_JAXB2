package br.com.shiroma.bruno.shiromaartifact.service;

import javax.xml.bind.JAXBElement;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import service._do.info.para.namespace._do.url.GetInfoDoSolicitante;
import service._do.info.para.namespace._do.url.GetInfoDoSolicitanteResponse;

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
			WebServiceCliente wsc = new WebServiceCliente();
			wsc.setDefaultUri("URL");
			Jaxb2Marshaller marshaler = webServiceConfig.marshaller();
			wsc.setMarshaller(marshaler);
			wsc.setUnmarshaller(marshaler);
			wsc.setMessageSender(webServiceConfig.defaultMessageSender());
			response = (JAXBElement<GetInfoDoSolicitanteResponse>) wsc.getWebServiceTemplate().marshalSendAndReceive(request);
		}
		catch(Exception e) {
			throw new ResourceUnavailableException("Erro chamando Webservice", e);
		}
		return response;
	}


}
