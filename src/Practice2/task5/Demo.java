package Practice2.task5;

import java.util.Arrays;
import java.util.Iterator;

class Demo {

    public static void main(String[] args) {
        Container container = new Container();
        Container container1 = new Container();

        container1.add("1111");
        container1.add("pipirochka");
        container1.add("2222");
        container.add("1111");
        container.add("2222");
        container.add("3333");
        container.add("4444");
        container.add("5555");
        System.out.println(container);
        container.delete(2);
        container.change(3, "pipirochka");
        System.out.println(container.contains("pipirochka"));
        System.out.println(container.containsAll(container1));

        System.out.println(container);
        container.clean();
        System.out.println(container);

    }
}

class Container {
    String[] container;

    Container() {
        this.container = new String[]{};
    }

    void add(String string) {

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

    void change(int index, String string) {
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

    Object[] toArray() {
        return container;
    }

    boolean contains(String string) {
        if (string == null)
            throw new NullPointerException("Your String is empty");
        for (int i = 0; i < container.length; i++) {
            if (container[i].equals(string))
                return true;
        }
        return false;
    }
    boolean containsAll(Container container1){
        if (container1 == null)
            throw new NullPointerException("Your Container is null");
        if(container1.size() == 0)
            return false;
        String[] stringMass =(String[]) container1.toArray();
        if(stringMass.length>container.length)
            return false;

        int count = 0;

        for (int i = 0 ; i<stringMass.length;i++){
            for (int j = 0; j<container.length;j++) {
                if (stringMass[i].equals(container[j]))
                    count++;

            }
        }
        return stringMass.length == count ? true : false;
    }
//    public Iterator<String> iterator(){
//
//    }
}