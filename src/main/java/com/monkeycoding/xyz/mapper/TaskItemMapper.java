package com.monkeycoding.xyz.mapper;

import com.monkeycoding.xyz.entity.TaskItem;

public interface TaskItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_item
     *
     * @mbggenerated Sat Jan 23 13:13:47 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_item
     *
     * @mbggenerated Sat Jan 23 13:13:47 CST 2016
     */
    int insert(TaskItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_item
     *
     * @mbggenerated Sat Jan 23 13:13:47 CST 2016
     */
    int insertSelective(TaskItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_item
     *
     * @mbggenerated Sat Jan 23 13:13:47 CST 2016
     */
    TaskItem selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_item
     *
     * @mbggenerated Sat Jan 23 13:13:47 CST 2016
     */
    int updateByPrimaryKeySelective(TaskItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_item
     *
     * @mbggenerated Sat Jan 23 13:13:47 CST 2016
     */
    int updateByPrimaryKey(TaskItem record);
}