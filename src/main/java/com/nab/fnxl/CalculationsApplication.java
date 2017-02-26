package com.nab.fnxl;

import com.nab.fnxl.service.ScanUserInput;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class CalculationsApplication {

   /* @Autowired
    private ValidationUtil util;

    @Autowired
    private CalculatorConfig calculatorConfig;

    @Autowired
    private DisplayArithmeticInfo displayArithmeticInfo;*/

    @Autowired
    private ScanUserInput scanUserInput;

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(CalculationsApplication.class, args);

        ScanUserInput scanUserInput = (ScanUserInput) ctx.getBean("scanUserInput");
        scanUserInput.init();
    }

}
