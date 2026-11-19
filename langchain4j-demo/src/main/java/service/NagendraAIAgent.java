package service;

import dev.langchain4j.service.spring.AiService;

@AiService
public interface NagendraAIAgent {

    String chat(String message);
}
