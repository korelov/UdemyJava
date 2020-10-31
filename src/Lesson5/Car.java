package Lesson5;

public class Car {
    String color;
    String engine;
    int speed;

    //создаетм два метода , увеличиваем скорость или уменьшаем
    int gaz(int skorost) {
        speed += skorost; //если мы зададим скорость то , спид увеличит на скорость
        return speed; // вернем новое значение
    }

    int tormoz(int skorest) {
        speed -= skorest;
        return speed;
    }

    void showInfo() {  //это вывод инф
        System.out.println("cvet: " + color + " motor " + engine + " skorost " + speed);
    }
}
    //теперь вызываем эти методы
    class Car2{
        public static void main(String[] args) {
            Car c1 =new Car();
            c1.color = "white";
            c1.engine = "v6";
            c1.speed = 60;
            c1.showInfo();// вызвали метод инфо
            c1.gaz(30); //вызвали газ и показали инфо
            c1.showInfo();
            c1.tormoz(90);  //вызвали тормоз и показали инфо
            c1.showInfo();

        }
    }





