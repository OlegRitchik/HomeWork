package HomeWork1;

public class OperatorsPrecedence3 {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        int c = 2;
        int d = (b + c++) / a;

        System.out.println(d);

        // 5+3 = 8; 8/8 = 0; 8/8 результат должен быть 1, программа выдаёт 0.
        // тут по идее должно выполняться с++, далее /, а потом + . Получается первое выполняется что в скобках или нет?
    }
}
