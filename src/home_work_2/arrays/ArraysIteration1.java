package home_work_2.arrays;
import static home_work_2.arrays.ArraysUtils2.arrayFromConsole;

public class ArraysIteration1 {
    public static void main(String[] args) {
        methodCon();
        int[] container = arrayFromConsole();
        System.out.println("Введенные элементы массива:");
        for (int i = container.length - 1; i >= 0; i--) {
            System.out.print(" " + container[i] + "\n");
        }
    }

    private static int[] methodCon() {
        int[] s =  arrayFromConsole();
        System.out.println("Введенные элементы массива:");
        for (int i = 0; i < s.length; i++) {
            System.out.print(" " + s[i] + "\n");
        }
        return s;
    }
}

