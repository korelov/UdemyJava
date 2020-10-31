package Lesson5;

public class Human {
    String name;
    car3 car;
    BankAccount bA;

    void info(){
        System.out.println("name " + name + " cvet mashini " + car.color + " balance " + bA.balance);
        System.out.println("Ba id " + bA.id);
    }

}
class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Maksim";
        h.car = new car3("red","v6");
        h.bA = new BankAccount(1,245.56);
        h.info();
    }

}



class car3 {
    car3(String c, String e) {
        color = c;
        engine = e;

    }
    String color;
    String engine;
}
class BankAccount {
    BankAccount(int id2 , double balance2) {
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;
}