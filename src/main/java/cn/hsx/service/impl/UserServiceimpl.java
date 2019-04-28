package cn.hsx.service.impl;

import cn.hsx.dao.UserDao;
import cn.hsx.domain.User;
import cn.hsx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("userService")// 把service的这个类交给IoC容器去管理
public class UserServiceimpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<User> find(String username) {
        System.out.println("查询所有账户");
        return userDao.find(username);
    }

    public void saveUser(User user) {
        userDao.saveUser(user);
        System.out.println("保存账户信息");
    }
}
