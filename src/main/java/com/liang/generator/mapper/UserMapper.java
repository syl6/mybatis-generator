/*
*
* UserMapper.java
* Copyright(C) 2017-2020 fendo公司
* @date 2021-05-28
*/
package com.liang.generator.mapper;

import com.liang.generator.pojo.User;

public interface UserMapper {
    /**
     *
     * @mbg.generated 2021-05-28
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2021-05-28
     */
    int insert(User record);

    /**
     *
     * @mbg.generated 2021-05-28
     */
    int insertSelective(User record);

    /**
     *
     * @mbg.generated 2021-05-28
     */
    User selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2021-05-28
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbg.generated 2021-05-28
     */
    int updateByPrimaryKey(User record);
}