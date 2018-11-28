package com.app.common.configmgr.service;


import com.app.common.configmgr.pojo.Build;
import com.app.common.configmgr.vo.BuildVo;
import com.app.common.user.vo.User;

import java.util.List;

public interface BuildService {
	
	public List<Build> getList(Build build);

	public List<Build> getUserBulidList(User user, Build build);
	
	public List<Build> getBlocBuildList(int id);
	
	public List<BuildVo> getBulidVoList(int id);


}
