package cn.tedu.springBoot.service;

import cn.tedu.springBoot.pojo.User;

import java.util.List;

/**
 * Created by LYJ on 2017/10/17.
 */
public interface UserService {
    public List<User> findUserList();
}
