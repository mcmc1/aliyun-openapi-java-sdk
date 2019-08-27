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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.PlanHostNameResponse;
import com.aliyuncs.emr.model.v20160408.PlanHostNameResponse.HostInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class PlanHostNameResponseUnmarshaller {

	public static PlanHostNameResponse unmarshall(PlanHostNameResponse planHostNameResponse, UnmarshallerContext _ctx) {
		
		planHostNameResponse.setRequestId(_ctx.stringValue("PlanHostNameResponse.RequestId"));

		List<HostInfo> hostInfoList = new ArrayList<HostInfo>();
		for (int i = 0; i < _ctx.lengthValue("PlanHostNameResponse.HostInfoList.Length"); i++) {
			HostInfo hostInfo = new HostInfo();
			hostInfo.setHpHostBizId(_ctx.stringValue("PlanHostNameResponse.HostInfoList["+ i +"].HpHostBizId"));
			hostInfo.setHostName(_ctx.stringValue("PlanHostNameResponse.HostInfoList["+ i +"].HostName"));

			hostInfoList.add(hostInfo);
		}
		planHostNameResponse.setHostInfoList(hostInfoList);
	 
	 	return planHostNameResponse;
	}
}