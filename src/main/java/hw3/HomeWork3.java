package hw3;

import java.util.Arrays;

/**
 * @Author Александр Ключка
 * @created 2022-04-04  11:20
 **/

public class HomeWork3 {
    public static void main(String[] args) {
        //1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
        // [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;

        int[] array01 = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        System.out.println("первое задание");
        System.out.println(Arrays.toString(changing(array01)));
        System.out.println("\n");

        //2 Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int[] arr2 = new int[100];
        System.out.println("второе задание:");
        createArr(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println("\n");

        //3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив
        // и умножающий числа меньше 6 на 2;
        int[] arrayNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        modifierForArrays(arrayNumbers);
        System.out.println("третье задание");
        System.out.println(Arrays.toString(arrayNumbers));
        System.out.println("\n");


        //4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
        // то есть [0][0], [1][1], [2][2], …, [n][n];
        System.out.println("четвертое задание");
        createSquareArray(5);
        System.out.println("\n");

        //5 Написать метод, принимающий на вход два аргумента: len и initialValue,
        // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        System.out.println("пятое задание");
        retLenArr(5, 2);


    }

    //1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
// [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
    public static int[] changing(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        return array;
    }

    //2 Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void createArr(int[] array) {
        for (int i = 0; i < 100; i++) {
            array[i] = i;
        }
    }

    //3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив
// и умножающий числа меньше 6 на 2;
    public static void modifierForArrays(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    //4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
    // то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void createSquareArray(int size) {
        int[][] sqrArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sqrArray[i][j] = (i == j || j == (size - i - 1)) ? 1 : (int) (Math.random() * 10);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }
    }

    //5 Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static void retLenArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print( arr[i] + " ");
        }
    }
}



