package cn.hsx.test;

import cn.hsx.dao.UserDao;
import cn.hsx.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMabatis {
    @Test
    public void run1() throws Exception{
        // 1.先加载mybatis的配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 2.创建SqlSessionFactory工厂
        // 创建工厂mybatis使用了构建者模式，把对象的创建细节隐藏，使使用者直接调用方法即可拿到对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();// 有了工厂就可以生产操作对象
        SqlSessionFactory factory = builder.build(in);
        // 3.使用工厂生产一个SqlSession对象
        // 生产SqlSession使用了工厂模式，解决了类之间的依赖关系（解耦）
        SqlSession session = factory.openSession();// 这个对象就可以操作数据库，但不是直接操作，用dao操作
        // 4.使用SqlSession创建Dao接口的代理对象
        // 创建Dao接口实现类使用了代理模式，不修改源码的基础上对已有方法增强
        UserDao accountDao = session.getMapper(UserDao.class);// 我们只有dao接口于是让他给我们创建一个代理对象
        // 5.使用代理对象执行方法
//        List<User> list = accountDao.findAll();// 调用方法实现功能
//        for(User account : list){
//            System.out.println(account);
//        }
        // 6.释放资源
        session.close();
        in.close();
    }
}
