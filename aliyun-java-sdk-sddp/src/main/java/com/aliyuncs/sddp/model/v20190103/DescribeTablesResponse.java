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

package com.aliyuncs.sddp.model.v20190103;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sddp.transform.v20190103.DescribeTablesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTablesResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalCount;

	private List<Table> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Table> getItems() {
		return this.items;
	}

	public void setItems(List<Table> items) {
		this.items = items;
	}

	public static class Table {

		private Long id;

		private String name;

		private String owner;

		private Long creationTime;

		private String productId;

		private String productCode;

		private Boolean sensitive;

		private Long riskLevelId;

		private String riskLevelName;

		private String departName;

		private Integer totalCount;

		private Integer sensitiveCount;

		private String sensitiveRatio;

		private Long instanceId;

		private Integer s2Count;

		private Integer s3Count;

		private Integer s1Count;

		private String countDetails;

		private Integer totalRows;

		private Long lastScanTime;

		private String regionName;

		private String instanceName;

		private String sensLevelName;

		private String instanceDescription;

		private String tenantName;

		private List<Rule> ruleList;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Long getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(Long creationTime) {
			this.creationTime = creationTime;
		}

		public String getProductId() {
			return this.productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public Boolean getSensitive() {
			return this.sensitive;
		}

		public void setSensitive(Boolean sensitive) {
			this.sensitive = sensitive;
		}

		public Long getRiskLevelId() {
			return this.riskLevelId;
		}

		public void setRiskLevelId(Long riskLevelId) {
			this.riskLevelId = riskLevelId;
		}

		public String getRiskLevelName() {
			return this.riskLevelName;
		}

		public void setRiskLevelName(String riskLevelName) {
			this.riskLevelName = riskLevelName;
		}

		public String getDepartName() {
			return this.departName;
		}

		public void setDepartName(String departName) {
			this.departName = departName;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getSensitiveCount() {
			return this.sensitiveCount;
		}

		public void setSensitiveCount(Integer sensitiveCount) {
			this.sensitiveCount = sensitiveCount;
		}

		public String getSensitiveRatio() {
			return this.sensitiveRatio;
		}

		public void setSensitiveRatio(String sensitiveRatio) {
			this.sensitiveRatio = sensitiveRatio;
		}

		public Long getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Long instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getS2Count() {
			return this.s2Count;
		}

		public void setS2Count(Integer s2Count) {
			this.s2Count = s2Count;
		}

		public Integer getS3Count() {
			return this.s3Count;
		}

		public void setS3Count(Integer s3Count) {
			this.s3Count = s3Count;
		}

		public Integer getS1Count() {
			return this.s1Count;
		}

		public void setS1Count(Integer s1Count) {
			this.s1Count = s1Count;
		}

		public String getCountDetails() {
			return this.countDetails;
		}

		public void setCountDetails(String countDetails) {
			this.countDetails = countDetails;
		}

		public Integer getTotalRows() {
			return this.totalRows;
		}

		public void setTotalRows(Integer totalRows) {
			this.totalRows = totalRows;
		}

		public Long getLastScanTime() {
			return this.lastScanTime;
		}

		public void setLastScanTime(Long lastScanTime) {
			this.lastScanTime = lastScanTime;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getSensLevelName() {
			return this.sensLevelName;
		}

		public void setSensLevelName(String sensLevelName) {
			this.sensLevelName = sensLevelName;
		}

		public String getInstanceDescription() {
			return this.instanceDescription;
		}

		public void setInstanceDescription(String instanceDescription) {
			this.instanceDescription = instanceDescription;
		}

		public String getTenantName() {
			return this.tenantName;
		}

		public void setTenantName(String tenantName) {
			this.tenantName = tenantName;
		}

		public List<Rule> getRuleList() {
			return this.ruleList;
		}

		public void setRuleList(List<Rule> ruleList) {
			this.ruleList = ruleList;
		}

		public static class Rule {

			private String name;

			private String displayName;

			private Long count;

			private Long riskLevelId;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public Long getCount() {
				return this.count;
			}

			public void setCount(Long count) {
				this.count = count;
			}

			public Long getRiskLevelId() {
				return this.riskLevelId;
			}

			public void setRiskLevelId(Long riskLevelId) {
				this.riskLevelId = riskLevelId;
			}
		}
	}

	@Override
	public DescribeTablesResponse getInstance(UnmarshallerContext context) {
		return	DescribeTablesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
