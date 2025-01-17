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
import com.aliyuncs.cr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRepositoryRequest extends RpcAcsRequest<CreateRepositoryResponse> {
	   

	private String repoType;

	private String summary;

	private Boolean tagImmutability;

	private String instanceId;

	private String repoName;

	private String repoNamespaceName;

	private String detail;
	public CreateRepositoryRequest() {
		super("cr", "2018-12-01", "CreateRepository");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRepoType() {
		return this.repoType;
	}

	public void setRepoType(String repoType) {
		this.repoType = repoType;
		if(repoType != null){
			putQueryParameter("RepoType", repoType);
		}
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
		if(summary != null){
			putQueryParameter("Summary", summary);
		}
	}

	public Boolean getTagImmutability() {
		return this.tagImmutability;
	}

	public void setTagImmutability(Boolean tagImmutability) {
		this.tagImmutability = tagImmutability;
		if(tagImmutability != null){
			putQueryParameter("TagImmutability", tagImmutability.toString());
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

	public String getRepoName() {
		return this.repoName;
	}

	public void setRepoName(String repoName) {
		this.repoName = repoName;
		if(repoName != null){
			putQueryParameter("RepoName", repoName);
		}
	}

	public String getRepoNamespaceName() {
		return this.repoNamespaceName;
	}

	public void setRepoNamespaceName(String repoNamespaceName) {
		this.repoNamespaceName = repoNamespaceName;
		if(repoNamespaceName != null){
			putQueryParameter("RepoNamespaceName", repoNamespaceName);
		}
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
		if(detail != null){
			putQueryParameter("Detail", detail);
		}
	}

	@Override
	public Class<CreateRepositoryResponse> getResponseClass() {
		return CreateRepositoryResponse.class;
	}

}
