package com.example.lab4subject;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaClientSubjectController {
	
//	@Autowired
//	DiscoveryClient discoveryClient;
	@Autowired 
	RestTemplate restTemplate;
	
	@GetMapping("/sentence")
	public @ResponseBody String getSentence() {
		return 
				getWord("SUBJECT") + " "
				+ getWord("VERB") + " "
				+ getWord("ARTICLE") + " "
				+ getWord("ADJECTIVE") + " "
				+ getWord("NOUN") + "."
				;
	}

	public String getWord(String service) {
		
//		 List<ServiceInstance> list = discoveryClient.getInstances(service);
		return restTemplate.getForObject("http://" + service, String.class);
		
//		if (list != null && list.size() > 0 ) {
//			
//			URI uri = list.get(0).getUri();
//			
//			if (uri !=null ) {
//				return (new RestTemplate()).getForObject(uri,String.class);
//			}
//		}
//		return null;
	}
}
