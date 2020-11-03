package Lesson6;

public class Employee {
/*  Это конструкторы можно записать по другому
 Employee(int id2, String surname2, int age2){
        id=id2;
        surname=surname2;
        age=age2;
    }
    Employee(String surname2, int age2){
        surname=surname2;
        age=age2;
    }
 */

    Employee(int id2, String surname2, int age2){
        this(surname2,age2); //вызываем коструктор с двумя параметрами
        id=id2;

}
    Employee(String surname3, int age3){
        surname=surname3;
        age=age3;
    }


    int id;
    String surname;
    int age;
    double salary;
    String department;
}


class EmployeeTest{
    public static void main(String[] args) {
       // Employee emp = new Employee();
       // System.out.println(emp.id);


    }


}