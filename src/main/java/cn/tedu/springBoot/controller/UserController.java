package cn.tedu.springBoot.controller;

import cn.tedu.springBoot.pojo.User;
import cn.tedu.springBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by LYJ on 2017/10/17.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUserList")
    //@ResponseBody    //需要页面跳转时，不需要添加该注解
    public String findUserList(Model model){

        List<User> userList = userService.findUserList();
        model.addAttribute("userList",userList);

        //跳转回用户列表页面
        return "userList";
    }
}
