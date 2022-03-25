package HomeWork1;

public class BitwiseOperations2 {
    public static void main(String[] args) {
        int a = -42;   // -42 двоичный код 11010110
        int b = -15;   // -15 двоичный код 11110001
        int c = a & b; // -48 двоичный код 11010000
        int d = a | b; //  -9 двоичный код 11110111
        int s = a ^ b; //  39 двоичный код 00100111
        int r = ~ b;   //  14 двоичный код 00001110
        int q = ~ a;   //  41 двоичный код 00101001
        int w = a>>>b; //  32767 двоичный код 0111111111111111
        int t = a>>b;  //  -1 двоичный код 11111111
        int e = a<<b;  //  -5505024 двоичный код 1111111111111111111111111111111111111111101011000000000000000000
        int g = b<<a;  //  -62914560 двоичный код 1111111111111111111111111111111111111100010000000000000000000000
        int m = b>>>a; //   1023 двоичный код 001111111111
        int y = a >> 1; // -21 двоичный код 11101011
        int p = b >> 1; // -8 двоичный код 11111000
        int k = 1 << a; // 4194304 двоичный код 010000000000000000000000
        int l = 1 << b; // 131072 двоичный код 00100000000000000000

        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
        System.out.println(r);
        System.out.println(q);
        System.out.println(w);
        System.out.println(t);
        System.out.println(e);
        System.out.println(g);
        System.out.println(m);
        System.out.println(y);
        System.out.println(p);
        System.out.println(k);
        System.out.println(l);

    }
}
