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
public class OpsQueryUserGrayBusinessRequest extends RpcAcsRequest<OpsQueryUserGrayBusinessResponse> {
	   

	private String grayRegionId;

	private String operator;

	private String grayBizType;

	private Long aliUid;

	private String auditParamStr;

	private Integer status;
	public OpsQueryUserGrayBusinessRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryUserGrayBusiness", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGrayRegionId() {
		return this.grayRegionId;
	}

	public void setGrayRegionId(String grayRegionId) {
		this.grayRegionId = grayRegionId;
		if(grayRegionId != null){
			putQueryParameter("GrayRegionId", grayRegionId);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public String getGrayBizType() {
		return this.grayBizType;
	}

	public void setGrayBizType(String grayBizType) {
		this.grayBizType = grayBizType;
		if(grayBizType != null){
			putQueryParameter("GrayBizType", grayBizType);
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

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<OpsQueryUserGrayBusinessResponse> getResponseClass() {
		return OpsQueryUserGrayBusinessResponse.class;
	}

}
