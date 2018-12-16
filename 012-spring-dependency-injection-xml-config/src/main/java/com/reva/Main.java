/*-
 *  File    :   Main.java
 *  Version :   1.0
 *  Date    :   Dec 30, 2017
 *  Author  :   Raviraj S Mahamuni
 *
    This file is part of 000-hello-world.

    000-hello-world is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    000-hello-world is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with 000-hello-world.  If not, see <http://www.gnu.org/licenses/>.

 */
package com.reva;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reva.service.InventoryService;
import com.reva.service.ItemService;
import com.reva.service.OrderService;

/**
 * @author Raviraj S Mahamuni
 * @date Dec 30, 2017
 * @since 1.0
 */
public class Main {

	private final static Logger logger = LoggerFactory.getLogger(Main.class);

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

		OrderService orderService = context.getBean("orderService", OrderService.class);

		int price = orderService.getOrderPrice();
		System.out.println(" Order price " + price);

		logger.debug(
				"See the prototype bean Stock Dao is created at each method invocation on singlton bean Inventory Service.");

		InventoryService invService = context.getBean("inventoryService", InventoryService.class);

		Integer stock = invService.getAllStock(1);

		System.out.println("stock " + stock);

		stock = invService.getAllStock(1);

		System.out.println("stock changed " + stock);
		context.close();

	}

}
