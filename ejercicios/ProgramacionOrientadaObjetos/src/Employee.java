public class Employee {
    String name = "";
    String position ="";
    double salary = 0;

    public Employee (String name, String position, double salary ){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void certification (){
        System.out.println("Esta empresa certifica que: "+ name + " opcupa el cargo de: " +position + " con una asignación salarial de: " + salary);
    }
}
