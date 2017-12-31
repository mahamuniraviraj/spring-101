/**
 * 
 * File : ItemServiceImpl.java Version : 1.0 Date : Jan 1, 2018 Author : Raviraj S Mahamuni
 *
 * This file is part of 001-spring-context-xml-config. 001-spring-context-xml-config is free software: you can
 * redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version. 000-hello-world is distributed in
 * the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details. You should have received a
 * copy of the GNU General Public License along with 001-spring-context-xml-config. If not, see
 * <http://www.gnu.org/licenses/>.
 * 
 */
package com.reva.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.reva.entity.Item;

/**
 * @author Raviraj S Mahamuni
 *
 *         Jan 1, 2018
 */
public class ItemServiceImpl implements ItemService {

	private static final Logger logger = LoggerFactory.getLogger(ItemServiceImpl.class);

	/*
	 * (non-Javadoc)
	 * @see com.reva.service.ItemService#printAllItems()
	 */
	@Override
	public void printAllItems() {

		logger.debug(" Creating items list ");

		List<Item> items = new ArrayList<>();

		Item item1 = new Item(1, "Pen");
		items.add(item1);

		Item item2 = new Item(2, "Book");
		items.add(item2);

		Item item3 = new Item(3, "Bag");
		items.add(item3);

		logger.debug(" printing all items ");

		items.forEach(System.out::println);

	}

}
