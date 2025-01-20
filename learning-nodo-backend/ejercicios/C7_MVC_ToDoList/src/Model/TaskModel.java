package Model;

import java.util.ArrayList;
import java.util.Collections;

public class TaskModel {
    private ArrayList<String>taskname;
    public TaskModel () {
        this.taskname = new ArrayList<>();
    }

    public void addTask(String taskName) {
        this.taskname.addAll(Collections.singleton(taskName));
    }

    public ArrayList<String> getTaskname() {
        return taskname;
    }
}
