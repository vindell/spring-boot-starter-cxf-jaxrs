/*
 * Copyright (c) 2018, vindell (https://github.com/vindell).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.cxf.spring.boot.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
  
@Path(value = "/customer3")     
//@Produces("*/*")    
@Produces("application/xml")    
//@Produces("application/json")    
public interface CustomerService3 {    
	
    @GET    
    @Path(value = "/{id}/info")    
    Customer findCustomerById(@PathParam("id")String id);    
        
    @GET    
    @Path(value = "/search")    
    Customer findCustomerByName(@QueryParam("name")String name);    
}    