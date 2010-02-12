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

import java.math.BigInteger;
import java.util.Date;
import java.util.UUID;
import org.apache.activemq.util.buffer.Buffer;


public class TypeFactory {

    /**
     * Creates a AmqpSessionError
     */
    public static final AmqpSessionError createAmqpSessionError() {
        return new AmqpSessionError.AmqpSessionErrorBean();
    };

    /**
     * Creates a AmqpHandle
     */
    public static final AmqpHandle createAmqpHandle(Long val) {
        return new AmqpHandle.AmqpHandleBean(val);
    }
    /**
     * Creates a AmqpHandle
     */
    public static final AmqpHandle createAmqpHandle(long val) {
        return new AmqpHandle.AmqpHandleBean(val);
    }

    /**
     * Creates a AmqpChar
     */
    public static final AmqpChar createAmqpChar(Integer val) {
        return new AmqpChar.AmqpCharBean(val);
    }
    /**
     * Creates a AmqpChar
     */
    public static final AmqpChar createAmqpChar(int val) {
        return new AmqpChar.AmqpCharBean(val);
    }

    /**
     * Creates a AmqpUnlink
     */
    public static final AmqpUnlink createAmqpUnlink() {
        return new AmqpUnlink.AmqpUnlinkBean();
    };

    /**
     * Creates a AmqpFlow
     */
    public static final AmqpFlow createAmqpFlow() {
        return new AmqpFlow.AmqpFlowBean();
    };

    /**
     * Creates a AmqpLong
     */
    public static final AmqpLong createAmqpLong(Long val) {
        return new AmqpLong.AmqpLongBean(val);
    }
    /**
     * Creates a AmqpLong
     */
    public static final AmqpLong createAmqpLong(long val) {
        return new AmqpLong.AmqpLongBean(val);
    }

    /**
     * Creates a AmqpSequenceNo
     */
    public static final AmqpSequenceNo createAmqpSequenceNo(Long val) {
        return new AmqpSequenceNo.AmqpSequenceNoBean(val);
    }
    /**
     * Creates a AmqpSequenceNo
     */
    public static final AmqpSequenceNo createAmqpSequenceNo(long val) {
        return new AmqpSequenceNo.AmqpSequenceNoBean(val);
    }

    /**
     * Creates a AmqpFloat
     */
    public static final AmqpFloat createAmqpFloat(Float val) {
        return new AmqpFloat.AmqpFloatBean(val);
    }
    /**
     * Creates a AmqpFloat
     */
    public static final AmqpFloat createAmqpFloat(float val) {
        return new AmqpFloat.AmqpFloatBean(val);
    }

    /**
     * Creates a AmqpRelink
     */
    public static final AmqpRelink createAmqpRelink() {
        return new AmqpRelink.AmqpRelinkBean();
    };

    /**
     * Creates a AmqpClose
     */
    public static final AmqpClose createAmqpClose() {
        return new AmqpClose.AmqpCloseBean();
    };

    /**
     * Creates a AmqpOpen
     */
    public static final AmqpOpen createAmqpOpen() {
        return new AmqpOpen.AmqpOpenBean();
    };

    /**
     * Creates a AmqpByte
     */
    public static final AmqpByte createAmqpByte(Byte val) {
        return new AmqpByte.AmqpByteBean(val);
    }
    /**
     * Creates a AmqpByte
     */
    public static final AmqpByte createAmqpByte(byte val) {
        return new AmqpByte.AmqpByteBean(val);
    }

    /**
     * Creates a AmqpRejected
     */
    public static final AmqpRejected createAmqpRejected() {
        return new AmqpRejected.AmqpRejectedBean();
    };

    /**
     * Creates a AmqpSaslOutcome
     */
    public static final AmqpSaslOutcome createAmqpSaslOutcome() {
        return new AmqpSaslOutcome.AmqpSaslOutcomeBean();
    };

    /**
     * Creates a AmqpSessionName
     */
    public static final AmqpSessionName createAmqpSessionName(Buffer val) {
        return new AmqpSessionName.AmqpSessionNameBean(val);
    }

    /**
     * Creates a AmqpBoolean
     */
    public static final AmqpBoolean createAmqpBoolean(Boolean val) {
        return new AmqpBoolean.AmqpBooleanBean(val);
    }
    /**
     * Creates a AmqpBoolean
     */
    public static final AmqpBoolean createAmqpBoolean(boolean val) {
        return new AmqpBoolean.AmqpBooleanBean(val);
    }

    /**
     * Creates a AmqpUlong
     */
    public static final AmqpUlong createAmqpUlong(BigInteger val) {
        return new AmqpUlong.AmqpUlongBean(val);
    }

    /**
     * Creates a AmqpTransfer
     */
    public static final AmqpTransfer createAmqpTransfer() {
        return new AmqpTransfer.AmqpTransferBean();
    };

    /**
     * Creates a AmqpDetach
     */
    public static final AmqpDetach createAmqpDetach() {
        return new AmqpDetach.AmqpDetachBean();
    };

