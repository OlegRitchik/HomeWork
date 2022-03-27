package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class BranchingOperator4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите своё имя");
        String name = console.nextLine();

        boolean isFriend = Objects.equals(name, "Вася");
        boolean isGirl = Objects.equals(name, "Анастасия");

        if(isFriend){
           System.out.println("Привет");
           System.out.println("Я тебя так долго ждал");
        } else if (isGirl) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый, а вы кто?");
        }
    }
}

