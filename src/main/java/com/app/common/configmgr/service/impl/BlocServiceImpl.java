package com.app.common.configmgr.service.impl;

import java.util.List;

import com.app.common.configmgr.pojo.Bloc;
import com.app.common.configmgr.service.BlocService;
import com.app.common.dao.BaseDao;
import com.app.common.user.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BlocServiceImpl implements BlocService {

	@Autowired
	private BaseDao basedao;
	
	@Override
	public List<Bloc> getBlocList() {
		return basedao.getList("blocMapper.getBlocList", null);
	}


	@Override
	public List<Bloc> getUserBloc(User user) {
		if(user != null) {
			User userrole =(User) basedao.get("userMapper.getUserRole", user);
			if(userrole.getType() ==-1) {
				return basedao.getList("blocMapper.getBlocList",null);
			}else {
				return basedao.getList("blocMapper.getUserBlocLiset", user);
			}
		}
		return null;
	}


}
