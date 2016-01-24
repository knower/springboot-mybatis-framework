package com.monkeycoding.xyz.service.api;

import com.monkeycoding.xyz.entity.Task;

import java.util.List;
import java.util.Map;

/**
 * Created by czn on 2016/1/23.
 */
public interface ITaskService {


	/**
	 * 添加一条任务
	 *
	 * @param task
	 * @return 返回Integer值为0:添加失败,1:添加成功
	 */
	Integer insertTask(Task task);

	/**
	 * 查询任务
	 *
	 * @param map map.key:查询条件
	 *            map.value:查询条件值
	 * @return
	 */
	List<Task> findAllTasks(Map<String, String> map);
}
