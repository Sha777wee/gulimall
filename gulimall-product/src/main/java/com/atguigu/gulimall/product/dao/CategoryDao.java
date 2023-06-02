package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author shawee
 * @email 757221692@qq.com
 * @date 2023-06-02 07:28:36
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
