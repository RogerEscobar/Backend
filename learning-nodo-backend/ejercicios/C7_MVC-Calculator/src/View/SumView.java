package View;

import java.util.Scanner;

public class SumView {
    public void showResult (int result){
        System.out.print("El resultado es: " + result);
    }
    public int catchNumber (){
        Scanner read = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        return read.nextInt();
    }
}
