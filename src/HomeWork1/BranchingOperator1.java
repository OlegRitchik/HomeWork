package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class BranchingOperator1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите своё имя");
        String name = console.nextLine();

        if(Objects.equals(name, "Вася")){
           System.out.println("Привет");
           System.out.println("Я тебя так долго ждал");
        }

        if(Objects.equals(name, "Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        }

        if(!Objects.equals(name, "Вася") && !Objects.equals(name, "Анастасия")){
            System.out.println("Добрый, а вы кто?");
        }
    }
}
