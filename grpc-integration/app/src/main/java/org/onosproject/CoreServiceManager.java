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

import io.grpc.stub.StreamObserver;
import org.onlab.osgi.DefaultServiceDirectory;
import org.onosproject.core.ApplicationId;
import org.onosproject.core.CoreService;
import org.onosproject.grpc.core.models.ApplicationIdProtoOuterClass.ApplicationIdProto;
import org.onosproject.grpc.grpcintegration.models.ControlMessagesProto.AppName;
import org.onosproject.grpc.grpcintegration.models.CoreServiceGrpc.CoreServiceImplBase;
import org.onosproject.grpcintegration.api.CoregrpcService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Implements gRPC CoreService Interface.
 */
@Component(immediate = true, service = CoregrpcService.class)
public class CoreServiceManager
        extends CoreServiceImplBase
        implements CoregrpcService {


    private final Logger log = getLogger(getClass());


    @Reference(cardinality = ReferenceCardinality.MANDATORY)
    protected CoreService coreService;

    @Activate
    protected void activate() {

        log.info("Core Service has been activated");
    }

    @Deactivate
    protected void deactivate() {

        log.info("Core Service has been deactivated");
    }




}
