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
package org.apache.activemq.apollo.web.resources

import javax.ws.rs._
import core.Response
import Response.Status._
import org.apache.activemq.apollo.broker.ConfigStore
import org.apache.activemq.apollo.dto.{XmlCodec, BrokerDTO, ValueDTO}
import org.fusesource.hawtbuf._
import com.sun.jersey.api.view.ImplicitProduces

case class EditConfig(config:String)

/**
 * A broker resource is used to represent the configuration of a broker.
 */
case class ConfigurationResource(parent:BrokerResource, dto:BrokerDTO) extends Resource(parent) {

  lazy val store = {
    val rc = ConfigStore()
    if( rc !=null && rc.can_write ) {
      rc
    } else {
      None
    }.getOrElse(result(NOT_FOUND))
  }

  @GET
  @Produces(Array("text/plain"))
  def get() = store.read

  @PUT
  def put( config:String):Unit = {
    store.write(config)
  }

  @POST
  def edit_post(@FormParam("config") config:String) = {
    put(config)
    result(uri_info.getAbsolutePathBuilder().build())
  }

  @GET
  @Produces(Array("text/html"))
  def edit_html() = {
    EditConfig(store.read)
  }

  @GET
  @Path("runtime")
  @Produces(Array("application/json", "application/xml","text/xml"))
  def runtime = {

    // Encode/Decode the runtime config so that we can get a copy that
    // we can modify..
    val baos = new ByteArrayOutputStream
    XmlCodec.encode(dto, baos, false)
    val copy = XmlCodec.decode(classOf[BrokerDTO], new ByteArrayInputStream(baos.toBuffer))

    // Scrub out the passwords to avoid a security leak.
    if( copy.key_storage !=null ) {
      copy.key_storage.password = null
      copy.key_storage.key_password = null
    }

    copy
  }

}
