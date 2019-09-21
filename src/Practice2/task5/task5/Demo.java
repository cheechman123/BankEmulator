package Practice2.task5.task5;

import java.util.Arrays;

class Demo {

    public static void main(String[] args) {
        Container container = new Container();
        Container container1 = new Container();
        MyIterator iterator = container.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        MyIterator iterator1 = container1.getIterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        container.add(1111);
        container.add(2222);
        container.add(3333);
        container.add(4444);
        container.add(5555);
        container.add(6666);
        container.add(4444);
        container.add(5555);
        container1.add(1111);
        container1.add(2222);
        container1.add(3333);
        container1.add(4444);
        container1.add(5555);
        System.out.println("Container - " + container);
        container.delete(2);
        System.out.println("Container after deleting element - " + container);
        container.change(3, 212123);
        System.out.println("Container after hanching element - " + container);
        System.out.println("Does the Container contains such element? - " + container.contains(3));
        System.out.println("Does the Container contains all elements? - " + container.containsAll(container1));

        System.out.println("Container - " + container);
        System.out.println("Container1 - " + container1);
        container.clean();
        System.out.println("Container after cleaning elements - " + container);

    }
}






