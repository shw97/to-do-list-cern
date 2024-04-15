package ch.cern.todo.models;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name="tasks")
public class Tasks{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long task_id;
    private String task_name;
    private String task_description;
    private Timestamp deadline;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_categories")
    private TaskCategories task_categories;
    private boolean finished;
    public Tasks(String task_name, boolean finished) {
        this.task_name = task_name;
        this.finished = finished;
    }

    public Tasks() {

    }

    public Long getTask_id() {
        return task_id;
    }
    public void setTask_id(Long task_id) {
        this.task_id = task_id;
    }
    public String getTask_name() {
        return task_name;
    }
    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }
    public String getTask_description() {
        return task_description;
    }
    public void setTask_description(String task_description) {
        this.task_description = task_description;
    }
    public Timestamp getDeadline() {
        return deadline;
    }
    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }
    public TaskCategories getTask_categories() {
        return task_categories;
    }
    public void setTask_categories(TaskCategories task_categories) {
        this.task_categories = task_categories;
    }
    public boolean isFinished() {
        return finished;
    }
    public void setFinished(boolean finished) {
        this.finished = this.finished;
    }
}
