package HomeWork1;

public class OperatorsPrecedence6 {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        int c = 7;
        int d = 20;
        int e = 68;
        int f = 22;
        int g = 2;
        int h  = (b + c > d ? e : f * g >> g++ / --a);

        System.out.println(h);

        // 5+7 > 20 ? 68 - false, 22*2 = 44, сдвиг вправо на 3, получается 5/7 = 0.
        // Программа выдаёт результат 44.
    }
}
