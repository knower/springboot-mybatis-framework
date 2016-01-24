package com.monkeycoding.xyz.mapper;

import com.monkeycoding.xyz.entity.TaskItem;

public interface TaskItemMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(TaskItem record);

	int insertSelective(TaskItem record);

	TaskItem selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(TaskItem record);

	int updateByPrimaryKey(TaskItem record);

}