package Homework;

public class StudentTest1 {
    String name;
    double Math;
    double Econimy;
    double Lang;

    void sredneeArifmet(){
        System.out.println(name+" " + (Math+Econimy+Lang)/3 );
    }
}
class student{
    public static void main(String[] args) {
        StudentTest1 st1 = new StudentTest1();
        st1.name = "Maksim";
        st1.Math = 12.5;
        st1.Econimy = 16.5;
        st1.Lang = 1.5;
        st1.sredneeArifmet();
    }
}

