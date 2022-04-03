package home_work_2.loops;

import java.util.Scanner;

public class loops3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");

        String numberSrt = in.next();
        int number;

        try {
            double i = Double.parseDouble(numberSrt);
        } catch (Exception InputMismatchException) {
            System.out.println("Введено не число!");
            return;
        }

        try {
            number = Integer.parseInt(numberSrt);
        } catch (Exception InputMismatchException) {
            System.out.println("Введено не целое число!");
            return;
        }

        int result = 1;

        Integer newNumber = number;
        StringBuilder builder = new StringBuilder(newNumber.toString());
        builder.reverse();
        int reverseNumber = Integer.parseInt(builder.toString());

        while (reverseNumber != 0) {
            int ostatok = reverseNumber % 10;
            result = ostatok * result;
            reverseNumber = reverseNumber / 10;
            System.out.print(ostatok);
            if (reverseNumber != 0) {
                System.out.print(" * ");
            }
        }
        System.out.print(" = " + result);
    }
}




