package com.langchain4j_demo.langchain4j_demo.service;

import dev.langchain4j.service.spring.AiService;

@AiService
public interface NagendraAIAgent {

    String chat(String message);
}
