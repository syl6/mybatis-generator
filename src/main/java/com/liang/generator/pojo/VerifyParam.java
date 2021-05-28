/*
*
* VerifyParam.java
* Copyright(C) 2021-2021 SYLIANG
* @date 2021-05-28
*/
package com.liang.generator.pojo;

import java.io.Serializable;
import java.util.Date;
/**
 * @AUTHOR: SYLIANG
 * @DATE: 2021/5/28 16:28
 * @DESCRIPTION :
 **/
public class VerifyParam implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 参数
     */
    private String param;

    /**
     * 插入人
     */
    private String insertBy;

    /**
     * 插入时间
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
     * verify_param
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 参数
     * @return param 参数
     */
    public String getParam() {
        return param;
    }

    /**
     * 参数
     * @param param 参数
     */
    public void setParam(String param) {
        this.param = param == null ? null : param.trim();
    }

    /**
     * 插入人
     * @return insert_by 插入人
     */
    public String getInsertBy() {
        return insertBy;
    }

    /**
     * 插入人
     * @param insertBy 插入人
     */
    public void setInsertBy(String insertBy) {
        this.insertBy = insertBy == null ? null : insertBy.trim();
    }

    /**
     * 插入时间
     * @return insert_time 插入时间
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * 插入时间
     * @param insertTime 插入时间
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
        sb.append(", param=").append(param);
        sb.append(", insertBy=").append(insertBy);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}