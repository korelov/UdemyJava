package Lesson2;

/**
 * byte 8 bit -128 127
 * short 16 bit -32768 32767
 * int 32 bit - 2147483648  2147483647    defaul
 * long 64 bit -9223372036854775808 9223372036854775807
 *
 * float 32 bit  3.4e-38 3.4e+38
 * double 64 bit 1.7e-308 1.7e+308  defaul
 *
 * char 16bit 0 65535
 * boolean  true false
 */

public class DataType {
    public static void main(String[] args) {

        //тип переменной  имя переменной = значение;

        byte b1 = 21;
        short s1 = -435;
        int b3 = 23_333;
        long l1 = 1000;
        long l2 = 3_333_333_333L; // пишим с буквой L или l т.к. по умолчанию считает как int
        float f1 = 3.14F;
        float f2 = 3.14f; // без F или f будут восприниматься как double
        double d1 = 3.14;
        char c1 = 'a'; //символ в одинарных ковычках и только один, пробел это тоже символ

        boolean bool1 = true;
        boolean bool2 = false;

        //Система счислений

        int a1 = 60;
        int a2 = 0b111100;  //представили число 60 в двоичной системе  binary
        int a3 = 074; //восмеричная система Octal
        int a4 = 0x3c; // в Hecadecimal

        int a5 = 1_000_000;  // более читабельно выглядит ! для удобства


        System.out.println(a4);

    }
}
