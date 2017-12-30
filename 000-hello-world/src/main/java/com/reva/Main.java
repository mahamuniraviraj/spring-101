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

/**
 * @author Raviraj S Mahamuni
 * @date   Dec 30, 2017
 * @since  1.0
 */
public class Main {

	private final static Logger logger = LoggerFactory.getLogger(Main.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		logger.debug("Hello World");

	}

}
