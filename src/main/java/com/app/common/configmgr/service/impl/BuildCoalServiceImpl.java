package com.app.common.configmgr.service.impl;

import com.app.common.configmgr.pojo.BuildCoal;
import com.app.common.configmgr.service.BuildCoalService;
import com.app.common.dao.BaseDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BuildCoalServiceImpl implements BuildCoalService {

    @Resource
    private BaseDao baseDao;

    public List<BuildCoal> getBuildCoalList(BuildCoal buildCoal){
       return baseDao.getList("buildCoalMapper.getBuildCoalList",buildCoal);
    }
}
