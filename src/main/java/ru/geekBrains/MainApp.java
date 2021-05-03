package ru.geekBrains;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Java3. Домашняя работа №6. JUnit.");
    }


    /**
     * 1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
     *    Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
     *    идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку, иначе в методе
     *    необходимо выбросить RuntimeException.
     * */
    public static int[] task1(int[] arr) throws RuntimeException {

        int lastFourPos = 0;
        boolean fourExists = false;

        for (int i=0; i < arr.length; i++ ) {
            if (arr[i] == 4) {
                lastFourPos = i;
                fourExists = true;
            }
        }

        if (!fourExists) {
            throw new RuntimeException("В предоставленом массиве отстутствует элемент со значением 4");
        } else {
            return Arrays.copyOfRange(arr, lastFourPos+1, arr.length);
        }
    }

    /**
     * Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы,
     * то метод вернет false; Если содержит что то кроме 1 и 4, то метод вернет false; Написать набор тестов для этого
     * метода (по 3-4 варианта входных данных).
     * */
    public static boolean task2(int[] arr) {

        if (Arrays.stream(arr).filter(x -> x==1).count() == 0) { //в массиве нет 1
            return false;
        }
        if (Arrays.stream(arr).filter(x -> x==4).count() == 0) { //в массиве нет 4
            return false;
        }
        if (Arrays.stream(arr).filter(x -> (x!=4 && x!=1)).count() > 0) { //в массиве есть что то кроме 1 и 4
            return false;
        }

        return true;
    }
}
