package com.imooc.o2o.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.imooc.o2o.entity.ShopCategory;

/**
 * <Description>商品类别dao接口<br>
 * 
 * @author HuangWenyi<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年3月9日 <br>
 * @since V7.3<br>
 * @see com.imooc.o2o.dao <br>
 */
public interface ShopCategoryDao {
    List<ShopCategory> queryShopCategory(@Param("shopCategoryCondition") ShopCategory shopCategory);
}
