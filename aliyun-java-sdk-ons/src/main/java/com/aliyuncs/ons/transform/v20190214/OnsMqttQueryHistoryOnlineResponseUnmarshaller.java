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

package com.aliyuncs.ons.transform.v20190214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20190214.OnsMqttQueryHistoryOnlineResponse;
import com.aliyuncs.ons.model.v20190214.OnsMqttQueryHistoryOnlineResponse.Data;
import com.aliyuncs.ons.model.v20190214.OnsMqttQueryHistoryOnlineResponse.Data.StatsDataDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsMqttQueryHistoryOnlineResponseUnmarshaller {

	public static OnsMqttQueryHistoryOnlineResponse unmarshall(OnsMqttQueryHistoryOnlineResponse onsMqttQueryHistoryOnlineResponse, UnmarshallerContext _ctx) {
		
		onsMqttQueryHistoryOnlineResponse.setRequestId(_ctx.stringValue("OnsMqttQueryHistoryOnlineResponse.RequestId"));
		onsMqttQueryHistoryOnlineResponse.setHelpUrl(_ctx.stringValue("OnsMqttQueryHistoryOnlineResponse.HelpUrl"));

		Data data = new Data();
		data.setXUnit(_ctx.stringValue("OnsMqttQueryHistoryOnlineResponse.Data.XUnit"));
		data.setYUnit(_ctx.stringValue("OnsMqttQueryHistoryOnlineResponse.Data.YUnit"));
		data.setTitle(_ctx.stringValue("OnsMqttQueryHistoryOnlineResponse.Data.Title"));

		List<StatsDataDo> records = new ArrayList<StatsDataDo>();
		for (int i = 0; i < _ctx.lengthValue("OnsMqttQueryHistoryOnlineResponse.Data.Records.Length"); i++) {
			StatsDataDo statsDataDo = new StatsDataDo();
			statsDataDo.setY(_ctx.floatValue("OnsMqttQueryHistoryOnlineResponse.Data.Records["+ i +"].Y"));
			statsDataDo.setX(_ctx.longValue("OnsMqttQueryHistoryOnlineResponse.Data.Records["+ i +"].X"));

			records.add(statsDataDo);
		}
		data.setRecords(records);
		onsMqttQueryHistoryOnlineResponse.setData(data);
	 
	 	return onsMqttQueryHistoryOnlineResponse;
	}
}