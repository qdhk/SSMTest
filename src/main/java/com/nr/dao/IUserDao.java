package com.nr.dao;

import com.nr.pojo.User;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 * Created by nr on 2017/04/22 0022.
 */
public interface IUserDao {
    int deleteByPrimaryKey(Integer id);
    int insert(User record);
    int insertSelective(User record);
    User selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(User record);
    int updateByPrimaryKey(User record);
    User findByLogin(User user);
    List<User> findByParams(User u, RowBounds rowBounds);

    int findAllCount(User u);
    List<User> findHotUser();
    List<User> findAllByQuery(User user);
    List<User> list(Map<String,Object> map);
    Long getTotal(Map<String,Object> map);
    User findUserByUsername(String username);
}
