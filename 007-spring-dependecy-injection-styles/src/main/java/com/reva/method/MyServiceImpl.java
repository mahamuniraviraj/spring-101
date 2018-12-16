/*
 * 
 * File : ServiceImpl.java
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


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author Raviraj S Mahamuni
 * @date Dec 29, 2017
 * @since 1.0
 */
@Component(value = "myServiceRegular")
public class MyServiceImpl implements MyService {

    /**
     * Property Injection
     */
    @Autowired
    private MyPrototypeBean bean;

    /*
     * (non-Javadoc)
     * 
     * @see com.reva.sample.MyInterface#sayhello()
     */
    @Override
    public String getTime() {
        return "MyServiceImpl::getTime " + this.bean.getTimeFromProtoType();
    }

}
