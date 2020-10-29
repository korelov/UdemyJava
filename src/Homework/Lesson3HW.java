package Homework;

public class Lesson3HW {
    public static void main(String[] args) {
       int i1 = 5 , i2 = 11;
        double d1 = 5.5 , d2 = 1.3;
        long l = 20l;
        double result = 0;

        result = i2 / d1 + d2 % i1 - l;
        //  (11 / 5.5) + (1.3 % 5) - 20
        // 2 + 1.3 -20 = - 16.3
        System.out.println(result);

        //Чему равны выражения
        // a-- - --a+ ++a + a++ +a a=5
        //5 - 3 + 4 + 4 + 5 = 15
        int a=5;
        System.out.println(a-- - --a+ ++a + a++ +a);

        // ++b - b++ + ++b- --b b=8
        // 9 - 9 + 11 - 10 = 1
        int b=8;
        System.out.println(++b - b++ + ++b- --b);
    }
}
