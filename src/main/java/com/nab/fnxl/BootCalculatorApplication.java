package com.nab.fnxl;

import com.nab.fnxl.service.CalculatorApplication;
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
public class BootCalculatorApplication {


    /**
     * method to initiate the call to CalculatorApplication.calculate(args) function.
     * This is the hook to get the calculator application running by passing in the arguments.
     * The code is commented as of now to enable the TDD testing.
     * @param args
     */
    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(BootCalculatorApplication.class, args);
        /*CalculatorApplication calculatorApplication = (CalculatorApplication) ctx.getBean("calculatorApplication");
        calculatorApplication.calculate(String.valueOf(args));*/
    }

}
