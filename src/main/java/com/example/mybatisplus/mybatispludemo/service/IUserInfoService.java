package com.example.mybatisplus.mybatispludemo.service;

import com.example.mybatisplus.mybatispludemo.model.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author hujun
 * @since 2020-07-19
 */
public interface IUserInfoService extends IService<UserInfo> {

    public List<UserInfo> findAllUser();

}
