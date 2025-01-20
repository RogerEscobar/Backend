package View;

import java.util.Scanner;

public class TaskView {
    public String viewTask () {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa una tarea");
        return read.nextLine();
    }
    public void viewAllTask(String notification) {
        System.out.println(notification);
    }
}
