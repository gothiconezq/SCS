package top.kinggg.scs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.kinggg.scs.mapper.UserDemoDAO;
import top.kinggg.scs.model.UserDemo;

@Service
public class DemoService {
	@Autowired
	UserDemoDAO userDao;
	public UserDemo testDemo(int id) {
		return userDao.selectByPrimaryKey(id);
	}
}
