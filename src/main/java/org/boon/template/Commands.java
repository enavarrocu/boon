/*
 * Copyright 2013-2014 Richard M. Hightower
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * __________                              _____          __   .__
 * \______   \ ____   ____   ____   /\    /     \ _____  |  | _|__| ____    ____
 *  |    |  _//  _ \ /  _ \ /    \  \/   /  \ /  \\__  \ |  |/ /  |/    \  / ___\
 *  |    |   (  <_> |  <_> )   |  \ /\  /    Y    \/ __ \|    <|  |   |  \/ /_/  >
 *  |______  /\____/ \____/|___|  / \/  \____|__  (____  /__|_ \__|___|  /\___  /
 *         \/                   \/              \/     \/     \/       \//_____/
 *      ____.                     ___________   _____    ______________.___.
 *     |    |____ ___  _______    \_   _____/  /  _  \  /   _____/\__  |   |
 *     |    \__  \\  \/ /\__  \    |    __)_  /  /_\  \ \_____  \  /   |   |
 * /\__|    |/ __ \\   /  / __ \_  |        \/    |    \/        \ \____   |
 * \________(____  /\_/  (____  / /_______  /\____|__  /_______  / / ______|
 *               \/           \/          \/         \/        \/  \/
 */

package org.boon.template;

import org.boon.core.Conversions;

/**
 * Created by Richard on 2/27/14.
 */
public enum Commands {
    EACH,
    IF,
    WITH,
    UNLESS,
    LOG, //MISSING
    LENGTH, //like if but checks to see if a list has a certain length NOT DONE
    FUNCTION, //calls a function if return type is not void, outputs to screen, hmmmm.... NOT DONE
    INCLUDE, //INCLUDE ANOTHER TEMPLATE has a name gets mapped in.. used like function if found in namespace WILL BE LIKE FREEMARKER style
    UNKNOWN;

    /*
    TODO Think about tiles inheritance structure

    templates can have JSON snippet definition associated with the jstl
    <definition name="myapp.homepage.body" jstl="/layouts/three_rows.jsp">
        <put-attribute name="one" value="/tiles/headlines.jsp" />
        <put-attribute name="two" value="/tiles/topics.jsp" />
        <put-attribute name="one" value="/tiles/comments.jsp" />
    </definition>

    Becomes
    {
        "definitions": [
                { "name":"myapp.homepage.body",
                "jstl":"three_row",
                 children : [
                    {name:one, jstl:"topics"}
                 ]},
                { "name":"myapp.backend.body",
                 "ex
                "jstl":"three_row",
                 children : [
                    {name:one, jstl:"topics"}
                 ]},

        ]
    }

     */

    /**
     *
     * @param value
     * @return
     */
    public static Commands command(String value) {
       return Conversions.toEnum(Commands.class, value.toUpperCase(), UNKNOWN);
    }
}
