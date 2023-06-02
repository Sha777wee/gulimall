package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author shawee
 * @email 757221692@qq.com
 * @date 2023-06-02 07:58:48
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
