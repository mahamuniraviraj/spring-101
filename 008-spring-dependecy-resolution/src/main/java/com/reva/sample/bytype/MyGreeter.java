/*
 * 
 * File : MyClasss.java
 * Version : 1.0
 * Date : 16 Dec, 2018
 * Author : Raviraj S Mahamuni
 *
 * This file is part of 008-spring-dependecy-resolution.
 * 008-spring-dependecy-resolution is free software: you can redistribute it
 * and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 008-spring-dependecy-resolution is distributed in the hope that it will be
 * useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with 008-spring-dependecy-resolution. If not, see
 * <http://www.gnu.org/licenses/>.
 * 
 */


package com.reva.sample.bytype;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author Raviraj S Mahamuni
 * @date Dec 29, 2017
 * @since 1.0
 */
@Component
public class MyGreeter {

    private MyClasss one;

    private MyAnotherClasss two;

    @Autowired
    public MyGreeter(MyClasss one, MyAnotherClasss two) {
        this.one = one;
        this.two = two;
    }

    public String sayHelloFromAll() {
        return "Hello World from Greeter" + new Date() + " \n"
                + this.one.sayhello() + " \n" + this.two.sayhello();
    }

}
