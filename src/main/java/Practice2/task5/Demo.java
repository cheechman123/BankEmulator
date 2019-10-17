package Practice2.task5;

import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        int scanner = sc.nextInt();
        int fillInContainerValue = sc.nextInt();
        int fillInContainerValue2 = sc.nextInt();
        int fillInValueForDelete = sc.nextInt();
        int fillInValueForDelete1 = sc.nextInt();
        int fillInValueForChangeing = sc.nextInt();
        int fillInValueForChangeing1 = sc.nextInt();
        int intValueForChangeing = sc.nextInt();
        int intValueForChangeing1 = sc.nextInt();
        int intValueForContainingElement = sc.nextInt();
        int intValueForContainingElement1 = sc.nextInt();
        int intValueForSearch = sc.nextInt();
        int intValueForSearch1 = sc.nextInt();

        while (true) {
            switch (scanner) {
                case 1: {
                    System.out.println("Fill in first container");
                    if (container.size() >= 5) {
                        break;
                    } else {
                        container.add(fillInContainerValue);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Fill in secont container");
                    if (container1.size() >= 5) {
                        break;
                    } else {
                        container1.add(fillInContainerValue2);
                    }
                    break;
                }
                case 3: {
                    System.out.println("To delete element from continer choose its index");
                    container.delete(fillInValueForDelete);
                    break;
                }
                case 4: {
                    System.out.println("To delete element from continer1 choose its index");
                    container.delete(fillInValueForDelete1);
                    break;
                }
                case 5: {
                    System.out.println("Enter 1-index,2-int value for changeing element from container");
                    container.change(fillInValueForChangeing, intValueForChangeing);
                    break;
                }
                case 6: {
                    System.out.println("Enter 1-index,2-int value for changeing element from container1");
                    container.change(fillInValueForChangeing1, intValueForChangeing1);
                    break;
                }
                case 7: {
                    System.out.println("Enter element whitch container have to contains");
                    container.contains(intValueForContainingElement);
                    break;
                }
                case 8: {
                    System.out.println("Enter element whitch container1 have to contains");
                    container.contains(intValueForContainingElement1);
                    break;
                }
                case 9: {
                    System.out.println("Does the Container contains all elements? - " + container.containsAll(container1));
                    break;
                }
                case 10: {
                    System.out.println("Call bubble Sort for container");
                    container.bubbleSort();
                    break;
                }
                case 11: {
                    System.out.println("Call bubble Sort for container1");
                    container1.bubbleSort();
                    break;
                }
                case 12: {
                    System.out.println("If you want to see your container" + container);
                    break;
                }
                case 13: {
                    System.out.println("If you want to see your container1" + container1);
                    break;
                }
                case 14: {
                    System.out.println("Enter element for search in container");
                    container.linearSearch(intValueForSearch);
                    break;
                }
                case 15: {
                    System.out.println("Enter element for search in container1");
                    container.linearSearch(intValueForSearch1);
                    break;
                }
                case 16: {
                    System.out.println("For cleaning container");
                    container.clean();
                    break;
                }
                case 17: {
                    System.out.println("For cleaning container1");
                    container1.clean();
                    break;
                }
                case 18:{
                    System.out.println("To exit ");
                  //??????????????????????????????????
                }

                default:
                    System.out.println("Choose once again");
                    break;

            }
        }
    }
}






