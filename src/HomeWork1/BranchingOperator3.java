package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class BranchingOperator3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите своё имя");
        String name = console.nextLine();

        boolean isFriend = Objects.equals(name, "Вася");
        boolean isGirl = Objects.equals(name, "Анастасия");

        if(isFriend){
           System.out.println("Привет");
           System.out.println("Я тебя так долго ждал");
        }

        if(isGirl) {
            System.out.println("Я тебя так долго ждал");
        }

        if(!isFriend && !isGirl){
            System.out.println("Добрый, а вы кто?");
        }
    }
}
