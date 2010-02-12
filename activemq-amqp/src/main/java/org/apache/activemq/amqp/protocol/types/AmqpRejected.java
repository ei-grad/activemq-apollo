/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * his work for additional information regarding copyright ownership.
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
package org.apache.activemq.amqp.protocol.types;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.Boolean;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.activemq.amqp.protocol.marshaller.AmqpEncodingError;
import org.apache.activemq.amqp.protocol.marshaller.AmqpMarshaller;
import org.apache.activemq.amqp.protocol.marshaller.Encoded;
import org.apache.activemq.amqp.protocol.types.IAmqpMap;
import org.apache.activemq.util.buffer.Buffer;

/**
 * Represents a the rejected disposition
 * <p>
 * The rejected disposition is used to indicate that an incoming Message is invalid and
 * therefore unprocessable. If an attempt to transfer a Message results in a reject from the
 * recipient, the sender MUST add the supplied reject-properties to the Message header
 * message-attrs. A rejected Message may be held at the node, forwarded to a different node
 * (for instance a dead letter queue) or discarded depending on configuration at the node.
 * </p>
 */
public interface AmqpRejected extends AmqpMap {


    /**
     * Key for: permit truncation of the remaining transfer
     */
    public static final AmqpSymbol TRUNCATE_KEY = TypeFactory.createAmqpSymbol("truncate");
    /**
     * Key for: null
     */
    public static final AmqpSymbol REJECT_PROPERTIES_KEY = TypeFactory.createAmqpSymbol("reject-properties");



    /**
     * permit truncation of the remaining transfer
     * <p>
     * The truncate flag, if true, indicates that the receiver is not interested in the rest of
     * the Message content, and the sender is free to omit it.
     * </p>
     */
    public void setTruncate(Boolean truncate);

    /**
     * permit truncation of the remaining transfer
     * <p>
     * The truncate flag, if true, indicates that the receiver is not interested in the rest of
     * the Message content, and the sender is free to omit it.
     * </p>
     */
    public void setTruncate(boolean truncate);

    /**
     * permit truncation of the remaining transfer
     * <p>
     * The truncate flag, if true, indicates that the receiver is not interested in the rest of
     * the Message content, and the sender is free to omit it.
     * </p>
     */
    public void setTruncate(AmqpBoolean truncate);

    /**
     * permit truncation of the remaining transfer
     * <p>
     * The truncate flag, if true, indicates that the receiver is not interested in the rest of
     * the Message content, and the sender is free to omit it.
     * </p>
     */
    public Boolean getTruncate();

    /**
     * <p>
     * The map supplied in this field will be placed in any rejected Message headers in the
     * message-attrs map under the key "reject-properties".
     * </p>
     */
    public void setRejectProperties(AmqpMap rejectProperties);

    /**
     * <p>
     * The map supplied in this field will be placed in any rejected Message headers in the
     * message-attrs map under the key "reject-properties".
     * </p>
     */
    public IAmqpMap<AmqpType<?, ?>, AmqpType<?, ?>> getRejectProperties();

    public static class AmqpRejectedBean implements AmqpRejected{

        private AmqpRejectedBuffer buffer;
        private AmqpRejectedBean bean = this;
        private AmqpBoolean truncate;
        private AmqpMap rejectProperties;
        private IAmqpMap<AmqpType<?, ?>, AmqpType<?, ?>> value;

        AmqpRejectedBean() {
            this.value = new IAmqpMap.AmqpWrapperMap<AmqpType<?,?>, AmqpType<?,?>>(new HashMap<AmqpType<?,?>, AmqpType<?,?>>());
        }

        AmqpRejectedBean(IAmqpMap<AmqpType<?, ?>, AmqpType<?, ?>> value) {
            this.value = value;
        }

        AmqpRejectedBean(AmqpRejected.AmqpRejectedBean other) {
            this.bean = other;
        }

        public final AmqpRejectedBean copy() {
            return new AmqpRejected.AmqpRejectedBean(bean);
        }

        public final AmqpRejected.AmqpRejectedBuffer getBuffer(AmqpMarshaller marshaller) throws AmqpEncodingError{
            if(buffer == null) {
                buffer = new AmqpRejectedBuffer(marshaller.encode(this));
            }
            return buffer;
        }

        public final void marshal(DataOutput out, AmqpMarshaller marshaller) throws IOException, AmqpEncodingError{
            getBuffer(marshaller).marshal(out, marshaller);
        }


        public void setTruncate(Boolean truncate) {
            setTruncate(TypeFactory.createAmqpBoolean(truncate));
        }


        public void setTruncate(boolean truncate) {
            setTruncate(TypeFactory.createAmqpBoolean(truncate));
        }


        public final void setTruncate(AmqpBoolean truncate) {
            copyCheck();
            bean.truncate = truncate;
        }

        public final Boolean getTruncate() {
            return bean.truncate.getValue();
        }

