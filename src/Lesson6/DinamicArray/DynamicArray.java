package Lesson6.DinamicArray;

import java.util.Iterator;

public class DynamicArray implements DynamicInterface{
    private int[] array;
    private int count;
    private int size;

    public DynamicArray() {
        array = new int[1];
        count = 0;
        size = 1;
    }

    @Override
    public void add(int data) {
        if (count == size){
            growSize(); // увеличить массив
        }
        array[count] = data;
        count++;
    }

    @Override
    public void addAt(int index, int data) {
        if (count == size)
        {
            growSize();
        }
        for (int i = count - 1; i >= index; i--)
        {
            array[i + 1] = array[i];// переносим влево элементы
        }
        array[index] = data;
        count++;
    }

    @Override
    public void remove (){
        if (count > 0)
        {
            array[count - 1] = 0;
            count--;
        }
    }

    @Override
    public void removeAt(int index) {
        if (count > 0)
        {
            for (int i = index; i < count - 1; i++)
            {
                array[i] = array[i + 1];// смещаем все элементы влево
            }
            array[count - 1] = 0;
            count--;
        }
    }

    @Override
    public void growSize() { // увеличивает массив в 2 раза
        int temp[] = new int[size*2];
                for (int i = 0; i < size; i++)
                {
                    temp[i] = array[i];// копируем элементы в новый
                }
        array = temp;
        size= size * 2;
    }

    @Override
    public void shrinkSize() {
        int temp[] = null;  // создается временный массив
        if (count > 0)
        {
            temp = new int[count];           // создаем новый массив, размера количества эелментов
            for (int i = 0; i < count; i++)
            {
                temp[i] = array[i];  // копируем элементы из старого
            }
            size = count;
            array = temp;
        }
    }

    @Override
    public void set(int index, int data) {
        array[index] = data;
    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public void clear() {
        if (count > 0)
            for (int i = 0; i < size; i++) {
                array[count - 1] = 0;
                count--;
            }
    }

    @Override
    public boolean contains(int data) {
        for (int i = 0; i < count; i++) {
            if (array[i] == data) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int position = 0;

            @Override
            public boolean hasNext() {
                return position < count;
            }

            @Override
            public Integer next() {
                return get(position++);
            }
        };
    }
}
