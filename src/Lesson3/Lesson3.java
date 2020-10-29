package Lesson3;

public class Lesson3 {
    public static void main(String[] args) {

        int a=11, b=3;


        System.out.println(a/b);
        //узнаем остаток с оператором %
        int ocratok = a%b;
        System.out.println(ocratok);

        //Унарные операторы ++ --
        // ++  прибовляем единицу -- отнимаем единицу
        // prefix и postfix
        // ++a   a++


        int x =5;
        int y = 3;

        //int z= x - y++;
        // сначала отнимаем от х у потом ++
       //System.out.println(z);

        int m= x- ++y;
        System.out.println(m);
        //перед тем как отнять от х у , у увеличиваем на единицу

        //a=5
        //++a- --a -a-- +a++
        //6 - 5 - 5 + 4


        // Оперетор присвоения = !! это не равно .
        //int a =5;
       // a = a +3 ; // 5 +3 в итоге а = 8
       // a+=3;  //сначала прибавь потом присвой.
    }
}
