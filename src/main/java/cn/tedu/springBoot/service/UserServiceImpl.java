package cn.tedu.springBoot.service;

import cn.tedu.springBoot.mapper.UserMapper;
import cn.tedu.springBoot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LYJ on 2017/10/17.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUserList() {
        return userMapper.findUserList();
    }
}
