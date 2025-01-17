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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.SubscribeTopicResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubscribeTopicResponseUnmarshaller {

	public static SubscribeTopicResponse unmarshall(SubscribeTopicResponse subscribeTopicResponse, UnmarshallerContext _ctx) {
		
		subscribeTopicResponse.setRequestId(_ctx.stringValue("SubscribeTopicResponse.RequestId"));
		subscribeTopicResponse.setSuccess(_ctx.booleanValue("SubscribeTopicResponse.Success"));
		subscribeTopicResponse.setCode(_ctx.stringValue("SubscribeTopicResponse.Code"));
		subscribeTopicResponse.setErrorMessage(_ctx.stringValue("SubscribeTopicResponse.ErrorMessage"));

		List<String> failureTopics = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SubscribeTopicResponse.FailureTopics.Length"); i++) {
			failureTopics.add(_ctx.stringValue("SubscribeTopicResponse.FailureTopics["+ i +"]"));
		}
		subscribeTopicResponse.setFailureTopics(failureTopics);
	 
	 	return subscribeTopicResponse;
	}
}