package com.imooc.o2o.entity;

import java.util.Date;

/**
 * <Description>商品图片类<br>
 * 
 * @author HuangWenyi<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年2月16日 <br>
 * @since V1.0<br>
 * @see com.imooc.o2o.entity <br>
 */
public class ProductImg {
    // 商品图片id
    private Long productImgId;

    // 图片地址
    private String imgAddr;

    // 图片描述
    private String imgDesc;

    // 图片显示权重
    private Integer priority;

    // 图片创建时间
    private Date createTime;

    // 商品id
    private Long productId;

    public Long getProductImgId() {
        return productImgId;
    }

    public void setProductImgId(Long productImgId) {
        this.productImgId = productImgId;
    }

    public String getImgAddr() {
        return imgAddr;
    }

    public void setImgAddr(String imgAddr) {
        this.imgAddr = imgAddr;
    }

    public String getImgDesc() {
        return imgDesc;
    }

    public void setImgDesc(String imgDesc) {
        this.imgDesc = imgDesc;
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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

}
