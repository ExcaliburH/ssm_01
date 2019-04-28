package cn.hsx.test;


import cn.hsx.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void run1(){
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 获取方法
        UserService as = (UserService) ac.getBean("accountService");
        // 调用方法
//        as.findAll();
    }
}
