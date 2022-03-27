package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class BranchingOperator2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите своё имя");
        String name = console.nextLine();

        boolean isVasia = Objects.equals(name, "Вася");
        boolean isAnastasia = Objects.equals(name, "Анастасия");

        if(isVasia){
           System.out.println("Привет");
           System.out.println("Я тебя так долго ждал");
        }

        if(isAnastasia) {
            System.out.println("Я тебя так долго ждал");
        }

        if(!isVasia && !isAnastasia){
            System.out.println("Добрый, а вы кто?");
        }
    }
}
