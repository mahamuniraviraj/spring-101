/*-
 *  File    :   RepositoryImpl.java
 *  Version :   1.0
 *  Date    :   16-Dec-2018
 *  Author  :   Raviraj S Mahamuni
 *
    This file is part of 007-spring-dependecy-injection-styles.
    007-spring-dependecy-injection-stylesis free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
    007-spring-dependecy-injection-styles is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
    You should have received a copy of the GNU General Public License
    along with 007-spring-dependecy-injection-styles.  If not, see <http://www.gnu.org/licenses/>.
 */


package com.reva.constructor;


/**
 * @author Raviraj S Mahamuni
 * @date 16-Dec-2018
 * @since 1.0
 */
@org.springframework.stereotype.Repository
public class MyRepositoryImpl implements MyRepository {

    /*
     * (non-Javadoc)
     * 
     * @see com.reva.constructor.Repository#sayHi()
     */
    @Override
    public String sayHi() {

        return "Hello World from Repository";
    }

}
