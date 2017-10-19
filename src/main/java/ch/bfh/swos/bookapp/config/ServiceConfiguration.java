package ch.bfh.swos.bookapp.config;

import ch.bfh.swos.bookapp.ConsumerService;
import ch.bfh.swos.bookapp.ProducerService;
import ch.bfh.swos.bookapp.impl.DefaultConsumerService;
import ch.bfh.swos.bookapp.impl.DefaultProducerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Bean
    ProducerService producerService() {
        ProducerService producerService = new DefaultProducerService();
        producerService.setProduct("an apple");
        return producerService;
    }

    @Bean
    ConsumerService consumerService() {
        ConsumerService consumerService = new DefaultConsumerService();
        return consumerService;
    }
}
