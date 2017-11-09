package ch.bfh.swos.bookapp.config;

import ch.bfh.swos.bookapp.ConsumerService;
import ch.bfh.swos.bookapp.ProducerService;
import ch.bfh.swos.bookapp.StockService;
import ch.bfh.swos.bookapp.impl.DefaultConsumerService;
import ch.bfh.swos.bookapp.impl.DefaultProducerService;
import ch.bfh.swos.bookapp.impl.DefaultStockService;
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

    @Bean
    StockService stockService() {
        StockService stockService = new DefaultStockService();
        return  stockService;
    }
}
