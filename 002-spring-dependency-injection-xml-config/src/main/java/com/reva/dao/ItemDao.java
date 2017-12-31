/**
 * 
 * File : ItemDao.java Version : 1.0 Date : Jan 1, 2018 Author : Raviraj S Mahamuni
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
package com.reva.dao;

import java.util.List;

import com.reva.entity.Item;

/**
 * @author Raviraj S Mahamuni
 *
 *         Jan 1, 2018
 */
public interface ItemDao {

	public List<Item> getItems();
}
