package HomeWork1;

public class BitwiseOperations1 {
    public static void main(String[] args) {
        int a = 42;     // 42 двоичный код 00101010
        int b = 15;     // 15 двоичный код 00001111
        int c = a & b;  // 10 двоичный код 00001010
        int d = a | b;  // 47 двоичный код 00101111
        int s = a ^ b;  // 37 двоичный код 00100101
        int r = ~ b;    // -16 двоичный код -00010000
        int q = ~ a;    // -43 двоичный код -11010101
        int w = a >> 1; // 21 двоичный код 00010101
        int o = b >> 1; // 7 двоичный код 00000111
        int i = 1 << b; // 32768 двоичный код 000101010000000000000000
        int v = 1 << a; // 1024 двоичный код 010000000000
        int g = a << b; // 1376256 двоичный код 000101010000000000000000
        int h = b << a; // 15360 двоичный код 0011110000000000


        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
        System.out.println(r);
        System.out.println(q);
        System.out.println(w);
        System.out.println(o);
        System.out.println(i);
        System.out.println(v);
        System.out.println(g);
        System.out.println(h);

    }
}
