package com.example.lab4subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class WordServiceImpl implements WordService {

	@Autowired
	ArticleClient articleClient;
	
	@Autowired
	AdjectiveClient adjectiveClient;
	
	@Autowired
	SubjectClient subjectClient;
	
	@Autowired
	NounClient nounClient;
	
	@Autowired
	VerbClient verbClient;
	
	@HystrixCommand(fallbackMethod="getFallbackSubject")
	@Override
	public Word getSubject() {
		return new Word(subjectClient.getWord());
	}

	@Override
	public Word getArticle() {
		return new Word(articleClient.getWord());
	}

	@HystrixCommand(fallbackMethod="getFallbackAdjective")
	@Override
	public Word getAdjective() {
		return new Word(adjectiveClient.getWord());
	}

	@Override
	public Word getVerb() {
		return new Word(verbClient.getWord());
	}

	@HystrixCommand(fallbackMethod="getFallbackNoun")
	@Override
	public Word getNoun() {
		return new Word(nounClient.getWord());
	}
	
	public Word getFallbackAdjective() {
		return new Word("");
	}
	
	public Word getFallbackSubject() {
		return new Word("Someone");
	}
	
	public Word getFallbackNoun() {
		return new Word("Something");
	}

}
