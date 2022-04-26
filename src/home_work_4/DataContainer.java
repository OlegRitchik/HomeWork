package home_work_4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {

    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }


    public int add(T item) {

        if (item == null) {
            return -1;
        }
        if (this.data.length == 0) {
            this.data = Arrays.copyOf(this.data, this.data.length + 1);
        }
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = item;
                return i;
            }
        }
        this.data = Arrays.copyOf(this.data, this.data.length + 1);
        this.data[this.data.length - 1] = item;

        return this.data.length - 1;
    }


    public T get(int index) {
        if (index > this.data.length - 1) {
            return null;
        }
        return this.data[index];
    }


    public T[] getItems() {
        return this.data;
    }


    public boolean deleteIndex(int index) {

        if (index > this.data.length - 1) {
            return false;
        } else {
            if (this.data.length - 1 - index >= 0)
                System.arraycopy(this.data, index + 1, this.data, index, this.data.length - 1 - index);
            this.data = Arrays.copyOf(this.data, this.data.length - 1);
        }
        return true;
    }


    public boolean deleteItem(T item) {
        boolean delete = false;
        int b = 0;
        for (int i = 0; i < this.data.length - 1; i++) {
            if (this.data[i].equals(item)) {
                this.data[i] = null;
                b = i;
                delete = true;
                break;
            }
        }
        if (this.data.length - 1 - b >= 0)
            System.arraycopy(this.data, b + 1, this.data, b, this.data.length - 1 - b);
        this.data = Arrays.copyOf(this.data, this.data.length - 1);

        return delete;
    }


    public void sort(Comparator<T> comparator) {
        int i = 0;
        while (i < this.data.length - 1) {
            if (comparator.compare(this.data[i], this.data[i + 1]) > 0) {
                T tmp = this.data[i];
                this.data[i] = this.data[i + 1];
                this.data[i + 1] = tmp;
                i = 0;
            } else {
                i++;
            }
        }
    }


    public String toString() {
        return Arrays.toString(data)
                .replaceAll(", null", "")
                .replace("null, ", "");
    }
}