package com.boot.controller;

import com.boot.mapper.UserMapper;
import com.boot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/getUserList")
    public List<User> getUserList(){
        return userMapper.getUserList();
    }

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable("id") int id){
        return userMapper.getUserById(id);
    }

    @RequestMapping("/insertUser")
    public String insertUser(@RequestParam(name = "id", required = false) Integer id,
                             @RequestParam(name = "name") String name,
                             @RequestParam(name = "pwd") String pwd){
        userMapper.insertUser(new User(id, name, pwd));
        return "ok";
    }

    @GetMapping("/deleteUser")
    public String deleteUser(@RequestParam("id") Integer id){
        userMapper.deleteUser(id);
        return "ok";
    }

    @GetMapping("/updateUser")
    public String updateUser(){
        userMapper.updateUser(new User(5,"xx","111"));
        return "ok";
    }

}
