/*
 * Copyright 2017-2018 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.micronaut.http.uri;

import java.util.Map;

/**
 * The result of a call to {@link UriMatchTemplate#match(java.net.URI)}.
 *
 * @author Graeme Rocher
 * @since 1.0
 */
public interface UriMatchInfo {

    /**
     * @return The matched URI
     */
    String getUri();

    /**
     * @return The variable values following a successful match
     */
    Map<String, Object> getVariables();

    /**
     * Checks whether the given variable is exploded (using the * modifier). See https://tools.ietf.org/html/rfc6570#section-3.
     *
     * @param variable The name of the variable
     * @return True if is exploded
     */
    boolean isExploded(String variable);
}