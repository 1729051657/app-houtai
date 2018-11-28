package com.app.energyconsumptionmanagement.service;


import com.app.energyconsumptionmanagement.bean.Device;
import com.app.energyconsumptionmanagement.bean.DeviceVo;
import sun.jvm.hotspot.debugger.Page;

import java.util.List;


public interface DeviceService {
	List<Device> getList(Device device);
	List<DeviceVo> getDeviceVo(DeviceVo device);
	List<DeviceVo> getListPage(Page page, Device device);
	Device getDevice(String device_name);
	List<Device> getBlocDeviceList(int id);
	List<Device> getBuildDeviceList(int id);

}
