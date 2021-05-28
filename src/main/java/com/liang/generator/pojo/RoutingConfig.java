/*
*
* RoutingConfig.java
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
public class RoutingConfig implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 路由名称
     */
    private String routingName;

    /**
     * 访问的服务名称
     */
    private String serviceId;

    /**
     * 访问服务路径
     */
    private String insideApiUrl;

    /**
     * 插入人
     */
    private String insertBy;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 插入时间
     */
    private Date insertTime;

    /**
     * 修改人
     */
    private String updateBy;

    /**
     * routing_config
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
     * 路由名称
     * @return routing_name 路由名称
     */
    public String getRoutingName() {
        return routingName;
    }

    /**
     * 路由名称
     * @param routingName 路由名称
     */
    public void setRoutingName(String routingName) {
        this.routingName = routingName == null ? null : routingName.trim();
    }

    /**
     * 访问的服务名称
     * @return service_id 访问的服务名称
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * 访问的服务名称
     * @param serviceId 访问的服务名称
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    /**
     * 访问服务路径
     * @return inside_api_url 访问服务路径
     */
    public String getInsideApiUrl() {
        return insideApiUrl;
    }

    /**
     * 访问服务路径
     * @param insideApiUrl 访问服务路径
     */
    public void setInsideApiUrl(String insideApiUrl) {
        this.insideApiUrl = insideApiUrl == null ? null : insideApiUrl.trim();
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
        sb.append(", routingName=").append(routingName);
        sb.append(", serviceId=").append(serviceId);
        sb.append(", insideApiUrl=").append(insideApiUrl);
        sb.append(", insertBy=").append(insertBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append("]");
        return sb.toString();
    }
}