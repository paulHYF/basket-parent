package com.basket.business.impl;

import com.basket.business.UserManager;
import com.basket.dao.UserMapper;
import com.basket.domain.User;
import com.basket.domain.UserExample;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * {@link UserManager}接口的实现。
 * @author HuangYF
 */
@Service
@Transactional
public class UserManagerImpl implements UserManager{

    @Autowired
    private UserMapper userMapper;

    @Override
    public long countByExample(UserExample userExample) {
        return userMapper.countByExample(userExample);
    }

    @Override
    public int deleteByExample(UserExample userExample) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String s) {
        return 0;
    }

    @Override
    public int insert(User user) {
        return 0;
    }

    @Override
    public int insertSelective(User user) {
        return 0;
    }

    @Override
    public List<User> selectByExampleWithBLOBsWithRowbounds(UserExample userExample, RowBounds rowBounds) {
        return null;
    }

    @Override
    public List<User> selectByExampleWithBLOBs(UserExample userExample) {
        return null;
    }

    @Override
    public List<User> selectByExampleWithRowbounds(UserExample userExample, RowBounds rowBounds) {
        return null;
    }

    @Override
    public List<User> selectByExample(UserExample userExample) {
        return null;
    }

    @Override
    public User selectByPrimaryKey(String s) {
        return null;
    }

    @Override
    public int updateByExampleSelective(User user, UserExample userExample) {
        return 0;
    }

    @Override
    public int updateByExample(User user, UserExample userExample) {
        return 0;
    }

    @Override
    public int updateByExampleWithBLOBs(User user, UserExample userExample) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(User user) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User user) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(User user) {
        return 0;
    }
}
