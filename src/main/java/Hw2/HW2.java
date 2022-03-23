package Hw2;

public class HW2 {
    public static void main(String[] args) {
        checkSumSign(5, 6 );
        checkNumbers(3);
        checkNumber(0);
        print("ffff", 3);
        checkYear(2020);

    }
    //1. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static void checkSumSign(int a, int b) {
        boolean s = (a+b)>10 && (a+b)<=20 ;
        System.out.println(s);
    }
    //2. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void checkNumbers(int a) {
        System.out.println((a>=0)?"число положительное" : "число отрицательное");
    }
    //3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static void checkNumber(int a) {
        boolean s = (a)>0;
        System.out.println(s);
    }
    //4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void print(String b, int a){
        int c =0;
        while (a>c){
            System.out.println(b);
            c++;
        }
    }
    //5. * Написать метод, который определяет, является ли год високосным,
    // и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Год високосный!");
        } else {
            System.out.println(year + "Год не високосный!");
        }
    }
}
