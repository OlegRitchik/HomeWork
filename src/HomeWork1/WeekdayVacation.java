package HomeWork1;

import java.util.Scanner;

public class WeekdayVacation {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Сейчас рабочий день?");
        boolean weekday = console.nextBoolean();
        System.out.println("Сейчас у вас отпуск?");
        boolean vacation = console.nextBoolean();

        boolean sleep = sleepIn(weekday, vacation);

        if(sleep){
            System.out.println("Можно спать");
        }else {
            System.out.println("Пора вставать");
            System.out.println("Иди на работу");
            System.out.println("Кто будет зарабатывать");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(weekday){
            if(vacation){
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
}




