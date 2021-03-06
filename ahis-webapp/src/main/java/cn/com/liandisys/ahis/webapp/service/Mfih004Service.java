package cn.com.liandisys.ahis.webapp.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;

import cn.com.liandisys.ahis.webapp.dto.PatientsHospitalizedInfo;
import cn.com.liandisys.ahis.webapp.entity.PatientsHospitalizedEntity;
import cn.com.liandisys.ahis.webapp.his.HisHttpJson;
import cn.com.liandisys.ahis.webapp.his.entity.response.DoctorInfoItem;
import cn.com.liandisys.ahis.webapp.his.entity.response.DoctorInfoResponse;
import cn.com.liandisys.ahis.webapp.his.entity.response.HospitalDeptItem;
import cn.com.liandisys.ahis.webapp.his.entity.response.HospitalDeptResponse;
import cn.com.liandisys.ahis.webapp.mapper.Mfih001Mapper;

/**
 * 住院Service。
 * 
 * @author xuyue
 * @version 1.0
 */
@Service
@Transactional
public class Mfih004Service {

	@Autowired
	public Mfih001Mapper mfih001Mapper;

	private static final Logger logger = LoggerFactory.getLogger(Mfih004Service.class);

	/**
	 * 检索用户住院信息。（1:已在院 和 2：已出院）
	 * 
	 * @param param
	 *            用户ID
	 * @return 住院信息List
	 */
	public List<PatientsHospitalizedInfo> getHospitalizeByUserId(PatientsHospitalizedEntity param) {
		logger.trace("" + param.getUserId());
		return mfih001Mapper.getStayListByUserId(param);
	}

	/**
	 * 医生信息查询mock请求。
	 * 
	 * @return 医生信息
	 * @throws UnsupportedEncodingException
	 * @throws JAXBException
	 */
	@RequestMapping
	public DoctorInfoItem getDoctorInfo(JSONObject request) {

		JSONObject json = HisHttpJson.executeHisApi("doctor-info", request);
		DoctorInfoResponse respone = HisHttpJson.convJsonToBean(json, DoctorInfoResponse.class);

		logger.debug(respone.getResultCode());
		logger.debug(respone.getResultMessage());

		if (respone.getItemList() != null) {
			respone.getItemList().forEach(item -> {
				logger.trace(item.getDeptCode());
				logger.trace(item.getDoctorCode());
			});
			return respone.getItemList().get(0);
		}
		return new DoctorInfoItem();
	}

	/**
	 * 科室信息查询mock请求。
	 * 
	 * @return 科室信息
	 * @throws UnsupportedEncodingException
	 * @throws JAXBException
	 */
	@RequestMapping
	public HospitalDeptItem getDeptInfo(JSONObject request) {

		JSONObject json = HisHttpJson.executeHisApi("dept-info", request);
		HospitalDeptResponse respone = HisHttpJson.convJsonToBean(json, HospitalDeptResponse.class);

		logger.debug(respone.getResultCode());
		logger.debug(respone.getResultMessage());

		if (respone.getItemList() != null) {
			respone.getItemList().forEach(item -> {
				logger.trace(item.getDeptCode());
			});
			return respone.getItemList().get(0);
		}
		return new HospitalDeptItem();
	}


}
