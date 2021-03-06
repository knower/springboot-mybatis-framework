package com.monkeycoding.xyz.entity;

import java.util.ArrayList;
import java.util.List;

public class Task {
	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column task.id
	 *
	 * @mbggenerated Sat Jan 23 13:12:47 CST 2016
	 */
	private Integer id;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column task.task_name
	 *
	 * @mbggenerated Sat Jan 23 13:12:47 CST 2016
	 */
	private String taskName;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column task.created
	 *
	 * @mbggenerated Sat Jan 23 13:12:47 CST 2016
	 */
	private Long created;

	private List<TaskItem> taskItemList = new ArrayList<TaskItem>();

	public List<TaskItem> getTaskItemList() {
		return taskItemList;
	}

	public void setTaskItemList(List<TaskItem> taskItemList) {
		this.taskItemList = taskItemList;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column task.id
	 *
	 * @return the value of task.id
	 * @mbggenerated Sat Jan 23 13:12:47 CST 2016
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column task.id
	 *
	 * @param id the value for task.id
	 * @mbggenerated Sat Jan 23 13:12:47 CST 2016
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column task.task_name
	 *
	 * @return the value of task.task_name
	 * @mbggenerated Sat Jan 23 13:12:47 CST 2016
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column task.task_name
	 *
	 * @param taskName the value for task.task_name
	 * @mbggenerated Sat Jan 23 13:12:47 CST 2016
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName == null ? null : taskName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column task.created
	 *
	 * @return the value of task.created
	 * @mbggenerated Sat Jan 23 13:12:47 CST 2016
	 */
	public Long getCreated() {
		return created;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column task.created
	 *
	 * @param created the value for task.created
	 * @mbggenerated Sat Jan 23 13:12:47 CST 2016
	 */
	public void setCreated(Long created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Task{" +
				"id=" + id +
				", taskName='" + taskName + '\'' +
				", created=" + created +
				", taskItemList=" + taskItemList +
				'}';
	}
}