package com.app.energyconsumptionmanagement.service.impl;


import com.app.common.configmgr.service.BlocService;
import com.app.common.configmgr.service.BuildService;
import com.app.common.dao.BaseDao;
import com.app.energyconsumptionmanagement.bean.Device;
import com.app.energyconsumptionmanagement.bean.DeviceVo;
import com.app.energyconsumptionmanagement.service.DeviceService;
import org.springframework.stereotype.Service;
import sun.jvm.hotspot.debugger.Page;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@Service
public class DeviceServiceImpl implements DeviceService {
	@Resource
	private BaseDao baseDao;
	@Resource
	private BlocService blocService;
	@Resource
	private BuildService buildService;

	@Override
	public List<Device> getList(Device device) {
		return baseDao.getList("deviceMapper.getList", device);// Page page,
	}


	public List<DeviceVo> getListPage(Page page, Device device) {
		Map params = new HashMap();
		params.put("page", page);
		params.put("device", device);
		return baseDao.getList("deviceMapper.listPage", params);//
	}



	// 根据id得到rootid
	public void getRootid(List<Device> list, int pid, StringBuffer rootid) {
		for (Device dtt : list) {
			if (dtt.getId() == pid) {
				// rootid=new StringBuffer();
				rootid.setLength(0);
				rootid.append(dtt.getId() + "");
				getRootid(list, dtt.getParent_id(), rootid);
			}
		}
	}





	@Override
	public List<Device> getBlocDeviceList(int id) {
		return baseDao.getList("deviceMapper.getBlocDeviceList", id);
	}



	@Override
	public List<Device> getBuildDeviceList(int id) {
		return baseDao.getList("deviceMapper.getBuildDeviceList", id);
	}

	@Override
	public List<DeviceVo> getDeviceVo(DeviceVo device) {
		return baseDao.getList("deviceMapper.getDeviceVo", device);
	}
	
	public void getIdS(List<Device> list, int pid,StringBuffer sbf) {
		for (Device at : list) {
			if (at.getParent_id() == pid) { // rootid=new
				sbf.append(at.getId()).append(",");
				getIdS(list, at.getId(),sbf);
			}
		}
	}
	public List<Device> getid(){
		return baseDao.getList("deviceMapper.getid", null);
	}



	@Override
	public Device getDevice(String device_name) {
		return baseDao.get("deviceMapper.qryDeviceByName", device_name);
	}
	/**
	 * 根据建筑id查询设备分项类型
	 */

	public void upddeviceByname(Device device){
		baseDao.save("deviceMapper.upddeviceByname" ,device);
	}

	public List<Device> getlevel(int build_id){
		return baseDao.getList("deviceMapper.getlevel",build_id);
	}

	public List<Device> getParentDevice(int id){
		return baseDao.getList("deviceMapper.getParentDevice",id);
	}

	public List<Device> getDeviceList(Device device){
		return baseDao.getList("deviceMapper.getDeviceList",device);
	}
}
