/*
*
* User.java
* Copyright(C) 2017-2020 fendo公司
* @date 2021-05-28
*/
package com.liang.generator.pojo;

import java.io.Serializable;
import java.util.Date;
/**
 * @AUTHOR: SYLIANG
 * @DATE: 2021/5/28 16:08
 * @DESCRIPTION :
 **/
public class User implements Serializable {
    /**
     * ID
     */
    private Integer id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 创建人
     */
    private String insertBy;

    /**
     * 创建时间
     */
    private Date insertTime;

    /**
     * 修改人
     */
    private String updateBy;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * USER
     */
    private static final long serialVersionUID = 1L;

    /**
     * ID
     * @return ID ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * ID
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 用户ID
     * @return user_id 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId 用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 用户名称
     * @return user_name 用户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名称
     * @param userName 用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 密码
     * @return password 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 创建人
     * @return insert_by 创建人
     */
    public String getInsertBy() {
        return insertBy;
    }

    /**
     * 创建人
     * @param insertBy 创建人
     */
    public void setInsertBy(String insertBy) {
        this.insertBy = insertBy == null ? null : insertBy.trim();
    }

    /**
     * 创建时间
     * @return insert_time 创建时间
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * 创建时间
     * @param insertTime 创建时间
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * 修改人
     * @return update_by 修改人
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 修改人
     * @param updateBy 修改人
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 修改时间
     * @return update_time 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     *
     * @mbg.generated 2021-05-28
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", insertBy=").append(insertBy);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}