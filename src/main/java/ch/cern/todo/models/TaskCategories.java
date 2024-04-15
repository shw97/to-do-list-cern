package ch.cern.todo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TaskCategories")
public class TaskCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long category_id;
    private String category_name;
    private String category_description;
    public Long getCategory_id() {
        return category_id;
    }
    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }
    public String getCategory_name() {
        return category_name;
    }
    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
    public String getCategory_description() {
        return category_description;
    }
    public void setCategory_description(String category_description) {
        this.category_description = category_description;
    }
}
