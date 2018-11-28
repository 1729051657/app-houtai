package com.app.common.configmgr.service.impl;

import java.util.List;

import com.app.common.configmgr.pojo.Build;
import com.app.common.configmgr.service.BuildService;
import com.app.common.configmgr.vo.BuildVo;
import com.app.common.dao.BaseDao;
import com.app.common.user.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 建筑服务
 * @author liyao
 *
 */
@Service
public class BuildServiceImpl implements BuildService {

	@Autowired
	private BaseDao baseDao;

	public List<Build> getList(Build build) {
		return baseDao.getList("buildMapper.getList", build);
	}

	@Override
	public List<Build> getUserBulidList(User user, Build build) {
		User userrole =(User) baseDao.get("userMapper.getUserRole", user);
		if(user != null) {
			if(userrole.getRolename().equals("系统管理员")) {
				return baseDao.getList("buildMapper.getList",build);
			}else {
				return baseDao.getList("buildMapper.getUserBulid",build);
			}
		}
		return null;
	}

	@Override
	public List<Build> getBlocBuildList(int id) {
		return baseDao.getList("buildMapper.getBlocBuildList", id);
	}
	@Override
	public List<BuildVo> getBulidVoList(int id) {
		return baseDao.getList("buildMapper.getBuildVoList", id);
	}



}
