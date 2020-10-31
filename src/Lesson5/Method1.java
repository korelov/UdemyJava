package Lesson5;


//сделаем два метода , второй метод будет использовать данные 1го метода.
public class Method1 {
    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
    int sredneeArif(int a1, int b1, int c1){
        int result1 = summa(a1, b1, c1)/3;  //вызвали метод сумма и поделили на 3
        return result1;
    }
    /*
        правило LIFO   LAST IN   FIRST OUT
            начинаем работать с среднее арифмет , вызываем сумма . и среднее арифм
            закончит свою работу только когда закончит метод сумма
         */
}
class test1 {
    public static void main(String[] args) {
        Method1 m1 = new Method1();
        //название конструктора всегда совпадает с названием класса !!!!!
        System.out.println(m1.sredneeArif(20,40,60));
    }

}