package com.imooc.o2o.service;

import java.io.File;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;

/**
 * 
 * <Description>店铺接口<br> 
 *  
 * @author HuangWenyi<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年3月2日 <br>
 * @since V1.0<br>
 * @see com.imooc.o2o.service <br>
 */
public interface ShopService {
    /**
     * 
     * Description:添加店铺，需要传入店铺信息以及相关图片<br> 
     *  
     * @author HuangWenyi<br>
     * @taskId <br>
     * @param shop
     * @param shopImg
     * @return ShopExecution<br>
     */
    ShopExecution addShop(Shop shop,CommonsMultipartFile shopImg);
}
