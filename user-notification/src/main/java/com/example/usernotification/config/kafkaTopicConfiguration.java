package com.example.usernotification.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopicConfiguration {

    @Bean
    public NewTopic sportsNews() {
        return TopicBuilder.name("sports-news").build();
    }

    @Bean
    public NewTopic techNews() {
        return TopicBuilder.name("tech-news").build();
    }

    @Bean
    public NewTopic entertainmentNews() {
        return TopicBuilder.name("entertainment-news").build();
    }
}
