package ch.cern.todo.repositories;

import ch.cern.todo.models.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Tasks, Long> {
//    public List<Tasks> findByTasks(String task_name);
    public List<Tasks> findByFinishedTrue();
    public List<Tasks> findByFinishedFalse();
    public List<Tasks> findAll();
    public Tasks getById(Long id);
}
