package com.ths.web.services.impl;


import com.ths.web.dao.UserDao;
import com.ths.web.entity.User;
import com.ths.web.services.CommonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author JiangYu
 * @Description 用户服务实现
 * @Date 2022-09-15 15:35
 * @Version 1.0
 */
@Service
public class CommonServiceImpl implements CommonService {

    @Resource
    UserDao userDao;

    @Override
    public User findUserById(int id) {
        return userDao.queryById(id);
    }


}
