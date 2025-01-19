public class BankAccount {
    String holder = "";
    int number = 0;
    double balance = 0;

    public BankAccount (String holder, int number, double balance){
        this.holder = holder;
        this.number = number;
        this.balance = balance;
    }

    public void deposit (double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Consignación por " + amount + " a la cuenta " + number);
            System.out.println("Titular " + holder);
            System.out.println("Saldo actual " + balance);
        } else {
            System.out.println("No puedes consignar valores negativos");
        }
    }
    public void withdraw (double amount){
            if (amount > 0 && amount <= balance){
                balance -= amount;
                System.out.println("Retiraste " + amount);
                System.out.println("Tu saldo actual es: " + balance);
            } else {
                System.out.println("Error: No puedes retirar un valor superior al saldo o una cantidad negativa");
            }
        }

    }