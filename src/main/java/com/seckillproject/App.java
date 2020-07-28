package com.seckillproject;

import com.seckillproject.dao.UserDOMapper;
import com.seckillproject.dataobject.UserDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 * Hugo Yu
 * 项目搭建完成
 */
@SpringBootApplication(scanBasePackages = {"com.seckillproject"})//把这个app的启动类当成springboot的自动化可以配置启动器
@RestController
@MapperScan("com.seckillproject.dao")//```@MapperScan```可以指定要扫描的Mapper类的包的路径
public class App {
    @Autowired
    private UserDOMapper userDOMapper;
    @RequestMapping("/")  //路由请求，get方法的路由 / 路径；

    public String home(){
        UserDO userDO = userDOMapper.selectByPrimaryKey(1);
        if(userDO == null){
            return "用户对象不存在";
        }else{
            return userDO.getName();
        }
    }
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class,args);
    }
}
