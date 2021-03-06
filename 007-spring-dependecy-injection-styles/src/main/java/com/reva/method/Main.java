/*
 * 
 * File : Main.java
 * Version : 1.0
 * Date : 16 Dec, 2018
 * Author : Raviraj S Mahamuni
 *
 * This file is part of 007-spring-dependecy-injection-styles.
 * 007-spring-dependecy-injection-styles is free software: you can redistribute
 * it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 007-spring-dependecy-injection-styles is distributed in the hope that it will
 * be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with 007-spring-dependecy-injection-styles. If not, see
 * <http://www.gnu.org/licenses/>.
 * 
 */


package com.reva.method;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;


/**
 * @author Raviraj S Mahamuni
 * @date Dec 29, 2017
 * @since 1.0
 */
@Configuration
@ComponentScan("com.reva.method")
public class Main {

    private static final Logger MyLogger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        MyLogger.info("info Hello World");
        MyLogger.debug("debug Hello World");
        MyLogger.error(" error Hello World");
        MyLogger.warn("warn  Hello World ");

        ApplicationContext context = new AnnotationConfigApplicationContext(
                Main.class);

        // retrieve configured instance
        MyService service = context.getBean("myServiceRegular",
                MyService.class);

        for (int i = 0; i < 3; i++) {
            // use configured instance
            System.out.println(service.getTime());

        }

        // retrieve configured instance
        MyService myServiceMethodInjection = context
                .getBean("myServiceMethodInjection", MyService.class);

        for (int i = 0; i < 3; i++) {
            // use configured instance
            System.out.println(myServiceMethodInjection.getTime());

        }

        ((AbstractApplicationContext) context).close();

    }

}
