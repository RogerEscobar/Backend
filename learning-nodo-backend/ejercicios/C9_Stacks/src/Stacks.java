import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack <Integer> pila = new Stack<>();
        System.out.println("Lista vacia: " + pila);
        System.out.println("Esta vacia?" + pila.isEmpty());

        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        for (Integer pilita : pila){
            System.out.println(pilita);
        }

        System.out.println("Pila: " + pila);
        System.out.println("Pila vacia? " +pila.isEmpty());

        pila.pop();

        System.out.println("Esta el 4? " + pila.search(4));
        System.out.println("Último agregado: " + pila.peek());

    }
}

