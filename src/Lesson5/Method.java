package Lesson5;

public class Method {

   /*
    public static void main(String[] args) {}
    public - access modifier
    static - non-sccess modifier(s)
    это необязательные элементы в структуре метода

    void return type ! то что метод нам возращает . это обязат элемент
    main это имя метода
    () это параметры
    {} тело метода
    */
    // создаем наш мервый метод

    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
}
    class Methodinfo {
        public static void main(String[] args) {
            Method M1 = new Method();
            //вывод метода через обращение обьекта м1
            System.out.println(M1.summa(1,2,2));
            //вывод метода через новую переменную
            int semmaTrexChisel = M1.summa(4,4,6);
            System.out.println(semmaTrexChisel);
        }
    }


