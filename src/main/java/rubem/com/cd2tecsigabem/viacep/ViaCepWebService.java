package rubem.com.cd2tecsigabem.viacep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


import reactor.core.publisher.Mono;


@Service
public class ViaCepWebService {

	@Autowired
	private WebClient webClient;
	
	public EnderecoDTO viaCepWebService(String cep) {
		
		String url = String.format("https://viacep.com.br/ws/%s/json",cep);
		
		Mono<EnderecoDTO > monoProduto =  this.webClient.method(HttpMethod.GET)
		.uri(url)
		.retrieve()
		.bodyToMono(EnderecoDTO .class);
		
		EnderecoDTO cepObj = monoProduto.block();
		cepObj.setUf(cepObj.getUf());
		cepObj.setDdd(cepObj.getDdd());
		
		return cepObj;
    }
}

