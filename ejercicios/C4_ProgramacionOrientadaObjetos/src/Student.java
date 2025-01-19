public class Student {
    String name = "";
    String grade = "";
    int age = 0;

    public Student (String name, String grade, int age){
        this.name = name;
        this.grade = grade;
        this. age = age;

    }

    public void studying () {
        System.out.println(name + " de " + age + " años, esta estudiando en el grado " + grade);
    }

}
