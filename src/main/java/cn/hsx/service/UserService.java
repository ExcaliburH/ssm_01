package cn.hsx.service;

import cn.hsx.domain.User;

import java.util.List;

public interface UserService {
    // 查询用户
    List<User> find(String username);
    // 保存用户信息
    void saveUser(User user);
}
