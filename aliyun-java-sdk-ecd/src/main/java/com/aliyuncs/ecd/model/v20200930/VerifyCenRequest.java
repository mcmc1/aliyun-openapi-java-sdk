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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class VerifyCenRequest extends RpcAcsRequest<VerifyCenResponse> {
	   

	private String cenId;

	private Long cenOwnerId;

	private String verifyCode;

	private String cidrBlock;
	public VerifyCenRequest() {
		super("ecd", "2020-09-30", "VerifyCen");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
		if(cenId != null){
			putQueryParameter("CenId", cenId);
		}
	}

	public Long getCenOwnerId() {
		return this.cenOwnerId;
	}

	public void setCenOwnerId(Long cenOwnerId) {
		this.cenOwnerId = cenOwnerId;
		if(cenOwnerId != null){
			putQueryParameter("CenOwnerId", cenOwnerId.toString());
		}
	}

	public String getVerifyCode() {
		return this.verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
		if(verifyCode != null){
			putQueryParameter("VerifyCode", verifyCode);
		}
	}

	public String getCidrBlock() {
		return this.cidrBlock;
	}

	public void setCidrBlock(String cidrBlock) {
		this.cidrBlock = cidrBlock;
		if(cidrBlock != null){
			putQueryParameter("CidrBlock", cidrBlock);
		}
	}

	@Override
	public Class<VerifyCenResponse> getResponseClass() {
		return VerifyCenResponse.class;
	}

}
