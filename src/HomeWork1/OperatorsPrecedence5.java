package HomeWork1;

public class OperatorsPrecedence5 {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        int c = 2;
        int d = (b * c >> c++) / --a;

        System.out.println(d);

        // 5*2 = 10; 10 сдвиг вправо на 3, получается 1/7 = 0
    }
}
