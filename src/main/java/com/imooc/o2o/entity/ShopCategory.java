package com.imooc.o2o.entity;

import java.util.Date;

/**
 * <Description> 商铺类别实体类<br>
 * 
 * @author HuangWenyi<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年2月12日 <br>
 * @since V1.0<br>
 * @see com.imooc.o2o.entity <br>
 */
public class ShopCategory {
    // 商铺类别id
    private Long shopCategoryId;

    // 商铺类别名称
    private String shopCategoryName;

    // 商铺类别描述
    private String shopCategoryDesc;

    // 商铺类别图片
    private String shopCategoryImg;

    // 商铺类别
    private Integer priority;

    // 商铺类别创建时间
    private Date createTime;

    // 商铺类别修改时间
    private Date lastEditTime;

    // 商铺类别的上一级商铺类别
    private ShopCategory parent;

    public Long getShopCategoryId() {
        return shopCategoryId;
    }

    public void setShopCategoryId(Long shopCategoryId) {
        this.shopCategoryId = shopCategoryId;
    }

    public String getShopCategoryName() {
        return shopCategoryName;
    }

    public void setShopCategoryName(String shopCategoryName) {
        this.shopCategoryName = shopCategoryName;
    }

    public String getShopCategoryDesc() {
        return shopCategoryDesc;
    }

    public void setShopCategoryDesc(String shopCategoryDesc) {
        this.shopCategoryDesc = shopCategoryDesc;
    }

    public String getShopCategoryImg() {
        return shopCategoryImg;
    }

    public void setShopCategoryImg(String shopCategoryImg) {
        this.shopCategoryImg = shopCategoryImg;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public ShopCategory getParent() {
        return parent;
    }

    public void setParent(ShopCategory parent) {
        this.parent = parent;
    }

}
