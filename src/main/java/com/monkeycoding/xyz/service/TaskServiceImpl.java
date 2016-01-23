package com.monkeycoding.xyz.service;

import com.monkeycoding.xyz.entity.Task;
import com.monkeycoding.xyz.mapper.TaskMapper;
import com.monkeycoding.xyz.service.api.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by czn on 2016/1/23.
 */
@Service("taskService")
@Transactional(rollbackFor = Exception.class)
public class TaskServiceImpl implements ITaskService {

    @Autowired
    private TaskMapper taskMapper;

    @Override
    public Integer insertTask(Task task) {
        System.out.println("==============================================");
        int flag = 0;
        try {
            int pk = taskMapper.insertSelective(task);
            if (pk > 0) {
                System.out.println(task.getId());
                flag = 1;
            }
            System.out.println("pk " + pk);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw new RuntimeException("method for [insertTask] exception.");
        }

        return flag;
    }
}
