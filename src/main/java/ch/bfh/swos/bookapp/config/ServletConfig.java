package ch.bfh.swos.bookapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "ch.bfh.swos.bookapp.controller")
public class ServletConfig {
}
