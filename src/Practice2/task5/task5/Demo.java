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






