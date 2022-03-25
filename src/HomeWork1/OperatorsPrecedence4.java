package HomeWork1;

public class OperatorsPrecedence4 {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        int c = 2;
        int d = (b + c++) / --a;

        System.out.println(d);

        // 5+3 =8, 8/7 = 1.
    }
}
