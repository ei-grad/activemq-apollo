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
package org.apache.activemq.apollo.broker;

import java.io.IOException;

import javax.transaction.xa.XAException;

import org.apache.activemq.queue.IQueue;

/**
 * LocalTransaction
 * <p>
 * Description:
 * </p>
 * 
 * @author cmacnaug
 * @version 1.0
 */
public class LocalTransaction extends Transaction {

    LocalTransaction(TransactionManager manager, long tid, IQueue<Long, TxOp> opQueue) {
        super(manager, tid, opQueue);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.apache.activemq.apollo.broker.Transaction#commit(boolean)
     */
    @Override
    public void commit(boolean onePhase, TransactionListener listener) throws XAException, IOException {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.apache.activemq.apollo.broker.Transaction#prepare()
     */
    @Override
    public int prepare(TransactionListener listener) throws XAException, IOException {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.apache.activemq.apollo.broker.Transaction#rollback()
     */
    @Override
    public void rollback(TransactionListener listener) throws XAException, IOException {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.apache.activemq.apollo.broker.Transaction#getType()
     */
    @Override
    public byte getType() {
        return TYPE_LOCAL;
    }

}
