/*
 * Copyright 2019-present Open Networking Foundation
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

package org.onosproject.grpcintegration.app;

/**
 * An enum to represent different type of ONOS events.
 */
public enum EventType {
    PACKET_EVENT(1),
    LINK_EVENT(2),
    DEVICE_EVENT(3);

    private int typeIndex;

    EventType(int typeIndex) {
        this.typeIndex = typeIndex;

    }

    public int getTypeIndex() {
        return typeIndex;
    }

}
