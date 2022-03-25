package HomeWork1;

public class Math3 {
    public static void main(String[] args) {
        //Если дробная часть числа больше либо равна 0.5, то число будет округлено в большую сторону, иначе в меньшую
        System.out.println(Math.round(1.3)); // 1
        System.out.println(Math.round(1.5)); // 2
        //Независимо от значений дробной части, округляет число в меньшую сторону
        System.out.println(Math.floor(1.5)); // 1.0
        System.out.println(Math.floor(1.6)); // 1.0
        // Вне зависимости от значений дробной части, округляет числа в большую сторону
        System.out.println(Math.ceil(1.4)); // 2.0
        System.out.println(Math.ceil(1.5)); // 2.0

    }
}



