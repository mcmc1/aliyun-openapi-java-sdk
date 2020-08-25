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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidRequest extends RpcAcsRequest<UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse> {
	   

	private String suiteId;

	private String projectId;

	private String requestGitOperate;

	private String updateDTOJsonStr;
	public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteid", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSuiteId() {
		return this.suiteId;
	}

	public void setSuiteId(String suiteId) {
		this.suiteId = suiteId;
		if(suiteId != null){
			putBodyParameter("SuiteId", suiteId);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public String getRequestGitOperate() {
		return this.requestGitOperate;
	}

	public void setRequestGitOperate(String requestGitOperate) {
		this.requestGitOperate = requestGitOperate;
		if(requestGitOperate != null){
			putBodyParameter("RequestGitOperate", requestGitOperate);
		}
	}

	public String getUpdateDTOJsonStr() {
		return this.updateDTOJsonStr;
	}

	public void setUpdateDTOJsonStr(String updateDTOJsonStr) {
		this.updateDTOJsonStr = updateDTOJsonStr;
		if(updateDTOJsonStr != null){
			putBodyParameter("UpdateDTOJsonStr", updateDTOJsonStr);
		}
	}

	@Override
	public Class<UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse> getResponseClass() {
		return UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse.class;
	}

}