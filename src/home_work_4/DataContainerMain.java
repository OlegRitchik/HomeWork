package home_work_4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {

        DataContainer<Integer> container = new DataContainer<>(new Integer[]{33, 7, null, 1, 7, null, 6, 8});
        DataContainer<String> container1 = new DataContainer<>(new String[0]);
        int index1 = container1.add("Привет");
        int index2 = container1.add("Как дела");
        int index3 = container1.add("Работаю");
        int index4 = container1.add("Давай потом");

        String text1 = container1.get(index1);
        String text2 = container1.get(index2);
        String text3 = container1.get(index3);
        String text4 = container1.get(index4);

        System.out.println((text1));
        System.out.println((text2));
        System.out.println((text3));
        System.out.println((text4));


        System.out.println("Возвращает номер позиции в которую были вставлены данные: " + container.add(777));
        System.out.println("Возвращает объект по номеру ячейки: " + container.get(6));
        System.out.println("Возвращает поле data: " + Arrays.toString(container.getItems()));
        System.out.println("Удаляет элемент из нашего поля data по индексу : " + container.deleteIndex(2));
        System.out.println("Удаляет элемент из нашего поля data: " + container.deleteItem(33));
        System.out.println("Масcив до сортировки: " + container);
        container.sort(Comparator.nullsFirst(Comparator.comparing(integer -> integer)));
        System.out.println("Массив после сортировки: " + container);
    }
}
