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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateOrUpdateContactGroupRequest extends RpcAcsRequest<CreateOrUpdateContactGroupResponse> {
	   

	private Long contactGroupId;

	private String contactGroupName;

	private String contactIds;
	public CreateOrUpdateContactGroupRequest() {
		super("ARMS", "2019-08-08", "CreateOrUpdateContactGroup");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getContactGroupId() {
		return this.contactGroupId;
	}

	public void setContactGroupId(Long contactGroupId) {
		this.contactGroupId = contactGroupId;
		if(contactGroupId != null){
			putBodyParameter("ContactGroupId", contactGroupId.toString());
		}
	}

	public String getContactGroupName() {
		return this.contactGroupName;
	}

	public void setContactGroupName(String contactGroupName) {
		this.contactGroupName = contactGroupName;
		if(contactGroupName != null){
			putBodyParameter("ContactGroupName", contactGroupName);
		}
	}

	public String getContactIds() {
		return this.contactIds;
	}

	public void setContactIds(String contactIds) {
		this.contactIds = contactIds;
		if(contactIds != null){
			putBodyParameter("ContactIds", contactIds);
		}
	}

	@Override
	public Class<CreateOrUpdateContactGroupResponse> getResponseClass() {
		return CreateOrUpdateContactGroupResponse.class;
	}

}
