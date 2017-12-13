/*
 * Copyright 2017 original authors
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
package org.particleframework.http.sse;

import org.particleframework.http.MediaType;
import org.particleframework.http.annotation.Produces;
import org.reactivestreams.Publisher;

/**
 * Creates a Server Sent Event (SSE) stream
 *
 * @author Graeme Rocher
 * @since 1.0
 */
@Produces(MediaType.TEXT_EVENT_STREAM)
public interface EventStream extends Publisher<Event> {

    /**
     * <p>Create an event stream from a </p>
     *
     * @param eventPublisher The event publisher
     * @return The EventStream
     */
    static EventStream of(Publisher<Event> eventPublisher) {
        return new PublisherEventStream(eventPublisher);
    }

}
