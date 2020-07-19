package com.example.mybatisplus.mybatispludemo.mapper;

import com.example.mybatisplus.mybatispludemo.model.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author hujun
 * @since 2020-07-19
 */
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    public List<UserInfo> findAllUser();

}
