package com.example.lab4subject;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Article")
public interface ArticleClient {

	@GetMapping("/")
	public String getWord();
}
