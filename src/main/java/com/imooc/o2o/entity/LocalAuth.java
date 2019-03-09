package com.imooc.o2o.entity;

import java.util.Date;

/**
 * <Description>商城本地用户实体类<br>
 * 
 * @author HuangWenyi<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年2月12日 <br>
 * @since V1.0<br>
 * @see com.imooc.o2o.entity <br>
 */
public class LocalAuth {
    // 本地用户id
    private Long localAuthId;

    // 本地用户名称
    private String username;

    // 本地用户创建时间
    private Date createTime;

    // 本地用户修改时间
    private Date lastEditTime;

    // 商城使用者信息
    private PersonInfo personInfo;

    public Long getLocalAuthId() {
        return localAuthId;
    }

    public void setLocalAuthId(Long localAuthId) {
        this.localAuthId = localAuthId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }

}
