package Homework;

public class OverloadedMethod {


    int sum (){
        int a = 0;
        System.out.println(a);
        return a;
    }

    int sum (int a1){
        System.out.println(a1);
        return a1;
    }

    int sum (int a2, int b2){
        System.out.println(a2+b2);
        return a2+b2;
    }

    int sum (int a3, int b3 , int c3){
        System.out.println(a3+b3+c3);
        return a3+b3+c3;
    }
    int sum (int a4 , int b4 , int c4 , int g4){
        System.out.println(a4+b4+c4+g4);
        return a4+b4+c4+g4;

    }

}

class OverloadedMethodTest {
    public static void main(String[] args) {
        OverloadedMethod om = new OverloadedMethod();
        om.sum();
        om.sum(3);
        om.sum(2,5);
        om.sum(5,2,6);
        om.sum(3,6,1,6);

    }


}
