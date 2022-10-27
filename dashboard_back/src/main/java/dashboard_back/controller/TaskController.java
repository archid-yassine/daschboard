package dashboard_back.controller;


import dashboard_back.DTO.CountType;
import dashboard_back.entity.Task;
import dashboard_back.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/task")
    public List<Task> getTasks(){
        return taskService.getTasks();
    }

    @PostMapping("/addtask")
    public Task addTask(@RequestBody Task task){
        return taskService.addTask(task);
    }

    @DeleteMapping("/deleteTaskById/{id}")
    public boolean deleteTaskByID(@PathVariable int id) {
        return taskService.deleteTaskByID(id);
    }

    @GetMapping("/getTaskbyID/{id}")
    public Task getTaskById(@PathVariable int id){
        return taskService.getTaskByID(id);
    }


    @GetMapping("/task/data/PercentCountType")
    public List<CountType> getPercentageGroupByType(){
        return taskService.getPercentageGroupByType();
    }





}
