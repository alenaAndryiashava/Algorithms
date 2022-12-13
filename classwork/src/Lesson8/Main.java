package lesson8;
public class Main {
     /*
    TODO:
        1. Реализовать динамический массив, который при добавлении элементов
        увеличивает свой размера в 2 раза, если места для добавления элемента оказывается недостаточно.
        У динамического массива должны быть следующие методы:
        1. add(int value): void | Добавляет элемент в конец
        2. addAt(int index, int value) : void | Добавляет элемент по индексу со сдвигом всех элементов начиная с текущего и до последнего на 1
        3. get(int index): int | Возвращает элемент по индексу
        4. remove(): void | Удаляет последний элемент
        5. removeAt(int index): void | Удаляет элемент по индексу
        6. set(int index, int value): void | Меняет значение элемента по индексу на указанное
        7. contains(int value): boolean | Проверяет, присутствует ли указанный элемент в списке
        8 size(): int | Возвращает размер списка
        9. clear(): void | Удаляет все элементы из списка, размер списка становится изначальным
        10. shrinkSize(): void | Уменьшает массив до размера, равного количеству элементов в нем
        */

    public static void main(String[] args) {

        Dynamic d = new DynamicArray();
        d.print();

        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        d.add(5);
        d.add(6);
        d.add(7);
        d.add(8);
        d.add(9);
        d.add(10);

        d.print();
        d.addAt(6,11);
        d.print();
        

        d.remove();
        d.remove();

        d.print();

        System.out.println(d.get(5));
        System.out.println(d.get(6));

        d.shrinkSize();
        d.print();

        System.out.println(d.contains(5));
        System.out.println(d.contains(21));

        d.clear();
        d.print();
        



    }
}
