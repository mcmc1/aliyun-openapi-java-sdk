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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeSagTrafficTopNResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSagTrafficTopNResponse.TrafficTopNItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSagTrafficTopNResponseUnmarshaller {

	public static DescribeSagTrafficTopNResponse unmarshall(DescribeSagTrafficTopNResponse describeSagTrafficTopNResponse, UnmarshallerContext _ctx) {
		
		describeSagTrafficTopNResponse.setRequestId(_ctx.stringValue("DescribeSagTrafficTopNResponse.RequestId"));

		List<TrafficTopNItem> trafficTopN = new ArrayList<TrafficTopNItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagTrafficTopNResponse.TrafficTopN.Length"); i++) {
			TrafficTopNItem trafficTopNItem = new TrafficTopNItem();
			trafficTopNItem.setInstanceId(_ctx.stringValue("DescribeSagTrafficTopNResponse.TrafficTopN["+ i +"].InstanceId"));
			trafficTopNItem.setTrafficRate(_ctx.stringValue("DescribeSagTrafficTopNResponse.TrafficTopN["+ i +"].TrafficRate"));
			trafficTopNItem.setName(_ctx.stringValue("DescribeSagTrafficTopNResponse.TrafficTopN["+ i +"].Name"));
			trafficTopNItem.setRegionId(_ctx.stringValue("DescribeSagTrafficTopNResponse.TrafficTopN["+ i +"].RegionId"));

			trafficTopN.add(trafficTopNItem);
		}
		describeSagTrafficTopNResponse.setTrafficTopN(trafficTopN);
	 
	 	return describeSagTrafficTopNResponse;
	}
}