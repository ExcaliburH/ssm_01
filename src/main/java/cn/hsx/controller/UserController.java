package cn.hsx.controller;

import cn.hsx.dao.UserDao;
import cn.hsx.domain.User;
import cn.hsx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/*
 * 账户web层
 */
@Controller
@RequestMapping("/account")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private HttpServletRequest request;


    @RequestMapping("/find")
    public String find(String username, String password){
        // 调用service的方法
        List<User> result = userService.find(username);
        if (result.size()>0) {
            if(password.equals(result.get(0).getPassword())) {
                request.getSession().setAttribute("test","哈哈哈");
                return "success";
            }else {
                return "failed";
            }
        }
        return "failed";
    }
    @RequestMapping("/save")
    public String saveUser(User user){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String registrationdate = simpleDateFormat.format(new Date());
        user.setRegistrationdate(registrationdate);
        userService.saveUser(user);
        return "registsuccess";
    }
    @RequestMapping("/regist")
    public String login(){
        return "regist";
    }
}
