package com.nab.fnxl;

import com.nab.fnxl.configurations.CalculatorConfig;
import com.nab.fnxl.scanner.DisplayArithmeticInfo;
import com.nab.fnxl.validations.ValidationUtil;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class CalculatorApplication {
    @Autowired
    private SampleBean sampleBean;

    @Autowired
    private ValidationUtil util;

    @Autowired
    private CalculatorConfig calculatorConfig;

    @Autowired
    private DisplayArithmeticInfo displayArithmeticInfo;

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(CalculatorApplication.class, args);

    }

    @PostConstruct
    public void printMyPostConstructedMethod() {
        System.out.println("Post construct method");
        sampleBean.print(" sample bean");
        System.out.println(calculatorConfig.getMyList());
        System.out.println(util.validateUserInput("25.9!556"));

        System.out.println("Printing user prompt :" +displayArithmeticInfo.getMainMessage());

    }
}
