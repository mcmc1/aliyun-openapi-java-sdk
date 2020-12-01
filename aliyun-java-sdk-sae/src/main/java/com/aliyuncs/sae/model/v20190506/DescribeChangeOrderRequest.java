/*
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

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sae.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeChangeOrderRequest extends RoaAcsRequest<DescribeChangeOrderResponse> {
	   

	private String changeOrderId;
	public DescribeChangeOrderRequest() {
		super("sae", "2019-05-06", "DescribeChangeOrder");
		setUriPattern("/pop/v1/sam/changeorder/DescribeChangeOrder");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getChangeOrderId() {
		return this.changeOrderId;
	}

	public void setChangeOrderId(String changeOrderId) {
		this.changeOrderId = changeOrderId;
		if(changeOrderId != null){
			putQueryParameter("ChangeOrderId", changeOrderId);
		}
	}

	@Override
	public Class<DescribeChangeOrderResponse> getResponseClass() {
		return DescribeChangeOrderResponse.class;
	}

}
