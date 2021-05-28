/*
*
* RoutingConfigMapper.java
* Copyright(C) 2017-2020 fendo公司
* @date 2021-05-28
*/
package com.liang.generator.mapper;

import com.liang.generator.pojo.RoutingConfig;

public interface RoutingConfigMapper {
    /**
     *
     * @mbg.generated 2021-05-28
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2021-05-28
     */
    int insert(RoutingConfig record);

    /**
     *
     * @mbg.generated 2021-05-28
     */
    int insertSelective(RoutingConfig record);

    /**
     *
     * @mbg.generated 2021-05-28
     */
    RoutingConfig selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2021-05-28
     */
    int updateByPrimaryKeySelective(RoutingConfig record);

    /**
     *
     * @mbg.generated 2021-05-28
     */
    int updateByPrimaryKey(RoutingConfig record);
}