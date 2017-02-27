package com.nab.fnxl;

import com.nab.fnxl.service.ScanUserInput;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Start of the Calculator app using Spring Boot.
 *
 */
@SpringBootApplication
@ComponentScan
public class CalculationsApplication {


    /**
     * static method to initiate the call to ScanUserInput.init() function.
     * @param args
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(CalculationsApplication.class, args);

        ScanUserInput scanUserInput = (ScanUserInput) ctx.getBean("scanUserInput");
        scanUserInput.init();
    }

}
