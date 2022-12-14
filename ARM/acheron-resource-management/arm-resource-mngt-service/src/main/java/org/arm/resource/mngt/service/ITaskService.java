package org.arm.resource.mngt.service;

import java.util.List;

import org.arm.resource.mngt.entity.Task;

public interface ITaskService {

	public List<Task> getAllTask();
	
	Task getById(int id);

	public void createTasks(Task tasks);
	
	List<Task> getByDurationLessThan(float availableHours);

}
