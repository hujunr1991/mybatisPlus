package com.example.mybatisplus.mybatispludemo.service.impl;

import com.example.mybatisplus.mybatispludemo.model.UserInfo;
import com.example.mybatisplus.mybatispludemo.mapper.UserInfoMapper;
import com.example.mybatisplus.mybatispludemo.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author hujun
 * @since 2020-07-19
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAllUser() {
        return userInfoMapper.findAllUser();
    }
}
