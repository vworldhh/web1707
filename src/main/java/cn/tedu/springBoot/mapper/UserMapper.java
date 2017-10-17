package cn.tedu.springBoot.mapper;

import cn.tedu.springBoot.pojo.User;

import java.util.List;

/**
 * Created by LYJ on 2017/10/17.
 */
public interface UserMapper {
    public List<User> findUserList();
}
