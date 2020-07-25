package com.seckillproject.service;

import com.seckillproject.error.BusinessException;
import com.seckillproject.service.model.UserModel;

/**
 * @author hugo Yu
 * @create 2020-07-20
 */
public interface UserService {
    //通过用户的id获取用户对象的方法,返回值为UserModel对象
    UserModel getUserById(Integer id);

    //用户的注册流程,需要一个service处理用户注册的流程
    void register(UserModel userModel) throws BusinessException;

    /*
    telphone:用户注册手机
    encrptPassowrd:用户加密后的密码
     */
    UserModel validateLogin(String telphone, String encrptPassword) throws BusinessException;

}
