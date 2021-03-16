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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsPreserveHouyiDiskRequest extends RpcAcsRequest<OpsPreserveHouyiDiskResponse> {
	   

	private String houyiDiskId;

	private Integer preserveHour;

	private Long aliUid;

	private String auditParamStr;
	public OpsPreserveHouyiDiskRequest() {
		super("Ecsops", "2016-04-01", "OpsPreserveHouyiDisk", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHouyiDiskId() {
		return this.houyiDiskId;
	}

	public void setHouyiDiskId(String houyiDiskId) {
		this.houyiDiskId = houyiDiskId;
		if(houyiDiskId != null){
			putQueryParameter("HouyiDiskId", houyiDiskId);
		}
	}

	public Integer getPreserveHour() {
		return this.preserveHour;
	}

	public void setPreserveHour(Integer preserveHour) {
		this.preserveHour = preserveHour;
		if(preserveHour != null){
			putQueryParameter("PreserveHour", preserveHour.toString());
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsPreserveHouyiDiskResponse> getResponseClass() {
		return OpsPreserveHouyiDiskResponse.class;
	}

}