    /**
     * Creates a AmqpSymbol
     */
    public static final AmqpSymbol createAmqpSymbol(String val) {
        return new AmqpSymbol.AmqpSymbolBean(val);
    }

    /**
     * Creates a AmqpSaslInit
     */
    public static final AmqpSaslInit createAmqpSaslInit() {
        return new AmqpSaslInit.AmqpSaslInitBean();
    };

    /**
     * Creates a AmqpInt
     */
    public static final AmqpInt createAmqpInt(Integer val) {
        return new AmqpInt.AmqpIntBean(val);
    }
    /**
     * Creates a AmqpInt
     */
    public static final AmqpInt createAmqpInt(int val) {
        return new AmqpInt.AmqpIntBean(val);
    }

    /**
     * Creates a AmqpDeliveryTag
     */
    public static final AmqpDeliveryTag createAmqpDeliveryTag(Buffer val) {
        return new AmqpDeliveryTag.AmqpDeliveryTagBean(val);
    }

    /**
     * Creates a AmqpEnlist
     */
    public static final AmqpEnlist createAmqpEnlist() {
        return new AmqpEnlist.AmqpEnlistBean();
    };

    /**
     * Creates a AmqpProperties
     */
    public static final AmqpProperties createAmqpProperties() {
        return new AmqpProperties.AmqpPropertiesBean();
    };

    /**
     * Creates a AmqpDouble
     */
    public static final AmqpDouble createAmqpDouble(Double val) {
        return new AmqpDouble.AmqpDoubleBean(val);
    }
    /**
     * Creates a AmqpDouble
     */
    public static final AmqpDouble createAmqpDouble(double val) {
        return new AmqpDouble.AmqpDoubleBean(val);
    }

    /**
     * Creates a AmqpDrain
     */
    public static final AmqpDrain createAmqpDrain() {
        return new AmqpDrain.AmqpDrainBean();
    };

    /**
     * Creates a AmqpHeader
     */
    public static final AmqpHeader createAmqpHeader() {
        return new AmqpHeader.AmqpHeaderBean();
    };

    /**
     * Creates a AmqpMessageAttributes
     */
    public static final AmqpMessageAttributes createAmqpMessageAttributes(IAmqpMap<AmqpType<?, ?>, AmqpType<?, ?>> val) {
        return new AmqpMessageAttributes.AmqpMessageAttributesBean(val);
    }
    /**
     * Creates an empty AmqpMessageAttributes
     */
    public static final AmqpMessageAttributes createAmqpMessageAttributes() {
        return new AmqpMessageAttributes.AmqpMessageAttributesBean();
    }

    /**
     * Creates a AmqpSaslMechanisms
     */
    public static final AmqpSaslMechanisms createAmqpSaslMechanisms() {
        return new AmqpSaslMechanisms.AmqpSaslMechanismsBean();
    };

    /**
     * Creates a AmqpUuid
     */
    public static final AmqpUuid createAmqpUuid(UUID val) {
        return new AmqpUuid.AmqpUuidBean(val);
    }

    /**
     * Creates a AmqpBar
     */
    public static final AmqpBar createAmqpBar() {
        return new AmqpBar.AmqpBarBean();
    };

    /**
     * Creates a AmqpFilter
     */
    public static final AmqpFilter createAmqpFilter() {
        return new AmqpFilter.AmqpFilterBean();
    };

    /**
     * Creates a AmqpBinary
     */
    public static final AmqpBinary createAmqpBinary(Buffer val) {
        return new AmqpBinary.AmqpBinaryBean(val);
    }

    /**
     * Creates a AmqpNoop
     */
    public static final AmqpNoop createAmqpNoop() {
        return new AmqpNoop.AmqpNoopBean();
    };

    /**
     * Creates a AmqpLink
     */
    public static final AmqpLink createAmqpLink() {
        return new AmqpLink.AmqpLinkBean();
    };

    /**
     * Creates a AmqpTimestamp
     */
    public static final AmqpTimestamp createAmqpTimestamp(Date val) {
        return new AmqpTimestamp.AmqpTimestampBean(val);
    }

    /**
     * Creates a AmqpShort
     */
    public static final AmqpShort createAmqpShort(Short val) {
        return new AmqpShort.AmqpShortBean(val);
    }
    /**
     * Creates a AmqpShort
     */
    public static final AmqpShort createAmqpShort(short val) {
        return new AmqpShort.AmqpShortBean(val);
    }

    /**
     * Creates a AmqpReleased
     */
    public static final AmqpReleased createAmqpReleased() {
        return new AmqpReleased.AmqpReleasedBean();
    };

    /**
     * Creates a AmqpTxn
     */
    public static final AmqpTxn createAmqpTxn() {
        return new AmqpTxn.AmqpTxnBean();
    };

    /**
     * Creates a AmqpMap
     */
    public static final AmqpMap createAmqpMap(IAmqpMap<AmqpType<?, ?>, AmqpType<?, ?>> val) {
        return new AmqpMap.AmqpMapBean(val);
    }
    /**
     * Creates an empty AmqpMap
     */
    public static final AmqpMap createAmqpMap() {
        return new AmqpMap.AmqpMapBean();
    }

