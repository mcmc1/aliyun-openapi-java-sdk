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

package com.aliyuncs.cms.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeHostAvailabilityListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHostAvailabilityListResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Integer total;

	private Boolean success;

	private List<NodeTaskConfig> taskList;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<NodeTaskConfig> getTaskList() {
		return this.taskList;
	}

	public void setTaskList(List<NodeTaskConfig> taskList) {
		this.taskList = taskList;
	}

	public static class NodeTaskConfig {

		private String taskType;

		private String groupName;

		private Long groupId;

		private String taskName;

		private Boolean disabled;

		private String taskScope;

		private Long id;

		private List<String> instances;

		private TaskOption taskOption;

		private AlertConfig alertConfig;

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public Boolean getDisabled() {
			return this.disabled;
		}

		public void setDisabled(Boolean disabled) {
			this.disabled = disabled;
		}

		public String getTaskScope() {
			return this.taskScope;
		}

		public void setTaskScope(String taskScope) {
			this.taskScope = taskScope;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public List<String> getInstances() {
			return this.instances;
		}

		public void setInstances(List<String> instances) {
			this.instances = instances;
		}

		public TaskOption getTaskOption() {
			return this.taskOption;
		}

		public void setTaskOption(TaskOption taskOption) {
			this.taskOption = taskOption;
		}

		public AlertConfig getAlertConfig() {
			return this.alertConfig;
		}

		public void setAlertConfig(AlertConfig alertConfig) {
			this.alertConfig = alertConfig;
		}

		public static class TaskOption {

			private String httpMethod;

			private Integer interval;

			private String httpURI;

			private String telnetOrPingHost;

			private String httpResponseCharset;

			private String httpPostContent;

			private Boolean httpNegative;

			private String httpKeyword;

			public String getHttpMethod() {
				return this.httpMethod;
			}

			public void setHttpMethod(String httpMethod) {
				this.httpMethod = httpMethod;
			}

			public Integer getInterval() {
				return this.interval;
			}

			public void setInterval(Integer interval) {
				this.interval = interval;
			}

			public String getHttpURI() {
				return this.httpURI;
			}

			public void setHttpURI(String httpURI) {
				this.httpURI = httpURI;
			}

			public String getTelnetOrPingHost() {
				return this.telnetOrPingHost;
			}

			public void setTelnetOrPingHost(String telnetOrPingHost) {
				this.telnetOrPingHost = telnetOrPingHost;
			}

			public String getHttpResponseCharset() {
				return this.httpResponseCharset;
			}

			public void setHttpResponseCharset(String httpResponseCharset) {
				this.httpResponseCharset = httpResponseCharset;
			}

			public String getHttpPostContent() {
				return this.httpPostContent;
			}

			public void setHttpPostContent(String httpPostContent) {
				this.httpPostContent = httpPostContent;
			}

			public Boolean getHttpNegative() {
				return this.httpNegative;
			}

			public void setHttpNegative(Boolean httpNegative) {
				this.httpNegative = httpNegative;
			}

			public String getHttpKeyword() {
				return this.httpKeyword;
			}

			public void setHttpKeyword(String httpKeyword) {
				this.httpKeyword = httpKeyword;
			}
		}

		public static class AlertConfig {

			private Integer silenceTime;

			private Integer endTime;

			private Integer startTime;

			private String webHook;

			private Integer notifyType;

			private List<EscalationListItem> escalationList;

			public Integer getSilenceTime() {
				return this.silenceTime;
			}

			public void setSilenceTime(Integer silenceTime) {
				this.silenceTime = silenceTime;
			}

			public Integer getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Integer endTime) {
				this.endTime = endTime;
			}

			public Integer getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Integer startTime) {
				this.startTime = startTime;
			}

			public String getWebHook() {
				return this.webHook;
			}

			public void setWebHook(String webHook) {
				this.webHook = webHook;
			}

			public Integer getNotifyType() {
				return this.notifyType;
			}

			public void setNotifyType(Integer notifyType) {
				this.notifyType = notifyType;
			}

			public List<EscalationListItem> getEscalationList() {
				return this.escalationList;
			}

			public void setEscalationList(List<EscalationListItem> escalationList) {
				this.escalationList = escalationList;
			}

			public static class EscalationListItem {

				private String value;

				private String metricName;

				private String operator;

				private String times;

				private String aggregate;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getMetricName() {
					return this.metricName;
				}

				public void setMetricName(String metricName) {
					this.metricName = metricName;
				}

				public String getOperator() {
					return this.operator;
				}

				public void setOperator(String operator) {
					this.operator = operator;
				}

				public String getTimes() {
					return this.times;
				}

				public void setTimes(String times) {
					this.times = times;
				}

				public String getAggregate() {
					return this.aggregate;
				}

				public void setAggregate(String aggregate) {
					this.aggregate = aggregate;
				}
			}
		}
	}

	@Override
	public DescribeHostAvailabilityListResponse getInstance(UnmarshallerContext context) {
		return	DescribeHostAvailabilityListResponseUnmarshaller.unmarshall(this, context);
	}
}
