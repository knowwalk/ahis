package cn.com.liandisys.ahis.mock.entity.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import cn.com.liandisys.ahis.mock.entity.BaseRequest;

@XmlRootElement(name = "Request")
public class InspResultDetailSereachRequest extends BaseRequest {

	private String patCardType;
	private String patCardNo;
	private String checkId;

	@XmlElement
	public String getPatCardType() {
		return patCardType;
	}

	public void setPatCardType(String patCardType) {
		this.patCardType = patCardType;
	}

	@XmlElement
	public String getPatCardNo() {
		return patCardNo;
	}

	public void setPatCardNo(String patCardNo) {
		this.patCardNo = patCardNo;
	}

	@XmlElement
	public String getCheckId() {
		return checkId;
	}

	public void setCheckId(String checkId) {
		this.checkId = checkId;
	}

}
