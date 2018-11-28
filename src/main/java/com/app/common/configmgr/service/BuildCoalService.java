package com.app.common.configmgr.service;

import com.app.common.configmgr.pojo.BuildCoal;

import java.util.List;

public interface BuildCoalService {

    /**
     * 根据能源id 和  建筑id 获得数据
     * @param buildCoal
     * @return
     */
    public List<BuildCoal> getBuildCoalList(BuildCoal buildCoal);
}
