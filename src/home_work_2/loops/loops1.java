package home_work_2.loops;

import java.util.Scanner;

public class loops1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 1 до 16 (включительно): ");

        int number = in.nextInt();
        if (number>16 || number<1) {
            System.out.println("Введено неверное значение!");
            return;
        }
        int result = 1;

        for (int i=1; i<=number; i++){
            result = result * i;
            System.out.print(i);
            if(i==number){
                break;
            }
            System.out.print(" * ");
        }
        System.out.println(" = " +result);

        }
    }





