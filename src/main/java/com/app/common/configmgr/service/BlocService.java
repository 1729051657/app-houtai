
package com.app.common.configmgr.service;

import com.app.common.configmgr.pojo.Bloc;
import com.app.common.user.vo.User;

import java.util.List;

public interface BlocService {
	
	public List<Bloc> getBlocList();
	

	public List<Bloc> getUserBloc(User user);
}
