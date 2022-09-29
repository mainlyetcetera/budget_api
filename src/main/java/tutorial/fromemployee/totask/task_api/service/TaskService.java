package tutorial.fromemployee.totask.task_api.service;

import java.util.List;
import java.util.Optional;

import tutorial.fromemployee.totask.task_api.entity.TaskEntity;

public interface TaskService {
    List<TaskEntity> findAllTasks();
    Optional<TaskEntity> findById(Long id);
    TaskEntity saveTask(TaskEntity taskEntity);
    TaskEntity updateTask(TaskEntity taskEntity);
    void deleteTask(Long id);
}
