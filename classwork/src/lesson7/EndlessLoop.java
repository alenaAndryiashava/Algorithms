package lesson7;
import java.util.ArrayList;
// Как создать бесконечный цикл на пустом месте?
// для решения добавить одну строку здесь
//public stat ic void main(String[] args) {

//for (int i = start; i <= start + 1; i++) {
// тут должен быть бесконечный цикл, менять или добавлять здесь ничего нельзя!
public class EndlessLoop {
    public static void main(String[] args) {
        /*int start = 0;
        for (int i = start; true; i++) {
            System.out.println("test");
            i--;
        }*/

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.add(3, 10);

        list.remove(0);
        list.remove(Integer.valueOf(6));

        System.out.println(list);


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (int value : list) {
            System.out.println(value);
        }

        // list.subList()

        // addAll(Collection c) добавляет все элементы коллекции
        // clear() удаляет все элементы
        // contains(Object obj) проверяет наличие элемента, возвращает true/false
        // isEmpty() возвращает true, если список пустой
        // indexOf(Object obj) возвращает индекс первого элемента, равного данному, либо -1
        // trimToSize() уменьшает емкость списка до текущего размера списка (size)
    }
}
