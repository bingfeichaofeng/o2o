package com.imooc.o2o.entity;

import java.util.Date;

/**
 * <Description>微信账号实体类<br>
 * 
 * @author HuangWenyi<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年2月12日 <br>
 * @since V1.0<br>
 * @see com.imooc.o2o.entity <br>
 */
public class WeChatAuth {
    // 微信账号id
    private Long weChatAuthId;

    // 微信账号openid
    private String openId;

    // 微信账号与商城账号关联的时间
    private Date createTime;

    // 商城使用者账号
    private PersonInfo personInfo;

    public Long getWeChatAuthId() {
        return weChatAuthId;
    }

    public void setWeChatAuthId(Long weChatAuthId) {
        this.weChatAuthId = weChatAuthId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }

}
