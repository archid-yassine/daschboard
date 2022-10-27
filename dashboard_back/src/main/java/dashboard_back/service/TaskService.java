package dashboard_back.service;


import dashboard_back.DTO.CountType;
import dashboard_back.entity.Task;
import dashboard_back.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {
    private TaskRepository taskRepository;

    public List<Task> getTasks() {
      return taskRepository.findAll();
    }

    public Task addTask(Task task) {
        return taskRepository.save(task);
    }


    public boolean deleteTaskByID(int id) {
        Task t=taskRepository.getById(id);
        if(t!=null){
            taskRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Task getTaskByID(int id) {
        return taskRepository.findById(id).orElse(null);

    }


    public List<CountType> getPercentageGroupByType() {
        return taskRepository.getPercentageGroupByType();
    }
}
