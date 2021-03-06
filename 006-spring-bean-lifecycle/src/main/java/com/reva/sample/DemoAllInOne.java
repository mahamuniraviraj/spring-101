/*
 * 
 *  File    :   DemoAllInOne.java
 *  Version :   1.0
 *  Date    :   16 Dec, 2018
 *  Author  :   Raviraj S Mahamuni
 *
    This file is part of 006-spring-bean-lifecycle.
    006-spring-bean-lifecycle is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
    006-spring-bean-lifecycle is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
    You should have received a copy of the GNU General Public License
    along with 006-spring-bean-lifecycle.  If not, see <http://www.gnu.org/licenses/>.

 */


package com.reva.sample;


import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


/**
 * @author Raviraj S Mahamuni
 * @date Dec 29, 2017
 * @since 1.0
 */
@Component
public class DemoAllInOne
        implements MyInterface, InitializingBean, DisposableBean {

    private static final Logger logger = LoggerFactory
            .getLogger(DemoAllInOne.class);

    /*
     * (non-Javadoc)
     * 
     * @see com.reva.sample.MyInterface#sayhello()
     */
    @Override
    public String sayhello() {
        return "Hello World from MyClass" + new Date();
    }

    @Override
    public void destroy() throws Exception {
        logger.error("DemoAllInOne::DisposableBean::destroy() method called");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.error(
                "DemoAllInOne::InitializingBean::afterPropertiesSet() method called");

    }

    public void init() {
        logger.error("DemoAllInOne::Default::init() method called");

    }

    @PostConstruct
    public void myCustomInit() {

        logger.error("DemoAllInOne::@PostConstruct::init() method called");

    }

    @PreDestroy
    public void myCustomDestroy() {
        logger.error("DemoAllInOne::@PreDestroy::destroy() method called");

    }

}
