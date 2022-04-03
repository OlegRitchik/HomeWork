package home_work_2.loops;

import java.util.Scanner;

public class loops4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");

        double first = in.nextDouble();
        int second = in.nextInt();

        double result = 1;

        for (int i = 1; i<=second; i++){
            result = result * first;
        }
        System.out.println(first + " ^ " + second + " = " + result);
    }
}