    /**
     * Creates a AmqpLinkError
     */
    public static final AmqpLinkError createAmqpLinkError() {
        return new AmqpLinkError.AmqpLinkErrorBean();
    };

    /**
     * Creates a AmqpConnectionError
     */
    public static final AmqpConnectionError createAmqpConnectionError() {
        return new AmqpConnectionError.AmqpConnectionErrorBean();
    };

    /**
     * Creates a AmqpSaslResponse
     */
    public static final AmqpSaslResponse createAmqpSaslResponse() {
        return new AmqpSaslResponse.AmqpSaslResponseBean();
    };

    /**
     * Creates a AmqpFragment
     */
    public static final AmqpFragment createAmqpFragment() {
        return new AmqpFragment.AmqpFragmentBean();
    };

    /**
     * Creates a AmqpDisposition
     */
    public static final AmqpDisposition createAmqpDisposition() {
        return new AmqpDisposition.AmqpDispositionBean();
    };

    /**
     * Creates a AmqpNull
     */
    public static final AmqpNull createAmqpNull(Object val) {
        return new AmqpNull.AmqpNullBean(val);
    }

    /**
     * Creates a AmqpOptions
     */
    public static final AmqpOptions createAmqpOptions(IAmqpMap<AmqpType<?, ?>, AmqpType<?, ?>> val) {
        return new AmqpOptions.AmqpOptionsBean(val);
    }
    /**
     * Creates an empty AmqpOptions
     */
    public static final AmqpOptions createAmqpOptions() {
        return new AmqpOptions.AmqpOptionsBean();
    }

    /**
     * Creates a AmqpCompleted
     */
    public static final AmqpCompleted createAmqpCompleted() {
        return new AmqpCompleted.AmqpCompletedBean();
    };

    /**
     * Creates a AmqpXid
     */
    public static final AmqpXid createAmqpXid() {
        return new AmqpXid.AmqpXidBean();
    };

    /**
     * Creates a AmqpList
     */
    public static final AmqpList createAmqpList(IAmqpList val) {
        return new AmqpList.AmqpListBean(val);
    }
    /**
     * Creates an empty AmqpList
     */
    public static final AmqpList createAmqpList() {
        return new AmqpList.AmqpListBean();
    }

    /**
     * Creates a AmqpUshort
     */
    public static final AmqpUshort createAmqpUshort(Integer val) {
        return new AmqpUshort.AmqpUshortBean(val);
    }
    /**
     * Creates a AmqpUshort
     */
    public static final AmqpUshort createAmqpUshort(int val) {
        return new AmqpUshort.AmqpUshortBean(val);
    }

    /**
     * Creates a AmqpFooter
     */
    public static final AmqpFooter createAmqpFooter() {
        return new AmqpFooter.AmqpFooterBean();
    };

    /**
     * Creates a AmqpSource
     */
    public static final AmqpSource createAmqpSource() {
        return new AmqpSource.AmqpSourceBean();
    };

    /**
     * Creates a AmqpSaslChallenge
     */
    public static final AmqpSaslChallenge createAmqpSaslChallenge() {
        return new AmqpSaslChallenge.AmqpSaslChallengeBean();
    };

    /**
     * Creates a AmqpAddress
     */
    public static final AmqpAddress createAmqpAddress(Buffer val) {
        return new AmqpAddress.AmqpAddressBean(val);
    }

    /**
     * Creates a AmqpAttach
     */
    public static final AmqpAttach createAmqpAttach() {
        return new AmqpAttach.AmqpAttachBean();
    };

    /**
     * Creates a AmqpString
     */
    public static final AmqpString createAmqpString(String val) {
        return new AmqpString.AmqpStringBean(val);
    }

    /**
     * Creates a AmqpTarget
     */
    public static final AmqpTarget createAmqpTarget() {
        return new AmqpTarget.AmqpTargetBean();
    };

    /**
     * Creates a AmqpFilterSet
     */
    public static final AmqpFilterSet createAmqpFilterSet(IAmqpMap<AmqpType<?, ?>, AmqpType<?, ?>> val) {
        return new AmqpFilterSet.AmqpFilterSetBean(val);
    }
    /**
     * Creates an empty AmqpFilterSet
     */
    public static final AmqpFilterSet createAmqpFilterSet() {
        return new AmqpFilterSet.AmqpFilterSetBean();
    }

    /**
     * Creates a AmqpUbyte
     */
    public static final AmqpUbyte createAmqpUbyte(Short val) {
        return new AmqpUbyte.AmqpUbyteBean(val);
    }
    /**
     * Creates a AmqpUbyte
     */
    public static final AmqpUbyte createAmqpUbyte(short val) {
        return new AmqpUbyte.AmqpUbyteBean(val);
    }

    /**
     * Creates a AmqpUint
     */
    public static final AmqpUint createAmqpUint(Long val) {
        return new AmqpUint.AmqpUintBean(val);
    }
    /**
     * Creates a AmqpUint
     */
    public static final AmqpUint createAmqpUint(long val) {
        return new AmqpUint.AmqpUintBean(val);
    }
}
