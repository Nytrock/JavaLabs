package Lesson2;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Исходный массив: " + list);
        list.add(16);
        list.add(256);
        list.add(65536);
        System.out.println("Добавление элементов в массив: " + list);

        System.out.println("Получение элемента массива: " + list.get(1));
        list.remove(0);
        System.out.println("Удаление элемента массива: " + list);
    }
}


class ArrayList<T> {
    private T[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayList() {
        data = (T[]) new Object[10];
        size = 0;
    }

    @SuppressWarnings("unchecked")
    public void add(T element) {
        if (size == data.length) {
            T[] newData = (T[]) new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }

        data[size++] = element;
    }

    public T get(int index) {
        return data[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) return;
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
            if (i == size - 2)
                data[i + 1] = null;
        }
        size--;
    }

    @Override
    public String toString() {
        Object[] arr = new Object[size];
        System.arraycopy(data, 0, arr, 0, size);
        return Arrays.toString(arr);
    }
}
