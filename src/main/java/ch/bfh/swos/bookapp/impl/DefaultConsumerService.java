package ch.bfh.swos.bookapp.impl;

import ch.bfh.swos.bookapp.ConsumerService;
import ch.bfh.swos.bookapp.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;

public class DefaultConsumerService implements ConsumerService {

    @Autowired
    ProducerService producerService;

    public void consume() {
        System.out.println("DefaultConsumerService: I just consumed: "+producerService.produce());
    }
}
