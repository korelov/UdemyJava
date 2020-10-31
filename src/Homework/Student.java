package Homework;

public class Student {
    int studentId;
    String Name;
    String Surname;
    int yearCourse;
    double Math;
    double Econimy;
    double Lang;
}

    class StudentTest{
    public static void main(String[] args) {
      Student St1 = new Student();
      Student St2 = new Student();
      Student St3 = new Student();

      St1.Name = "Maksim";
      St1.Surname = "Korelov";
      St1.Math = 4.5;
      St1.Econimy = 4.2;
      St1.Lang =3.4;

      St2.Name = "Anton";
      St2.Surname ="Petrov";
      St2.Math = 3.4;
      St2.Econimy =5;
      St2.Lang =4;

      St3.Name = "Tamerlan";
      St3.Surname ="Basilev";
      St3.Math = 2.4;
      St3.Econimy =2;
      St3.Lang =4.1;

            System.out.println("Средняя оценки по трем предметам " + St1.Name + " " + St1.Surname + " " +  (St1.Math+St1.Econimy+St1.Lang)/3);
            System.out.println("Средняя оценка по трем предметам "+ St2.Name+ " " + St2.Surname + " " + (St2.Math+St2.Econimy+St2.Lang)/3);
            System.out.println("Средняя оценка по трем предметам "+ St3.Name+ " " + St3.Surname + " " + (St3.Math+St3.Econimy+St3.Lang)/3);

        }

    }



