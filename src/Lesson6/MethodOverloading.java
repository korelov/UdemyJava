package Lesson6;

public class MethodOverloading {
// название этих 3х методов можно обьеденить в один !
    /*
    перегруженные методы имеют одинаковые имена и разный список параметров !


     */
    /* можно назвать все эти три метода просо show
    void showInt(int i1){
        System.out.println(i1);
    }
    void showboolean(boolean b1){
        System.out.println(b1);
    }
    void showSting(String s1) {
        System.out.println(s1);
    }

     */
void show(int i1){
    System.out.println(i1);
}
    void show(boolean b1){
        System.out.println(b1);
    }
    void show(String s1) {
        System.out.println(s1);

    }
    //можно еще добавить вторую переменную и компилятор не запутается в данных
    void show(int a, int b){
        System.out.println(a+b);

    }



}

class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        mO.show(2);
        boolean b = true;
        mO.show(b);
        String s ="Maksim";
        mO.show(s);
        mO.show(1,3);
    }
}
