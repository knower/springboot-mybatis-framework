package com.monkeycoding.xyz.service;

import com.monkeycoding.xyz.entity.Task;
import com.monkeycoding.xyz.entity.TaskItem;
import com.monkeycoding.xyz.mapper.TaskItemMapper;
import com.monkeycoding.xyz.mapper.TaskMapper;
import com.monkeycoding.xyz.service.api.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by czn on 2016/1/23.
 */
@Service("taskService")
@Transactional(rollbackFor = Exception.class)
public class TaskServiceImpl implements ITaskService {

	@Autowired
	private TaskMapper taskMapper;

	@Autowired
	private TaskItemMapper taskItemMapper;

	@Override
	public Integer insertTask(Task task) {
		System.out.println("==============================================");
		int flag = 0;
		try {
			int pk = taskMapper.insertSelective(task);
			if (pk > 0) {
				pk = task.getId();
				System.out.println(task.getId());

				List<TaskItem> taskItems = task.getTaskItemList();
				for (TaskItem tt : taskItems) {
					tt.setTask(task);
					tt.setTaskId(pk);
					tt.setCreated(System.currentTimeMillis() / 1000);
					int ttpk = taskItemMapper.insertSelective(tt);
					if (ttpk > 0) {
						ttpk = tt.getId();
						System.out.println(ttpk);
					}
				}

				flag = 1;
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			throw new RuntimeException("method for [insertTask] exception.");
		}

		return flag;
	}

	@Override
	public List<Task> findAllTasks(Map<String, String> map) {
		List<Task> tasks = taskMapper.findAllTasks(map);

		for (Task t : tasks) {
			System.out.println(t.toString());
		}

		return tasks;
	}
}
