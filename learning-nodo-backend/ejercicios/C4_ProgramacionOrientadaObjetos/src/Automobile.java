public class Automobile {
    String brand = "";
    String model = "";
    int year = 0;

    public Automobile(String brand, String model, int year){

        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void accelerate (){
        System.out.println("Veo un " + brand + " acelerando en la calle");
    }

    public void curb (){
        System.out.println("y el " + model + " se detiene en el semaforo");

    }
}
