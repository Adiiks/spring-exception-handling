package pl.adiks.springexceptionhandling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.adiks.springexceptionhandling.controller.ExceptionAdvice;

@SpringBootApplication
public class SpringExceptionHandlingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringExceptionHandlingApplication.class, args);
    }
}
