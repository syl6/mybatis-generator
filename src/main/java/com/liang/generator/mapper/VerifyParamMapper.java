/*
*
* VerifyParamMapper.java
* Copyright(C) 2021-2021 SYLIANG
* @date 2021-05-28
*/
package com.liang.generator.mapper;

import com.liang.generator.pojo.VerifyParam;

public interface VerifyParamMapper {
    /**
     *
     * @mbg.generated 2021-05-28
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2021-05-28
     */
    int insert(VerifyParam record);

    /**
     *
     * @mbg.generated 2021-05-28
     */
    int insertSelective(VerifyParam record);

    /**
     *
     * @mbg.generated 2021-05-28
     */
    VerifyParam selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2021-05-28
     */
    int updateByPrimaryKeySelective(VerifyParam record);

    /**
     *
     * @mbg.generated 2021-05-28
     */
    int updateByPrimaryKey(VerifyParam record);
}