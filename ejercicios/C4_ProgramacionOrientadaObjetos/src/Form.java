public class Form {
    public void draw() {
        System.out.println("Dibujando una forma");
    }
}
class Circle extends Form {
    public void draw(){
        System.out.println("Dibujando un circulo");
    }
}
class Frame extends Form {
    public void draw() {
        System.out.println("Dibujando un cuadrado");
    }
}
class Triangle extends Form {
    public void draw(){
        System.out.println("Dibujando un triangulo");
    }

}