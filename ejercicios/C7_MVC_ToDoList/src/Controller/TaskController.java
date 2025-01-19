package Controller;

import Model.TaskModel;

import java.util.ArrayList;

public class TaskController {
    private TaskModel taskModel;
    public TaskController (TaskModel taskModel){
        this.taskModel = taskModel;
    }
    public void addtask(String task){
        taskModel.addTask(task);
    }
    public void showtask(){
        for (String task: taskModel.getTaskname()){
            System.out.println(task);
        }
    }
}
