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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsModifyImageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsModifyImageResponseUnmarshaller {

	public static OpsModifyImageResponse unmarshall(OpsModifyImageResponse opsModifyImageResponse, UnmarshallerContext _ctx) {
		
		opsModifyImageResponse.setRequestId(_ctx.stringValue("OpsModifyImageResponse.RequestId"));
	 
	 	return opsModifyImageResponse;
	}
}