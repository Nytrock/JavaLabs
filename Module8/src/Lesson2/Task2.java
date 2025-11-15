package Lesson2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Исходный стек: " + stack);
        stack.push(16);
        stack.push(256);
        stack.push(65536);
        System.out.println("Добавление элементов в стек: " + stack);

        System.out.println("Получение верхнего элемента в стеке: " + stack.top());
        stack.pop();
        System.out.println("Удаление верхнего элемента: " + stack);

        int index = stack.search(256);
        System.out.println("Поиск объекта в стеке: 256 – [" + index + "]");
    }
}

class Stack<T> {
    private T[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public Stack() {
        data = (T[]) new Object[10];
        size = 0;
    }

    @SuppressWarnings("unchecked")
    public void push(T element) {
        if (size == data.length) {
            T[] newData = (T[]) new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[size++] = element;
    }

    public T top() {
        if (size == 0)
            return null;
        return data[size - 1];
    }

    public void pop() {
        if (size == 0)
            return;

        size--;
        data[size] = null;
    }

    public int search(T element) {
        for (int i = size - 1; i >= 0; i--) {
            if (data[i].equals(element)) {
                return size - i;
            }
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        Object[] arr = new Object[size];
        System.arraycopy(data, 0, arr, 0, size);
        return Arrays.toString(arr);
    }
}
