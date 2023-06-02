package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author shawee
 * @email 757221692@qq.com
 * @date 2023-06-02 07:40:07
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
