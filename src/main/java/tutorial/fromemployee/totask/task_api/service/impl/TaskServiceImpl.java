package tutorial.fromemployee.totask.task_api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import tutorial.fromemployee.totask.task_api.entity.TaskEntity;
import tutorial.fromemployee.totask.task_api.repository.TaskRepository;
import tutorial.fromemployee.totask.task_api.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<TaskEntity> findAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Optional<TaskEntity> findById(Long id) {
        return taskRepository.findById(id);
    }

    @Override
    public TaskEntity saveTask(TaskEntity taskEntity) {
        return taskRepository.save(taskEntity);
    }

    @Override
    public TaskEntity updateTask(TaskEntity taskEntity) {
        return taskRepository.save(taskEntity);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

}
