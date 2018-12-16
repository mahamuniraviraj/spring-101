/*
 * 
 *  File    :   MyClasss.java
 *  Version :   1.0
 *  Date    :   16 Dec, 2018
 *  Author  :   Raviraj S Mahamuni
 *
    This file is part of 003-spring-xml-config.
    003-spring-xml-config is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
    003-spring-xml-config is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
    You should have received a copy of the GNU General Public License
    along with 003-spring-xml-config.  If not, see <http://www.gnu.org/licenses/>.

 */


package com.reva.sample;


import java.util.Date;


/**
 * @author Raviraj S Mahamuni
 * @date Dec 29, 2017
 * @since 1.0
 */
public class MyClasss implements MyInterface {

    /*
     * (non-Javadoc)
     *
     * @see com.reva.sample.MyInterface#sayhello()
     */
    @Override
    public String sayhello() {
        return "Hello World from MyClass" + new Date();
    }

}
