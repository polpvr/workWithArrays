package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            int[] array = new int[15];

            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100) + 1;
            }

            System.out.println("Початковий вигляд масиву: " + Arrays.toString(array));

            insertionSort(array);

            System.out.println("Відсортований масив: " + Arrays.toString(array));

            Scanner sc = new Scanner(System.in);
            System.out.print("Введіть число для пошуку: ");
            int target = sc.nextInt();

            int index = linearSearch(array, target);

            if (index >= 0) {
                System.out.println("Індекс числа " + target + " у відсортованому масиві: " + index);
            } else {
                System.out.println("Число " + target + " не знайдено у масиві.");
            }
        }

        public static void insertionSort(int[] array) {
            for (int i = 1; i < array.length; i++) {
                int key = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > key) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = key;
            }
        }

        public static int linearSearch(int[] array, int target) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    return i;
                }
            }
            return -1;
        }
    }


