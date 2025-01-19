/*
//Código original no sigue KISS
public class NumberCheck {
    public void checkNumber(int number){
        if (number > 0) {
            System.out.println("El número es positivo");
        }
        else {
            if (number < 0){
                System.out.println("El número es negativo");
            }
            else {
                System.out.println("El número es cero");
            }
        }
    }
}*/

//Código aplicando KISS se reduce la anidación con else if
public class NumberCheck{
    public void checkNumber(int number) {
        if (number >0) {
            System.out.println("El número es positivo");
        }
        else if (number <0){
            System.out.println("El número es negativo");
        }
        else {
            System.out.println("El número es cero");
        }
    }

}