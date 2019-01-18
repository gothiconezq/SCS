package top.kinggg.scs.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.kinggg.scs.model.UserDemo;

/**
 * UserDemoDAO继承基类
 */
@Repository
@Mapper
public interface UserDemoDAO extends MyBatisBaseDao<UserDemo, Integer> {
	UserDemo selectByPrimaryKey(int id);
}