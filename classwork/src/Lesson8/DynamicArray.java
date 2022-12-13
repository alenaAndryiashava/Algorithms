package lesson8;
import java.util.Arrays;

public class DynamicArray implements Dynamic {

    private int[] arr;

    private static final int INITIAL_CAPACITY = 8;
    private int capacity;
    private int size = 0;

    public DynamicArray() {
        arr = new int[INITIAL_CAPACITY];
        capacity = INITIAL_CAPACITY;
    }

    @Override
    public void add(int value) {
        if (size >= capacity) {
            growSize();
        }
        arr[size++] = value;
        //size++ | ++size           size = 5: size++ -> 5 ++size -> 6
    }

    @Override
    public void addAt(int index, int value) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (size >= capacity) {
            growSize();
        }

        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = value;
        size++;
    }

    @Override
    public int get(int index) {
        if(index > size){
            throw  new ArrayIndexOutOfBoundsException();
        }
        return arr[index];
    }

    @Override
    public void remove() {
        arr[--size] = 0;
    }

    @Override
    public void removeAt(int index) {
        if(index > size){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(index == size){
            remove();
            return;
        }
        for (int i = index; i < size; i++) {
            arr[i] = arr[i-1];

        }
        size--;
    }

    @Override
    public void set(int index, int value) {
        if(index > size){
            throw new ArrayIndexOutOfBoundsException();
        }
        arr[index] = value;
    }

    @Override
    public boolean contains(int value) {
        for (int e : arr) {
            if (e == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        arr = new  int[INITIAL_CAPACITY];
        capacity = INITIAL_CAPACITY;
        size = 0;
    }

    @Override
    public void shrinkSize() {
        capacity = size;
        int[] tempArr = new int[capacity];
        for (int i = 0; i < size; i++) {
            tempArr[i] = arr[i];

        }
        arr = tempArr;

    }
    public void print(){
        System.out.println(Arrays.toString(arr));
    }

    private void growSize() {
        capacity *= 2;

        int[] tempArr = new int[capacity];

        for (int i = 0; i < size; i++) {
            tempArr[i] = arr[i];
        }

        arr = tempArr;
    }
    private void growSize(int index) {
        capacity *= 2;
        int[] tempArr = new int[capacity];

        for (int i = 0; i < size; i++) {
            int pos = index == -1 || i < index ? i : i + 1;
            tempArr[pos] = arr[i];
        }

        arr = tempArr;
    }
}

