/*-
 *  File    :   MyRandom.java
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


package com.reva.method;


import java.time.LocalDateTime;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 * @author Raviraj S Mahamuni
 * @date 16-Dec-2018
 * @since 1.0
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyPrototypeBean {

    private static final Logger logger = LoggerFactory
            .getLogger(MyPrototypeBean.class);

    private LocalDateTime now = LocalDateTime.now();

    @PostConstruct
    public void init() {
        logger.debug(
                "MyPrototypeBean object Created and init method called. To demonstate propto type scoped bean ");
    }

    public String getTimeFromProtoType() {
        return now.toString();
    }

}
