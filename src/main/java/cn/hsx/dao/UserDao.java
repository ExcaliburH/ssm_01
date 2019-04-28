package cn.hsx.dao;

import cn.hsx.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {

    // 查询用户
    @Select("select * from user where username = #{username}")
    List<User> find(String username);
    // 保存用户信息
    @Insert("insert into user (userid, username, password, uname, age, registrationdate) values (#{userid}, #{username}, #{password}, #{uname}, #{age}, #{registrationdate})")
    public void saveUser(User user);
}