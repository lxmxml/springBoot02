package com.lxm.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lxm.bean.Users;
import com.lxm.service.UsersService;

@Service
@org.springframework.stereotype.Service
public class UsersServiceImpl implements UsersService {

	@Override
	public Users selectById(String id) {
		Users u = new Users();
		u.setId(id);
		u.setUname("联大");
		u.setProvince("安徽省");
		return u;
	}

	

}
