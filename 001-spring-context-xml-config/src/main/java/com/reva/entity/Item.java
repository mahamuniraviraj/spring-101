/*
 * 
 *  File    :   Item.java
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
package com.reva.entity;

/**
 * @author Raviraj S Mahamuni
 *
 *         Jan 1, 2018
 */
public class Item {

	private Integer id;

	private String name;

	/**
	 * @param i
	 * @param string
	 */
	public Item(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}

}
