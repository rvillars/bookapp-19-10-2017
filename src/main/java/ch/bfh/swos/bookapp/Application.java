package ch.bfh.swos.bookapp;

import ch.bfh.swos.bookapp.config.ServiceConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ServiceConfiguration.class);
        ConsumerService consumerService = context.getBean(ConsumerService.class);
        consumerService.consume();

        ApplicationContext context2 = new ClassPathXmlApplicationContext("serviceConfig.xml");
        ConsumerService consumerService2 = context2.getBean(ConsumerService.class);
        consumerService2.consume();
    }
}
