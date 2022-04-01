package HomeWork2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUtils2 {

    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        System.out.println("Введенные элементы массива:");
        System.out.println(Arrays.toString(container));
    }

    public static int[] arrayFromConsole() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] container = new int[size];
        for (int i = 0; i < container.length; i++) {
            System.out.println("Введите " + (i + 1) + " элемент массива:");
            container[i] = in.nextInt();
        }
        return container;
    }
}