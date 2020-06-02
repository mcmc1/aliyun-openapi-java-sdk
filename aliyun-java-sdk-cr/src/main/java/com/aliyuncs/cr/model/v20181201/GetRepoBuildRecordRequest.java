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

package com.aliyuncs.cr.model.v20181201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetRepoBuildRecordRequest extends RpcAcsRequest<GetRepoBuildRecordResponse> {
	   

	private String buildRecordId;

	private String instanceId;
	public GetRepoBuildRecordRequest() {
		super("cr", "2018-12-01", "GetRepoBuildRecord", "acr");
		setMethod(MethodType.POST);
	}

	public String getBuildRecordId() {
		return this.buildRecordId;
	}

	public void setBuildRecordId(String buildRecordId) {
		this.buildRecordId = buildRecordId;
		if(buildRecordId != null){
			putQueryParameter("BuildRecordId", buildRecordId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<GetRepoBuildRecordResponse> getResponseClass() {
		return GetRepoBuildRecordResponse.class;
	}

}
