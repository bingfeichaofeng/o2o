package com.imooc.o2o.entity;

import java.util.Date;

/**
 * <Description>使用者实体类<br>
 * 
 * @author HuangWenyi<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年2月12日 <br>
 * @since V1.0<br>
 * @see com.imooc.o2o.entity <br>
 */
public class PersonInfo {
    // 使用者id
    private Long userId;

    // 使用者名称
    private String name;

    // 使用者头像
    private String profileImg;

    // 使用者邮箱
    private String email;

    // 使用者性别
    private String gender;

    // 使用者账号状态
    private Integer enableStatus;

    // 使用者类型：1.顾客 2.店家 3.超级管理员
    private Integer userType;

    // 使用者创建时间
    private Date createTime;

    // 使用者修改时间
    private Date lastEditTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
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
