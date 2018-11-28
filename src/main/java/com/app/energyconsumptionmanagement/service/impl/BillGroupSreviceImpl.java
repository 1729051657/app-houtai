package com.app.energyconsumptionmanagement.service.impl;

import com.app.common.dao.BaseDao;
import com.app.energyconsumptionmanagement.bean.BillGroupVo;

import java.util.List;
import java.util.Map;

import com.app.energyconsumptionmanagement.service.BillGroupSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BillGroupSreviceImpl implements BillGroupSrevice {
    @Autowired
    BaseDao baseDao;
    @Override
    public List<BillGroupVo> getGroup(Map map) {
        return baseDao.getList("billDeviceMapper.getBillGroup",map);
    }
}
