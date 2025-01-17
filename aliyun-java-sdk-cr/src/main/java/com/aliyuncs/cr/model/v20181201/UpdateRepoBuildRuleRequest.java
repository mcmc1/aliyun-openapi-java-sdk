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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateRepoBuildRuleRequest extends RpcAcsRequest<UpdateRepoBuildRuleResponse> {
	   

	private String repoId;

	private String pushName;

	private String dockerfileName;

	private String buildRuleId;

	private List<String> platformss;

	private String imageTag;

	private String dockerfileLocation;

	private String instanceId;

	private String pushType;
	public UpdateRepoBuildRuleRequest() {
		super("cr", "2018-12-01", "UpdateRepoBuildRule");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRepoId() {
		return this.repoId;
	}

	public void setRepoId(String repoId) {
		this.repoId = repoId;
		if(repoId != null){
			putQueryParameter("RepoId", repoId);
		}
	}

	public String getPushName() {
		return this.pushName;
	}

	public void setPushName(String pushName) {
		this.pushName = pushName;
		if(pushName != null){
			putQueryParameter("PushName", pushName);
		}
	}

	public String getDockerfileName() {
		return this.dockerfileName;
	}

	public void setDockerfileName(String dockerfileName) {
		this.dockerfileName = dockerfileName;
		if(dockerfileName != null){
			putQueryParameter("DockerfileName", dockerfileName);
		}
	}

	public String getBuildRuleId() {
		return this.buildRuleId;
	}

	public void setBuildRuleId(String buildRuleId) {
		this.buildRuleId = buildRuleId;
		if(buildRuleId != null){
			putQueryParameter("BuildRuleId", buildRuleId);
		}
	}

	public List<String> getPlatformss() {
		return this.platformss;
	}

	public void setPlatformss(List<String> platformss) {
		this.platformss = platformss;	
		if (platformss != null) {
			for (int i = 0; i < platformss.size(); i++) {
				putQueryParameter("Platforms." + (i + 1) , platformss.get(i));
			}
		}	
	}

	public String getImageTag() {
		return this.imageTag;
	}

	public void setImageTag(String imageTag) {
		this.imageTag = imageTag;
		if(imageTag != null){
			putQueryParameter("ImageTag", imageTag);
		}
	}

	public String getDockerfileLocation() {
		return this.dockerfileLocation;
	}

	public void setDockerfileLocation(String dockerfileLocation) {
		this.dockerfileLocation = dockerfileLocation;
		if(dockerfileLocation != null){
			putQueryParameter("DockerfileLocation", dockerfileLocation);
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

	public String getPushType() {
		return this.pushType;
	}

	public void setPushType(String pushType) {
		this.pushType = pushType;
		if(pushType != null){
			putQueryParameter("PushType", pushType);
		}
	}

	@Override
	public Class<UpdateRepoBuildRuleResponse> getResponseClass() {
		return UpdateRepoBuildRuleResponse.class;
	}

}
