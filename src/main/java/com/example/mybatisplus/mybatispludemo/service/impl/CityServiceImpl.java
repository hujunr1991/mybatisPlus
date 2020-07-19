package com.example.mybatisplus.mybatispludemo.service.impl;

import com.example.mybatisplus.mybatispludemo.model.City;
import com.example.mybatisplus.mybatispludemo.mapper.CityMapper;
import com.example.mybatisplus.mybatispludemo.service.ICityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 市级信息 服务实现类
 * </p>
 *
 * @author hujun
 * @since 2020-07-19
 */
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements ICityService {

}
