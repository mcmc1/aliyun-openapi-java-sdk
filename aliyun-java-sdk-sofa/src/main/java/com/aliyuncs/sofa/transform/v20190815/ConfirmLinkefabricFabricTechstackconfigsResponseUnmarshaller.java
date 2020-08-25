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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.ConfirmLinkefabricFabricTechstackconfigsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfirmLinkefabricFabricTechstackconfigsResponseUnmarshaller {

	public static ConfirmLinkefabricFabricTechstackconfigsResponse unmarshall(ConfirmLinkefabricFabricTechstackconfigsResponse confirmLinkefabricFabricTechstackconfigsResponse, UnmarshallerContext _ctx) {
		
		confirmLinkefabricFabricTechstackconfigsResponse.setRequestId(_ctx.stringValue("ConfirmLinkefabricFabricTechstackconfigsResponse.RequestId"));
		confirmLinkefabricFabricTechstackconfigsResponse.setResultCode(_ctx.stringValue("ConfirmLinkefabricFabricTechstackconfigsResponse.ResultCode"));
		confirmLinkefabricFabricTechstackconfigsResponse.setResultMessage(_ctx.stringValue("ConfirmLinkefabricFabricTechstackconfigsResponse.ResultMessage"));
		confirmLinkefabricFabricTechstackconfigsResponse.setData(_ctx.stringValue("ConfirmLinkefabricFabricTechstackconfigsResponse.Data"));
		confirmLinkefabricFabricTechstackconfigsResponse.setMessage(_ctx.stringValue("ConfirmLinkefabricFabricTechstackconfigsResponse.Message"));
		confirmLinkefabricFabricTechstackconfigsResponse.setResponseStatusCode(_ctx.longValue("ConfirmLinkefabricFabricTechstackconfigsResponse.ResponseStatusCode"));
		confirmLinkefabricFabricTechstackconfigsResponse.setSuccess(_ctx.booleanValue("ConfirmLinkefabricFabricTechstackconfigsResponse.Success"));
	 
	 	return confirmLinkefabricFabricTechstackconfigsResponse;
	}
}