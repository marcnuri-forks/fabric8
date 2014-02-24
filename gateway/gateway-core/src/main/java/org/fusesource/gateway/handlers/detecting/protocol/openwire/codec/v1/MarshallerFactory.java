/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fusesource.gateway.handlers.detecting.protocol.openwire.codec.v1;

import org.fusesource.gateway.handlers.detecting.protocol.openwire.codec.DataStreamMarshaller;
import org.fusesource.gateway.handlers.detecting.protocol.openwire.codec.OpenWireFormat;

/**
 * MarshallerFactory for Open Wire Format.
 *
 *
 * NOTE!: This file is auto generated - do not modify!
 *        Modify the 'apollo-openwire-generator' module instead.
 *
 * 
 */
public class MarshallerFactory {

    /**
     * Creates a Map of command type -> Marshallers
     */
    static final private DataStreamMarshaller marshaller[] = new DataStreamMarshaller[256];
    static {

        add(new ActiveMQBytesMessageMarshaller());
        add(new ActiveMQMapMessageMarshaller());
        add(new ActiveMQMessageMarshaller());
        add(new ActiveMQObjectMessageMarshaller());
        add(new ActiveMQQueueMarshaller());
        add(new ActiveMQStreamMessageMarshaller());
        add(new ActiveMQTempQueueMarshaller());
        add(new ActiveMQTempTopicMarshaller());
        add(new ActiveMQTextMessageMarshaller());
        add(new ActiveMQTopicMarshaller());
        add(new BrokerIdMarshaller());
        add(new BrokerInfoMarshaller());
        add(new ConnectionControlMarshaller());
        add(new ConnectionErrorMarshaller());
        add(new ConnectionIdMarshaller());
        add(new ConnectionInfoMarshaller());
        add(new ConsumerControlMarshaller());
        add(new ConsumerIdMarshaller());
        add(new ConsumerInfoMarshaller());
        add(new ControlCommandMarshaller());
        add(new DataArrayResponseMarshaller());
        add(new DataResponseMarshaller());
        add(new DestinationInfoMarshaller());
        add(new DiscoveryEventMarshaller());
        add(new ExceptionResponseMarshaller());
        add(new FlushCommandMarshaller());
        add(new IntegerResponseMarshaller());
        add(new KeepAliveInfoMarshaller());
        add(new LastPartialCommandMarshaller());
        add(new LocalTransactionIdMarshaller());
        add(new MessageAckMarshaller());
        add(new MessageDispatchMarshaller());
        add(new MessageDispatchNotificationMarshaller());
        add(new MessageIdMarshaller());
        add(new NetworkBridgeFilterMarshaller());
        add(new PartialCommandMarshaller());
        add(new ProducerIdMarshaller());
        add(new ProducerInfoMarshaller());
        add(new RemoveInfoMarshaller());
        add(new RemoveSubscriptionInfoMarshaller());
        add(new ReplayCommandMarshaller());
        add(new ResponseMarshaller());
        add(new SessionIdMarshaller());
        add(new SessionInfoMarshaller());
        add(new ShutdownInfoMarshaller());
        add(new SubscriptionInfoMarshaller());
        add(new TransactionInfoMarshaller());
        add(new WireFormatInfoMarshaller());
        add(new XATransactionIdMarshaller());

    }

    static private void add(DataStreamMarshaller dsm) {
        marshaller[dsm.getDataStructureType()] = dsm;
    }
    
    static public DataStreamMarshaller[] createMarshallerMap(OpenWireFormat wireFormat) {
        return marshaller;
    }
}
