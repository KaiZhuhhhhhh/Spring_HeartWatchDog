package com.xingou.service.impl;
/*
*类UserServiceImpl
*@DATE2017/9/5
*@author viczyf
*
*/

import org.springframework.stereotype.Service;
import com.xingou.dao.DoctorDao;
import com.xingou.dao.UserDao;
import com.xingou.entity.Doctor;
import com.xingou.entity.User;
import com.xingou.service.UserService;
import sun.rmi.log.ReliableLog;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Transactional
    public User validLogin(User user) {
        return userDao.findByNameAndPass(user);
    }
}