package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xj
 * @email sunlightcs@gmail.com
 * @date 2022-10-18 14:12:38
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
