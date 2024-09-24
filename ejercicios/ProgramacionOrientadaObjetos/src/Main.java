public class Main {
    public static void main(String[] args) {

//        Automobile automobile = new Automobile("Lamborguinni","Aventador", 2019);
//            automobile.accelerate();
//            automobile.curb();
//
//        Book book = new Book("Cien años de soledad", "Gabriel Garcia Marquez", 527);
//            book.author();
//            book.pages();
//            book.readpage();
//
//        Student student = new Student("Miguel", "segundo", 8);
//        student.studying();
//
//        BankAccount bankAccount = new BankAccount("Pedro Perez", 789456123, 10.95 );
//        bankAccount.deposit(23.21);
//        bankAccount.withdraw(3.23);
//
//        Employee employee = new Employee("Pedro Perez","Contador Senior",1457258.99);
//        employee.certification();
//
//        Form[] forms = new Form[3];
//        forms [0] = new Circle();
//        forms [1] = new Frame();
//        forms [2] = new Triangle();
//
//        for (Form form : forms) {
//            form.draw();
//        }
//
//        Instrument[] instruments = new Instrument[3];
//        instruments [0] = new Guitar();
//        instruments [1] = new Piane();
//        instruments [2] = new Drum();
//
//        for (Instrument instrument : instruments){
//            instrument.play();
//        }

        Worker[] workers = new Worker[2];
        workers [0] = new Developer();
        workers [1] = new Designer();

        for (Worker worker : workers){
            worker.working();
        }


    }
}