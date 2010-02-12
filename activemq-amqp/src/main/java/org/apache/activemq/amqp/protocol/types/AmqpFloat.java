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
import java.lang.Float;
import org.apache.activemq.amqp.protocol.marshaller.AmqpEncodingError;
import org.apache.activemq.amqp.protocol.marshaller.AmqpMarshaller;
import org.apache.activemq.amqp.protocol.marshaller.Encoded;
import org.apache.activemq.util.buffer.Buffer;

/**
 * Represents a 32-bit floating point number (IEEE 754-2008 binary32)
 */
public interface AmqpFloat extends AmqpType<AmqpFloat.AmqpFloatBean, AmqpFloat.AmqpFloatBuffer> {


    public Float getValue();

    public static class AmqpFloatBean implements AmqpFloat{

        private AmqpFloatBuffer buffer;
        private AmqpFloatBean bean = this;
        private Float value;

        AmqpFloatBean(Float value) {
            this.value = value;
        }

        AmqpFloatBean(AmqpFloat.AmqpFloatBean other) {
            this.bean = other;
        }

        public final AmqpFloatBean copy() {
            return bean;
        }

        public final AmqpFloat.AmqpFloatBuffer getBuffer(AmqpMarshaller marshaller) throws AmqpEncodingError{
            if(buffer == null) {
                buffer = new AmqpFloatBuffer(marshaller.encode(this));
            }
            return buffer;
        }

        public final void marshal(DataOutput out, AmqpMarshaller marshaller) throws IOException, AmqpEncodingError{
            getBuffer(marshaller).marshal(out, marshaller);
        }


        public Float getValue() {
            return bean.value;
        }


        public boolean equals(Object o){
            if(this == o) {
                return true;
            }

            if(o == null || !(o instanceof AmqpFloat)) {
                return false;
            }

            return equals((AmqpFloat) o);
        }

        public boolean equals(AmqpFloat b) {
            if(b == null) {
                return false;
            }

            if(b.getValue() == null ^ getValue() == null) {
                return false;
            }

            return b.getValue() == null || b.getValue().equals(getValue());
        }

        public int hashCode() {
            if(getValue() == null) {
                return AmqpFloat.AmqpFloatBean.class.hashCode();
            }
            return getValue().hashCode();
        }
    }

    public static class AmqpFloatBuffer implements AmqpFloat, AmqpBuffer< Float> {

        private AmqpFloatBean bean;
        protected Encoded<Float> encoded;

        protected AmqpFloatBuffer() {
        }

        protected AmqpFloatBuffer(Encoded<Float> encoded) {
            this.encoded = encoded;
        }

        public final Encoded<Float> getEncoded() throws AmqpEncodingError{
            return encoded;
        }

        public final void marshal(DataOutput out, AmqpMarshaller marshaller) throws IOException, AmqpEncodingError{
            encoded.marshal(out);
        }

        public Float getValue() {
            return bean().getValue();
        }

        public AmqpFloat.AmqpFloatBuffer getBuffer(AmqpMarshaller marshaller) throws AmqpEncodingError{
            return this;
        }

        protected AmqpFloat bean() {
            if(bean == null) {
                bean = new AmqpFloat.AmqpFloatBean(encoded.getValue());
                bean.buffer = this;
            }
            return bean;
        }

        public boolean equals(Object o){
            return bean().equals(o);
        }

        public boolean equals(AmqpFloat o){
            return bean().equals(o);
        }

        public int hashCode() {
            return bean().hashCode();
        }

        public static AmqpFloat.AmqpFloatBuffer create(Encoded<Float> encoded) {
            if(encoded.isNull()) {
                return null;
            }
            return new AmqpFloat.AmqpFloatBuffer(encoded);
        }

        public static AmqpFloat.AmqpFloatBuffer create(DataInput in, AmqpMarshaller marshaller) throws IOException, AmqpEncodingError {
            return create(marshaller.unmarshalAmqpFloat(in));
        }

        public static AmqpFloat.AmqpFloatBuffer create(Buffer buffer, int offset, AmqpMarshaller marshaller) throws AmqpEncodingError {
            return create(marshaller.decodeAmqpFloat(buffer, offset));
        }
    }
}