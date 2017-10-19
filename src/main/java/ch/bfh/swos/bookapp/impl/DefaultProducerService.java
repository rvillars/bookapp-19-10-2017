package ch.bfh.swos.bookapp.impl;

import ch.bfh.swos.bookapp.ProducerService;

public class DefaultProducerService implements ProducerService {

    private String product;

    public void setProduct(String product) {
        this.product = product;
    }

    public String produce() {
        System.out.println("DefaultProducerService: I just produced: " +product);
        return product;
    }
}
