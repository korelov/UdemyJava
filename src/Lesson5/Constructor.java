package Lesson5;

public class Constructor {
  /*
    Constructor(){} дефолт конструктор для создания нового обьекта
    у любого класса есть коструктор ,
    default создается компилятором , всегда без параметров , тело всегда пустое
    user defines создается нами, может быть с параметрами, тело может быть пустым или нет
    */

    Constructor(String cvet, String motor){
    color = cvet;
    engine = motor;
    }  // коструктор , задали вручную , цвет и мотор , типа стринг
    String color;
    String engine;


}
class test{
    public static void main(String[] args) {
        // т.к. у нас юзер коструктор , то в параметрах нужно указать цвет и мотор
        Constructor car = new Constructor("red","v6");
        System.out.println(car.color +" "+  car.engine);
    }

}







