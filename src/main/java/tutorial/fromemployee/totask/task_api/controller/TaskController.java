package tutorial.fromemployee.totask.task_api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tutorial.fromemployee.totask.task_api.entity.TaskEntity;
import tutorial.fromemployee.totask.task_api.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<TaskEntity> findAllTasks() {
        return taskService.findAllTasks();
    }

    @GetMapping("/{id}")
    public Optional<TaskEntity> findTaskById(@PathVariable("id") Long id) {
        return taskService.findById(id);
    }

    @PostMapping
    public TaskEntity saveTask(@RequestBody TaskEntity t) {
        return taskService.saveTask(t);
    }

    @PutMapping
    public TaskEntity updateTask(@RequestBody TaskEntity t) {
        return taskService.updateTask(t);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable("id") Long id) {
        taskService.deleteTask(id);
    }

}
