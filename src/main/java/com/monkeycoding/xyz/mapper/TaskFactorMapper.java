package com.monkeycoding.xyz.mapper;

import com.monkeycoding.xyz.entity.TaskFactor;

public interface TaskFactorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_factor
     *
     * @mbggenerated Sat Jan 23 13:14:51 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_factor
     *
     * @mbggenerated Sat Jan 23 13:14:51 CST 2016
     */
    int insert(TaskFactor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_factor
     *
     * @mbggenerated Sat Jan 23 13:14:51 CST 2016
     */
    int insertSelective(TaskFactor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_factor
     *
     * @mbggenerated Sat Jan 23 13:14:51 CST 2016
     */
    TaskFactor selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_factor
     *
     * @mbggenerated Sat Jan 23 13:14:51 CST 2016
     */
    int updateByPrimaryKeySelective(TaskFactor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_factor
     *
     * @mbggenerated Sat Jan 23 13:14:51 CST 2016
     */
    int updateByPrimaryKey(TaskFactor record);
}