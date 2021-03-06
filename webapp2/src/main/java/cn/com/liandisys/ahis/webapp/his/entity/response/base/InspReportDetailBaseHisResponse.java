package cn.com.liandisys.ahis.webapp.his.entity.response.base;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

import cn.com.liandisys.ahis.webapp.his.entity.response.base.item.InspReportDetailBaseItem;

public class InspReportDetailBaseHisResponse extends AbstractHisResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7435751909497235363L;
	// 检验ID
	private String inspectId;
	// 检验名称
	private String inspectName;
	// 送检科室
	private String deptName;
	// 送检医生
	private String doctorName;
	// 送检时间
	private String inspectTime;
	// 报告时间
	private String reportTime;

	@JSONField(name="item")
	private List<InspReportDetailBaseItem> itemList;

	public String getInspectId() {
		return inspectId;
	}

	public void setInspectId(String inspectId) {
		this.inspectId = inspectId;
	}

	public String getInspectName() {
		return inspectName;
	}

	public void setInspectName(String inspectName) {
		this.inspectName = inspectName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getInspectTime() {
		return inspectTime;
	}

	public void setInspectTime(String inspectTime) {
		this.inspectTime = inspectTime;
	}

	public String getReportTime() {
		return reportTime;
	}

	public void setReportTime(String reportTime) {
		this.reportTime = reportTime;
	}

	public List<InspReportDetailBaseItem> getItemList() {
		return itemList;
	}

	public void setItemList(List<InspReportDetailBaseItem> itemList) {
		this.itemList = itemList;
	}
}
