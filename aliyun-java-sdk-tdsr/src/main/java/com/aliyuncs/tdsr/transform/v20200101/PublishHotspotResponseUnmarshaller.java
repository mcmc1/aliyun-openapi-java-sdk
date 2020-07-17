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

package com.aliyuncs.tdsr.transform.v20200101;

import com.aliyuncs.tdsr.model.v20200101.PublishHotspotResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PublishHotspotResponseUnmarshaller {

	public static PublishHotspotResponse unmarshall(PublishHotspotResponse publishHotspotResponse, UnmarshallerContext _ctx) {
		
		publishHotspotResponse.setRequestId(_ctx.stringValue("PublishHotspotResponse.RequestId"));
		publishHotspotResponse.setSuccess(_ctx.booleanValue("PublishHotspotResponse.Success"));
		publishHotspotResponse.setErrMessage(_ctx.stringValue("PublishHotspotResponse.ErrMessage"));
		publishHotspotResponse.setData(_ctx.stringValue("PublishHotspotResponse.Data"));
	 
	 	return publishHotspotResponse;
	}
}