package com.ths.web.services;

import com.ths.web.entity.User;

/**
 * @Author JiangYu
 * @Description 用户服务接口
 * @Date 2022-09-15 15:32
 * @Version 1.0
 */
public interface CommonService {
    User findUserById(int id);
}
