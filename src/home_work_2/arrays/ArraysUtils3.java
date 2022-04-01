package HomeWork2.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysUtils3 {
    public static void main(String[] args) {
        int[] container = arrayRandom();
        System.out.println(Arrays.toString(container));
    }

    public static int[] arrayRandom() {
        int length = 5;
        int[] container = new int[length];
        Random rand = new Random();

        int min = 0;
        int max = 99;

        for (int i = 0; i < length; i++) {
            container[i] = rand.nextInt(max - min) + min;
        }
        return container;
    }
}