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
public class OpsGetZoneStockByIdRequest extends RpcAcsRequest<OpsGetZoneStockByIdResponse> {
	   

	private Long zoneNumericId;

	private String auditParamStr;
	public OpsGetZoneStockByIdRequest() {
		super("Ecsops", "2016-04-01", "OpsGetZoneStockById", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getZoneNumericId() {
		return this.zoneNumericId;
	}

	public void setZoneNumericId(Long zoneNumericId) {
		this.zoneNumericId = zoneNumericId;
		if(zoneNumericId != null){
			putQueryParameter("ZoneNumericId", zoneNumericId.toString());
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
	public Class<OpsGetZoneStockByIdResponse> getResponseClass() {
		return OpsGetZoneStockByIdResponse.class;
	}

}
