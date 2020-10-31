package Homework;

public class BankAccount {
 int id;
    String name;
    Double balance;

    double popolbebieScheta(){
        double popolnenie = balance*2;
        return popolnenie;

    }
    double snyatieSoScheta(){
        double snyatie = balance/10;
        return snyatie;

    }
}
class ShowInfo{
    public static void main(String[] args) {
        BankAccount bA = new BankAccount();

        bA.id = 2;
        bA.name = "Maksim";
        bA.balance = 228.28;

        System.out.println(bA.id);
        System.out.println(bA.name);
        System.out.println(bA.popolbebieScheta());
        System.out.println(bA.snyatieSoScheta());
    }


}

