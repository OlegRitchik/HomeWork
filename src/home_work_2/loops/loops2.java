package HomeWork2.loops;

public class loops2 {
    public static void main(String[] args) {

        System.out.println(factorial(5) + "!");
    }
    private static int factorial(int n){

        int result = 1;
        if (n == 0) {
            System.out.print(" = ");
            return result;
        }
        if (n == 1) {
            System.out.print(" * 1 = ");
            return result;
        }

        System.out.print(n);
        if (n != 2) {
            System.out.print(" * ");
        }

        result = n * factorial(n-1);
        return result;

         }
    }





