package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Shop;

/**
 * 
 * <Description>店铺类操作接口<br> 
 *  
 * @author HuangWenyi<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年2月17日 <br>
 * @since V1.0<br>
 * @see com.imooc.o2o.dao <br>
 */
public interface ShopDao {
    /**
     * 
     * Description:新增店铺<br> 
     *  
     * @author HuangWenyi<br>
     * @taskId <br>
     * @param shop
     * @return int<br>
     */
    int insertShop(Shop shop);
    
    /**
     * 
     * Description:更新店铺信息<br> 
     *  
     * @author HuangWenyi<br>
     * @taskId <br>
     * @param shop
     * @return int<br>
     */
    int updateShop(Shop shop);
}
