package com.sudip.kafkapoc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaPocApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> template) {
        return args -> {
            template.send("topic", "hello kafka :)");
        };
    }

}
