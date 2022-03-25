package HomeWork1;

import java.util.Objects;

public class BranchingOperators1 {
    public static void main(String[] args) {
        String str1 = "Вася";
        String str2 = "Анастасия";
        String str3 = "Петя";
        if(str1 == String.valueOf(true)){
        System.out.println("Привет! Я тебя так долго ждал");
        }
        if(str2 == String.valueOf(false)){
            System.out.println("Я тебя так долго ждал");
        }
        if(str3 == String.valueOf(true)){
            System.out.println("Добрый день, а вы кто?");
        }

    }

}
