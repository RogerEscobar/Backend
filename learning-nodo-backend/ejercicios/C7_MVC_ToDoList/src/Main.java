import Controller.TaskController;
import Model.TaskModel;
import View.TaskView;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TaskModel taskModel = new TaskModel();
        TaskController taskController = new TaskController(taskModel);
        TaskView taskView = new TaskView();

        String task = taskView.viewTask();
        taskController.addtask(task);
        taskView.viewAllTask("Lista de pendientes");;
        taskController.showtask();
    }
}