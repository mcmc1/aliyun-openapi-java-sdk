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

import com.aliyuncs.ons.model.v20190214.OnsMqttQueryClientByGroupIdResponse;
import com.aliyuncs.ons.model.v20190214.OnsMqttQueryClientByGroupIdResponse.MqttClientSetDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsMqttQueryClientByGroupIdResponseUnmarshaller {

	public static OnsMqttQueryClientByGroupIdResponse unmarshall(OnsMqttQueryClientByGroupIdResponse onsMqttQueryClientByGroupIdResponse, UnmarshallerContext _ctx) {
		
		onsMqttQueryClientByGroupIdResponse.setRequestId(_ctx.stringValue("OnsMqttQueryClientByGroupIdResponse.RequestId"));
		onsMqttQueryClientByGroupIdResponse.setHelpUrl(_ctx.stringValue("OnsMqttQueryClientByGroupIdResponse.HelpUrl"));

		MqttClientSetDo mqttClientSetDo = new MqttClientSetDo();
		mqttClientSetDo.setPersistCount(_ctx.longValue("OnsMqttQueryClientByGroupIdResponse.MqttClientSetDo.PersistCount"));
		mqttClientSetDo.setOnlineCount(_ctx.longValue("OnsMqttQueryClientByGroupIdResponse.MqttClientSetDo.OnlineCount"));
		onsMqttQueryClientByGroupIdResponse.setMqttClientSetDo(mqttClientSetDo);
	 
	 	return onsMqttQueryClientByGroupIdResponse;
	}
}