package Lesson8;

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
        arr[size++] = value;    //size++ | ++size           size = 5: size++ -> 5 ++size -> 6
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
        return 0;
    }

    @Override
    public void remove() {

    }

    @Override
    public void removeAt(int index) {

    }

    @Override
    public void set(int index, int value) {

    }

    @Override
    public boolean contains(int value) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public void shrinkSize() {

    }

    private void growSize() {
        capacity *= 2;

        int[] tempArr = new int[capacity];

        for (int i = 0; i < size; i++) {
            tempArr[i] = arr[i];
        }

        arr = tempArr;
    }
}

