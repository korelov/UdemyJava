package Homework;

public class Employee {
 double salary;
 String surname;

    Employee(int id1,String surname1,int age1,double salary1,String department1){
        salary=salary1;
        surname=surname1;


    }

    double zpVDvoe (){
        double newZP = salary*2;
        return newZP;
    }

}
class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Maksim",37,100,"MFO");
        Employee e2 = new Employee(2,"Nkolay",25,50,"bank");



        System.out.println(e1.surname + " старая зп = " + e1.salary +" зп в 2 раза больше = " + e1.zpVDvoe());
        System.out.println(e2.surname + " " + e2.zpVDvoe());
    }


}