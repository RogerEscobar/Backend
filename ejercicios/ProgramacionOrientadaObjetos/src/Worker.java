public class Worker {
    public void working(){
        System.out.println("Trabajando");
    }
}
class Developer extends Worker {
    @Override
    public void working() {
        System.out.println("Escribiendo el código");
    }
}
class Designer extends Worker {
    @Override
    public void working() {
        System.out.println("Diseñando la interfaz");
    }
}
