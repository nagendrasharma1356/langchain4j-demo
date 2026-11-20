package com.langchain4j_demo.langchain4j_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.langchain4j_demo.langchain4j_demo.service.NagendraAIAgent;
import com.langchain4j_demo.langchain4j_demo.service.OrderSupportAIAgent;

@RestController
@RequestMapping("api/ai-support")
public class AISupportController {

    private  NagendraAIAgent agent;
    private  OrderSupportAIAgent orderSupportAIAgent;

    public AISupportController(
            NagendraAIAgent agent,
            OrderSupportAIAgent orderSupportAIAgent) {
        this.agent = agent;
        this.orderSupportAIAgent = orderSupportAIAgent;
    }

    @GetMapping
    public String chat(@RequestParam String message) {
        return agent.chat(message);
    }

    @GetMapping("/order")
    public String orderSupport(@RequestParam String message) {
        return orderSupportAIAgent.chat(message);
    }
}
