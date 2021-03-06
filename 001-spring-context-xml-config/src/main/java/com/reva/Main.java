/*
 * 
 *  File    :   Main.java
 *  Version :   1.0
 *  Date    :   16 Dec, 2018
 *  Author  :   Raviraj S Mahamuni
 *
    This file is part of 001-spring-context-xml-config.
    001-spring-context-xml-config is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
    001-spring-context-xml-config is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
    You should have received a copy of the GNU General Public License
    along with 001-spring-context-xml-config.  If not, see <http://www.gnu.org/licenses/>.

 */
package com.reva;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reva.service.ItemService;

/**
 * @author Raviraj S Mahamuni
 * @date Dec 30, 2017
 * @since 1.0
 */
public class Main {

	private static final  Logger logger = LoggerFactory.getLogger(Main.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		logger.debug("Hello World");

		// create and configure beans
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("my-spring-config.xml");

		// retrieve configured instance
		ItemService service = context.getBean("itemService", ItemService.class);

		// use configured instance
		service.printAllItems();

		context.close();

	}

}
