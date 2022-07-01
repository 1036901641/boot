package com.boot.mapper;

import com.boot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> getUserList();

    User getUserById(int id);

    int insertUser(User user);

    int deleteUser(int id);

    int updateUser(User user);
}
