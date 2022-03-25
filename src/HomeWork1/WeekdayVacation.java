package HomeWork1;

public class WeekdayVacation {
    public static boolean sleepIn;

    public static void main(String[] args) {
        int a = 13;
        int b = 12;

        if (a > 15) {
            System.out.println("отпуск");
        } else if (a < 10) {
            System.out.println("можем спать дальше");
        }
        if (b < 1) {
            System.out.println("рабочий день");
        } else if (b > 13) {
            System.out.println("рабочий день");
        }
        else {
            System.out.println("пора идти на работу");
        }
    }
}




