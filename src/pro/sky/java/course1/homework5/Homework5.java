package pro.sky.java.course1.homework5;

import java.util.Arrays;
import java.util.Random;

public class Homework5 {

    public static void main(String[] args) {

        int[] arr = generateRandomArray();

        // Задание 1

        int totalSum = 0;
        for (int k : arr) {
            totalSum = totalSum + k;
        }
        System.out.println("Сумма трат за месяц составила: " + totalSum + " рублей.");
        System.out.println();


        // Задание 2

        int maxSum = -1;
        int minSum = 200_000;
        for (int current : arr) {
            if (current > maxSum) {
                maxSum = current;
            } else if (current < minSum) {
                minSum = current;
            }
        }

        System.out.println("Минимальная сумма трат за день составила: " + minSum + " рублей.");
        System.out.println("Максимальная сумма трат за день составила: " + maxSum + " рублей.");

        System.out.println();


        // Задание 3

        double averageSum = 0;
        for (int j : arr) {
            averageSum = (averageSum + j) / 30;
        }
        System.out.println("Средняя сумма трат за месяц составила: " + averageSum + " рублей.");

        System.out.println();

        // Задание 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int n = reverseFullName.length - 1; n >=0; n-- ) {
            System.out.print(reverseFullName[n]);

        }
        System.out.println();
        System.out.println();

        // ПОВЫШЕННАЯ СЛОЖНОСТЬ Задание 5

        int [][] matrix = new int [3][3];
        for (int m = 0; m < matrix.length; m++) {
            for (int i = 0; i < matrix.length; i++) {

                matrix [m] [i] = 1;
            }
        }

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Повышенная сложность. Задание 6


        int [] figures = {5, 4, 3, 2, 1};
        int [] figuresReverse = new int [figures.length];

        System.out.println(Arrays.toString(figures));

        for (int i = 0; i < figures.length; i++) {
            figuresReverse[i] = figures[figures.length - i - 1];
        }

        System.out.println(Arrays.toString(figuresReverse));

        System.out.println();

        // Повышенная сложность. Задание 7
        
        int [] sample = {5, 8, 2, 3, 9};
        System.out.println(Arrays.toString(sample));

        int w = sample.length;

        for (int i = 0; i <= w/2; i++) {
            int temp = sample [w-i-1];
            sample [w-i-1] = sample[i];
            sample[i] = temp;

        }
        System.out.println(Arrays.toString(sample));

        System.out.println();

        /* Очень сложно. Задания 8 и 9 - планирую осилить....

        int [] hard = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};

            }*/


        }

        public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}