        public final void setRejectProperties(AmqpMap rejectProperties) {
            copyCheck();
            bean.rejectProperties = rejectProperties;
        }

        public final IAmqpMap<AmqpType<?, ?>, AmqpType<?, ?>> getRejectProperties() {
            return bean.rejectProperties.getValue();
        }
        public void put(AmqpType<?, ?> key, AmqpType<?, ?> value) {
            copyCheck();
            bean.value.put(key, value);
        }

        public AmqpType<?, ?> get(Object key) {
            return bean.value.get(key);
        }

        public int getEntryCount() {
            return bean.value.getEntryCount();
        }

        public Iterator<Map.Entry<AmqpType<?, ?>, AmqpType<?, ?>>> iterator() {
            return bean.value.iterator();
        }

        public IAmqpMap<AmqpType<?, ?>, AmqpType<?, ?>> getValue() {
            return bean.value;
        }


        private final void copyCheck() {
            if(buffer != null) {;
                throw new IllegalStateException("unwriteable");
            }
            if(bean != this) {;
                copy(bean);
            }
        }

        private final void copy(AmqpRejected.AmqpRejectedBean other) {
            bean = this;
        }

        public boolean equals(Object o){
            if(this == o) {
                return true;
            }

            if(o == null || !(o instanceof AmqpRejected)) {
                return false;
            }

            return equals((AmqpRejected) o);
        }

        public boolean equals(AmqpRejected b) {

            if(b.getTruncate() == null ^ getTruncate() == null) {
                return false;
            }
            if(b.getTruncate() != null && !b.getTruncate().equals(getTruncate())){ 
                return false;
            }

            if(b.getRejectProperties() == null ^ getRejectProperties() == null) {
                return false;
            }
            if(b.getRejectProperties() != null && !b.getRejectProperties().equals(getRejectProperties())){ 
                return false;
            }
            return true;
        }

        public int hashCode() {
            return AbstractAmqpMap.hashCodeFor(this);
        }
    }

    public static class AmqpRejectedBuffer extends AmqpMap.AmqpMapBuffer implements AmqpRejected{

        private AmqpRejectedBean bean;

        protected AmqpRejectedBuffer(Encoded<IAmqpMap<AmqpType<?, ?>, AmqpType<?, ?>>> encoded) {
            super(encoded);
        }

        public void setTruncate(Boolean truncate) {
            bean().setTruncate(truncate);
        }

        public void setTruncate(boolean truncate) {
            bean().setTruncate(truncate);
        }


        public final void setTruncate(AmqpBoolean truncate) {
            bean().setTruncate(truncate);
        }

        public final Boolean getTruncate() {
            return bean().getTruncate();
        }

        public final void setRejectProperties(AmqpMap rejectProperties) {
            bean().setRejectProperties(rejectProperties);
        }

        public final IAmqpMap<AmqpType<?, ?>, AmqpType<?, ?>> getRejectProperties() {
            return bean().getRejectProperties();
        }
        public void put(AmqpType<?, ?> key, AmqpType<?, ?> value) {
            bean().put(key, value);
        }

        public AmqpType<?, ?> get(Object key) {
            return bean().get(key);
        }

        public int getEntryCount() {
            return bean().getEntryCount();
        }

        public Iterator<Map.Entry<AmqpType<?, ?>, AmqpType<?, ?>>> iterator() {
            return bean().iterator();
        }

        public IAmqpMap<AmqpType<?, ?>, AmqpType<?, ?>> getValue() {
            return bean().getValue();
        }

        public AmqpRejected.AmqpRejectedBuffer getBuffer(AmqpMarshaller marshaller) throws AmqpEncodingError{
            return this;
        }

        protected AmqpRejected bean() {
            if(bean == null) {
                bean = new AmqpRejected.AmqpRejectedBean(encoded.getValue());
                bean.buffer = this;
            }
            return bean;
        }

        public boolean equals(Object o){
            return bean().equals(o);
        }

        public boolean equals(AmqpRejected o){
            return bean().equals(o);
        }

        public int hashCode() {
            return bean().hashCode();
        }

        public static AmqpRejected.AmqpRejectedBuffer create(Encoded<IAmqpMap<AmqpType<?, ?>, AmqpType<?, ?>>> encoded) {
            if(encoded.isNull()) {
                return null;
            }
            return new AmqpRejected.AmqpRejectedBuffer(encoded);
        }

        public static AmqpRejected.AmqpRejectedBuffer create(DataInput in, AmqpMarshaller marshaller) throws IOException, AmqpEncodingError {
            return create(marshaller.unmarshalAmqpRejected(in));
        }

        public static AmqpRejected.AmqpRejectedBuffer create(Buffer buffer, int offset, AmqpMarshaller marshaller) throws AmqpEncodingError {
            return create(marshaller.decodeAmqpRejected(buffer, offset));
        }
    }
}