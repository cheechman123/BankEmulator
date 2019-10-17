
package Practice2.task5;

import java.util.Arrays;

public class Container implements IContainer {

    int[] container;

   public Container() {
        this.container = new int[]{};
    }

    void add(int string) {

        this.container = Arrays.copyOf(container, container.length + 1);
        container[container.length - 1] = string;
    }

    boolean delete(int index) {
        if (index > container.length - 1) {
            throw new IllegalArgumentException("Argument is too big");
        } else if (index < 0) {
            throw new IllegalArgumentException("Argument is too small");
        }
        for (int i = index; i < container.length - 1; i++) {
            container[i] = container[i + 1];
        }
        this.container = Arrays.copyOf(container, container.length - 1);
        return true;

    }

    @Override
    public String toString() {
        return "Container{" +
                "container=" + Arrays.toString(container) +
                '}';
    }

    void change(int index, int string) {
        if (index > container.length - 1)
            throw new IllegalArgumentException("index wrong");
        else if (index < 0)
            throw new IllegalArgumentException("index is less than 0 ");
        container[index] = string;
    }

    void clean() {
        container = Arrays.copyOf(container, 0);
    }

    int size() {
        return container.length;
    }

    int[] toArray() {
        return container;
    }

    boolean contains(int intIndex) {
        if (intIndex == 0)
            throw new NullPointerException("Your String is empty");
        for (int i = 0; i < container.length; i++) {
            if (container[i] == intIndex)
                return true;
        }
        return false;
    }

    public void bubbleSort() {
        boolean isSorted = false;
        int temp;
        for (int i = 0; i < container.length; i++) {
            isSorted = true;
            for (int j = 0; j < container.length - 1; j++) {
                if (container[j] < container[j + 1]) {
                    temp = container[j];
                    container[j] = container[j + 1];
                    container[j + 1] = temp;
                }
            }

        }
    }

    int linearSearch(int elemToSearch) {
        for (int i = 0; i < container.length; i++) {
            if (container[i]==elemToSearch){
                return i;
            }
        }
        return -1;
    }

    boolean containsAll(Container container1) {
        if (container1 == null)
            throw new NullPointerException("Your Container is null");
        if (container1.size() == 0)
            return false;
        int[] stringMass = container1.toArray();
        if (stringMass.length > container.length)
            return false;

        int count = 0;

        for (int i = 0; i < stringMass.length; i++) {
            for (int j = 0; j < container.length; j++) {
                if (stringMass[i] == container[j])
                    count++;

            }
        }
        return stringMass.length == count ? true : false;
    }

    public int getByIndex(int index){
       return container[index];
    }

    @Override
    public MyIterator getIterator() {
        return (MyIterator) new ArraIterator();
    }

    class ArraIterator implements MyIterator {
        int index;

        @Override
        public boolean hasNext() {
            return (index < container.length) ? true : false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return container[index];
            }
            return null;
        }
    }
}

