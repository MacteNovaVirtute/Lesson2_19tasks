package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task 1:");
        char[] array1 = {'x', 'y', 'z'};
        displayArray(array1);

        System.out.println("Task 2:");
        int[] array2 = {80, 85, 90};
        char[] newCharArr = intToChar(array2);
        for(int i = 0; i< newCharArr.length; i++) {
            System.out.print(newCharArr[i]);
        }
        System.out.println("");

        System.out.println("Task 3:");
        System.out.println(returnGreaterValue(10, 10));

        System.out.println("Task 4:");
        System.out.println(returnGreaterFrom3(10, 10, 20));

        System.out.println("Task 5:");
        System.out.println(returnGreaterFrom5(10, 12, 14, 16, 20));

        System.out.println("Task 6:");
        System.out.println(charArrayToString(new char[] {'X', 'Y', 'Z'}));

        System.out.println("Task 8:");
        int[] arrayInt8 = { 20, 30, 3, 10};
        System.out.println(firstIndexEqualValue(arrayInt8, 10));

        System.out.println("Task 9:");
        int[] arrayInt9 = { 20, 30, 5, 10};
        System.out.println(lastIndexEqualValue(arrayInt9, 5));

        System.out.println("Task 10:");
        System.out.println(calculateFactorial(5));

        System.out.println("Task 11:");
        System.out.println(checkIfLeap (2000));


        System.out.println("Task 12:");
        int[] arrayInt12 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        displayMultiple(arrayInt12, 3);

        System.out.println("Task 13:");
        int[] arrayInt13 = new int[] {2, 4, 6, 3, 5};
        int[] sortedArray = sortMethod(arrayInt13);
        for(int i = 0; i< sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println();

        System.out.println("Task 14:");
        byte[] arrayByte13 = new byte[] {3, 2, 1, 1, 4};
        System.out.println(checkDublicates(arrayByte13));

        System.out.println("Task 15:");
        int[] multArray15_1 = new int[] {1, 2, 3, 4, 5};
        int[] multArray15_2 = new int[] {1, 2, 3, 4, 5};
        int[] arrayMultiplied = arrMultiplied(multArray15_1, multArray15_2);
        for(int i = 0; i< arrayMultiplied.length; i++) {
            System.out.print(arrayMultiplied[i] + " ");
        }




    }

    //1) принимает массив чаров, выводит его на экран//

    static void displayArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //2) принимает массив интов, возвращает массив чаров, каждый символ в позиции массива соответствует коду символа передаваемого инта
    static char[] intToChar(int[] array2) {
        char[] returnArrayChar = new char[array2.length];
        for (int i = 0; i < array2.length; i++) {
            returnArrayChar[i] = (char) (array2[i]);
        }
        return returnArrayChar;
    }

    //3) приминает 2 инта, а и б, возвращает большее их этих 2х чисел
    //Task 3
    static int returnGreaterValue(int a, int b) {
        if (a > b) {
            return a;
        } else if (a<b) {
            return b;
        }else{
            System.out.println("Both values are equal");
        }
        return a;
    }

    // 4) принимает 3 инта, возвращает большее из них
    static int returnGreaterFrom3(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    // 5) приминает 5 интов, возвращает большее из них
    static int returnGreaterFrom5(int a, int b, int c, int d, int e) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        if (e > max) {
            max = e;
        }
        return max;
    }

    // 6) принимает массив чаров, возвращает строку состоящую из символов массива
    static String charArrayToString(char[] array) {
        String charToString = "";
        for (int i = 0; i < array.length; i++) {
            charToString += array[i];
        }
        return charToString;
    }

    // 8) принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с начала массива. Если значения в массиве нет возвращает -1
    static int firstIndexEqualValue(int[] arr, int value) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    //9) принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с конца массива. Если значения в массиве нет возвращает -1
    static int lastIndexEqualValue(int[] arr, int value) {
        for(int i = arr.length -1; i > 0; i--) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // 10) метод принимает инт, и возвращает факториал от заданого инта
    static int calculateFactorial(int value) {
        int factorialValue = 1;
        while (value > 0) {
            factorialValue *= value;
            value--;
        }
        return factorialValue;
    }

    // 11) принимает инт год, и возвращает тру если год высокосный
    static boolean checkIfLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // 12) приминает массив интов и число, выводит на екран только елементы массива которые кратны этому числу
    static void displayMultiple(int[] arr, int value) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % value == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    // 13) метод принимает массив интов сортирует его по возрастанию
    static int[] sortMethod(int[] array) {
        int var;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    var = array[i];
                    array[i] = array[j];
                    array[j] = var;
                }
            }
        }
        return array;
    }

    //14) принимает массив байт, если в массиве есть повторяющиеся елементы, возвращает тру
    static boolean checkDublicates(byte[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // 15) принимает два массива интов одинаковых по длинне, возращает массив интов который состоит из перемноженных елементов входящих массивов
    static int[] arrMultiplied(int[] arr1, int[] arr2) {
        int[] multipliedArray = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            multipliedArray[i] = arr1[i] * arr2[i];
        }
        return multipliedArray;
    }
    


}

