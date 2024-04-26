package com.example.newspublisher.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class NewsPublisherController {

    @Autowired
    KafkaTemplate<String, String> template;

    @PostMapping("/create-news/{type}")
    public void createNews(@RequestBody() String news, @PathVariable("type") String type) {
        switch (type.toLowerCase()) {
            case "sports":
                template.send("sports-news", news);
                break;
            case "tech":
                template.send("tech-news", news);
                break;
            case "entertainment":
                template.send("entertainment-news", news);
                break;
        }
    }
}
