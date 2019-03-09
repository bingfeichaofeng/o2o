package com.imooc.o2o.service.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.imooc.o2o.dao.ShopDao;
import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.enums.ShopStateEnum;
import com.imooc.o2o.exceptions.ShopOperationException;
import com.imooc.o2o.service.ShopService;
import com.imooc.o2o.util.ImageUtil;
import com.imooc.o2o.util.PathUtil;

/**
 * <Description>店铺服务层实现类<br>
 * 
 * @author HuangWenyi<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年3月2日 <br>
 * @since V1.0<br>
 * @see com.imooc.o2o.service.impl <br>
 */
public class ShopServiceImpl implements ShopService {
    private final static Logger logger = LoggerFactory.getLogger(ShopServiceImpl.class);

    @Autowired
    private ShopDao shopDao;

    /**
     * Description:添加店铺<br>
     * 
     * @author HuangWenyi<br>
     * @taskId <br>
     * @param shop
     * @param shopImg
     * @return <br>
     */
    @Override
    @Transactional
    public ShopExecution addShop(Shop shop, CommonsMultipartFile shopImg) {
        if (shop == null) {
            return new ShopExecution(ShopStateEnum.NULL_SHOP);
        }
        try {
            // 给店铺信息赋初始值
            shop.setEnableStatus(0);
            shop.setCreateTime(new Date());
            shop.setLastEditTime(new Date());
            // 添加店铺信息
            int effectedNum = shopDao.insertShop(shop);
            if (effectedNum <= 0) {
                logger.error("店铺创建失败");
                // 主动抛出ShopOperationException,终止事务,回滚
                throw new ShopOperationException("店铺创建失败");
            }
            else {
                if (shopImg != null) {
                    // 存储图片
                    try {
                        addShopImg(shop, shopImg);
                    }
                    catch (Exception e) {
                        logger.error("添加店铺图片失败" + e.getMessage());
                        throw new ShopOperationException("addShopImg error:" + e.getMessage());
                    }
                    // 更新店铺的图片地址
                    effectedNum = shopDao.updateShop(shop);
                    if (effectedNum <= 0) {
                        logger.error("更新图片失败");
                        throw new ShopOperationException("更新图片失败");
                    }
                }
            }
        }
        catch (Exception e) {
            logger.error("addShop error:" + e.toString());
        }
        return null;
    }

    /**
     * Description:获取图片缩略图的相对路径<br>
     * 
     * @author HuangWenyi<br>
     * @taskId <br>
     * @param shop
     * @param shopImg <br>
     */
    private void addShopImg(Shop shop, CommonsMultipartFile shopImg) {
        String dest = PathUtil.getShopImagePath(shop.getShopId());
        String shopImgAddr = ImageUtil.generateThumbnail(shopImg, dest);
        shop.setShopImg(shopImgAddr);
    }

}
