/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.jsontemplate.modelbuild.handler;

import com.github.jsontemplate.jsonbuild.JsonNode;

public interface DefaultBuildHandler {

    /**
     * A fallback handling of a type used in the template
     *
     * @param valueTypeName the name of the value type
     * @return the produced json node
     */
    JsonNode handle(String valueTypeName);
}
