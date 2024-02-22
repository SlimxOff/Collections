package Lists;

import java.util.Arrays;

public class MyArrayList<S> {
    private static final int DEFAULT_SIZE = 10;
    private int SIZE = 10;
    Object[] elementData;


    public MyArrayList() {
        this.elementData = new Object[DEFAULT_SIZE];

    }

    public MyArrayList(int size) {
        this.elementData = new Object[size];
    }

    public int size() {
        int size = 0;
        for (int i = 0; i < SIZE; i++) {
            if (this.elementData[i] != null) {
                size++;
            }
        }
        return size;
    }

    public void add(S element) {
        int temp = SIZE;
        for (int j = 0; j < SIZE; j++) {
            if (this.elementData[j] == null) {
                temp--;
            }
        }
        if (temp == SIZE) {
            this.SIZE = (int) ((SIZE * 1.5) + 1);
            Object[] tempMassive = new Object[SIZE];
            for (int j = 0; j < this.elementData.length; j++) {
                tempMassive[j] = this.elementData[j];
            }
            this.elementData = new Object[SIZE];
            for (int j = 0; j < SIZE; j++) {
                this.elementData[j] = tempMassive[j];
            }
            this.elementData[temp] = element;
        } else {
            for (int j = 0; j < SIZE; j++) {
                if (this.elementData[j] == null) {
                    this.elementData[j] = element;
                    break;
                }
            }
        }
    }

    public void remove(int index) {
        for (int i = index; i < SIZE - 1; i++) {
            this.elementData[i] = this.elementData[i + 1];
        }
    }

    public Object get(int index) {
        return this.elementData[index];
    }

    @Override
    public String toString() {
        int size = 0;
        for (int i = 0; i < SIZE; i++) {
            if (this.elementData[i] != null) {
                size++;
            }
        }
        Object[] tempMass = new Object[size];
        for (int i = 0; i < size; i++) {
            tempMass[i] = this.elementData[i];
        }
        return Arrays.toString(tempMass);
    }
}





