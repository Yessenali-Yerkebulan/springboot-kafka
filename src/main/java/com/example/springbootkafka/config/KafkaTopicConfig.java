package com.example.springbootkafka.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic comexampleTopic(){
        return TopicBuilder.name("comexample").build();
    }

    @Bean
    public NewTopic comexampleJsonTopic(){
        return TopicBuilder.name("comexample_json").build();
    }
}
