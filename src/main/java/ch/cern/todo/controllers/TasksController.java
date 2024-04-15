package ch.cern.todo.controllers;

import ch.cern.todo.models.Tasks;
import ch.cern.todo.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TasksController {
    @Autowired
    private TaskService taskService;
    @GetMapping("/")
    public ResponseEntity<List<Tasks>> getAllTasks() {
        return ResponseEntity.ok(taskService.getAllTasks());
    }
    @GetMapping("/finished")
    public ResponseEntity<List<Tasks>> getFinishedTasks() {
        return ResponseEntity.ok(taskService.findFinishedTasks());
    }
    @GetMapping("/unfinished")
    public ResponseEntity<List<Tasks>> getUnfinishedTasks() {
        return ResponseEntity.ok(taskService.findUnfinishedTasks());
    }
    @PostMapping("/")
    public ResponseEntity<Tasks> createTask(@RequestBody Tasks tasks) {
        return ResponseEntity.ok(taskService.createTask(tasks));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Tasks> updateTask(@PathVariable Long id, @RequestBody Tasks tasks) {
        tasks.setTask_id(id);
        return ResponseEntity.ok(taskService.updateTask(tasks));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> getAllTasks(@PathVariable Long id) {
        taskService.deleteTask(id);
        return ResponseEntity.ok(true);
    }
}
