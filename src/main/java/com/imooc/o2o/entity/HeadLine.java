package com.imooc.o2o.entity;

import java.util.Date;

/**
 * <Description>头条实体类<br>
 * 
 * @author HuangWenyi<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年2月12日 <br>
 * @since V1.0<br>
 * @see com.imooc.o2o.entity <br>
 */
public class HeadLine {
    // 头条id
    private Long lineId;

    // 头条名称
    private String lineName;

    // 头条链接
    private String lineLink;

    // 头条图片
    private String lineImg;

    // 头条权重
    private Integer priority;

    // 头条状态：0.不可用 1.可用
    private Integer enableStatus;

    // 头条创建时间
    private Date createTime;

    // 头条修改时间
    private Date lastEditTime;

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getLineLink() {
        return lineLink;
    }

    public void setLineLink(String lineLink) {
        this.lineLink = lineLink;
    }

    public String getLineImg() {
        return lineImg;
    }

    public void setLineImg(String lineImg) {
        this.lineImg = lineImg;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
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

}
