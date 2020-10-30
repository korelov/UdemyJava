package Lesson4;

public class BankAccount {

    int id;
    String name;
    double balance;

    public static void main(String[] args) {

       // BankAccount bA = new BankAccount();
        // название класса , референс тип данных название класса
        // тип данных  имя переменной = значение
        // new BankAccount это вызов конструктора на создание обьекта
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Maksim";
        MyAccount.balance = 12.36;


        //если не зададим что будем выводить то у примитивных типов данных будет 0
        /*    Дефолтные значения
            primiyive
            byte, short,int ,long = 0
            double, float = 0.0
            char  или 0
            boolean = false

            reference
            string
            BankAccount
            Car и т.д.     будет null (ничто)
         */
        YourAccount.id = 2;
        YourAccount.name = "Mike";
        YourAccount.balance = 3.36;

        HisAccount.id = 3;
        HisAccount.name = "Ivan";
        HisAccount.balance = 121.36;

        System.out.println(HisAccount.balance);

    }
}
