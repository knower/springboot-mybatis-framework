package com.monkeycoding.xyz;

import com.monkeycoding.xyz.entity.Task;
import com.monkeycoding.xyz.entity.TaskItem;
import com.monkeycoding.xyz.service.TaskServiceImpl;
import com.monkeycoding.xyz.service.api.ITaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(TaskServiceImpl.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class AppTest {

    @Autowired
    ITaskService taskService;

    @Test
    public void test() {
        Task task = new Task();
        task.setTaskName("Hello");
        task.setCreated(System.currentTimeMillis() / 1000);

        List<TaskItem> list = new ArrayList<TaskItem>();

        TaskItem taskItem = new TaskItem();
        taskItem.setTask(task);
        taskItem.setRequestUrl("www.baidu.com");
        task.setCreated(System.currentTimeMillis() / 1000);
        list.add(taskItem);

        task.setTaskItemList(list);

        taskService.insertTask(task);
    }
}
