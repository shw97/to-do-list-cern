package ch.cern.todo.services;

import ch.cern.todo.models.Tasks;
import ch.cern.todo.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
    public Tasks createTask(Tasks tasks) {
        return taskRepository.save(tasks);
    }
    public List<Tasks> getAllTasks() {
        return taskRepository.findAll();
    }
    public Tasks getTasksById(Long id) {
        return taskRepository.getById(id);
    }
    public List<Tasks> findFinishedTasks(){
        return taskRepository.findByFinishedTrue();
    }
    public List<Tasks> findUnfinishedTasks(){
        return taskRepository.findByFinishedFalse();
    }
    public Tasks updateTask(Tasks tasks) {
        return taskRepository.save(tasks);
    }
    public void deleteTask(Long id) {
        taskRepository.delete(taskRepository.getById(id));
    }
}
