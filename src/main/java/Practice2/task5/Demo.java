package Practice2.task5;

import java.util.Scanner;

class Demo {

    public static void main(String[] args) {
        Container firstContainer = new Container();
        Container secondContainer1 = new Container();

       /* MyIterator iterator = firstContainer.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        MyIterator iterator1 = secondContainer1.getIterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }*/
        System.out.println("1-Fill in first firstContainer");
        System.out.println("2-Fill in secont secondContainer");
        System.out.println("3-To delete element from continer choose its index");
        System.out.println("4-To delete element from continer1 choose its index");
        System.out.println("5-Enter 1-index,2-int value for changeing element from firstContainer");
        System.out.println("6-Enter 1-index,2-int value for changeing element from secondContainer1");
        System.out.println("7-Enter element whitch firstContainer have to contains");
        System.out.println("8-Enter element whitch secondContainer1 have to contains");
        System.out.println("9-Does the Container contains all elements? - ");
        System.out.println("10-Call bubble Sort for firstContainer");
        System.out.println("11-Call bubble Sort for secondContainer1");
        System.out.println("12-If you want to see your firstContainer");
        System.out.println("13-If you want to see your secondContainer1");
        System.out.println("14-Enter element for search in firstContainer");
        System.out.println("15-Enter element for search in secondContainer1");
        System.out.println("16-For cleaning firstContainer");
        System.out.println("17-For cleaning secondContainer1");
        System.out.println("18-To exit");
        System.out.println("19-Show firstContainer");
        System.out.println("20-Show secondContainer1");

        Scanner sc = new Scanner(System.in);
        int scanner = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            int generatedValue = (int) Math.random() * 21;
            firstContainer.add(generatedValue);
        }
        for (int i = 0; i < 10; i++) {
            int generatedValue = (int) Math.random() * 21;
            secondContainer1.add(generatedValue);
        }

        while (true) {
            scanner = sc.nextInt();
            switch (scanner) {
                case 1: {
                    System.out.println("Enter your values  ");
                    int fillInContainerValue = sc.nextInt();
                    if (firstContainer.size() <15) {
                            firstContainer.add(fillInContainerValue);
                        break;
                    }
                }
                case 2: {
                    System.out.println("Enter your values ");
                    int fillInContainerValue2 = sc.nextInt();
                    if (secondContainer1.size() <15) {
                            secondContainer1.add(fillInContainerValue2);
                    }
                    break;
                }
                case 3: {

                    System.out.println("To delete element from continer choose its index");
                    int fillInValueForDelete = sc.nextInt();
                    firstContainer.delete(fillInValueForDelete);
                    break;
                }
                case 4: {

                    System.out.println("To delete element from continer1 choose its index");
                    int fillInValueForDelete1 = sc.nextInt();
                    firstContainer.delete(fillInValueForDelete1);
                    break;
                }
                case 5: {

                    System.out.println("Enter 1-index,2-int value for changeing element from firstContainer");
                    int intValueForChangeing = sc.nextInt();
                    int fillInValueForChangeing = sc.nextInt();
                    firstContainer.change(fillInValueForChangeing, intValueForChangeing);
                    break;
                }
                case 6: {

                    System.out.println("Enter 1-index,2-int value for changeing element from secondContainer1");
                    int intValueForChangeing1 = sc.nextInt();
                    int fillInValueForChangeing1 = sc.nextInt();
                    firstContainer.change(fillInValueForChangeing1, intValueForChangeing1);
                    break;
                }
                case 7: {

                    System.out.println("Enter element whitch firstContainer have to contains");
                    int intValueForContainingElement = sc.nextInt();
                    firstContainer.contains(intValueForContainingElement);
                    break;
                }
                case 8: {

                    System.out.println("Enter element whitch secondContainer1 have to contains");
                    int intValueForContainingElement1 = sc.nextInt();
                    firstContainer.contains(intValueForContainingElement1);
                    break;
                }
                case 9: {
                    System.out.println("Does the Container contains all elements? - " + firstContainer.containsAll(secondContainer1));
                    break;
                }
                case 10: {
                    System.out.println("Call bubble Sort for firstContainer");
                    firstContainer.bubbleSort();
                    break;
                }
                case 11: {
                    System.out.println("Call bubble Sort for secondContainer1");
                    secondContainer1.bubbleSort();
                    break;
                }
                case 12: {
                    System.out.println("If you want to see your firstContainer" + firstContainer);
                    break;
                }
                case 13: {
                    System.out.println("If you want to see your secondContainer1" + secondContainer1);
                    break;
                }
                case 14: {

                    System.out.println("Enter element for search in firstContainer");
                    int intValueForSearch = sc.nextInt();
                    firstContainer.linearSearch(intValueForSearch);
                    break;
                }
                case 15: {

                    System.out.println("Enter element for search in secondContainer1");
                    int intValueForSearch1 = sc.nextInt();
                    firstContainer.linearSearch(intValueForSearch1);
                    break;
                }
                case 16: {
                    System.out.println("For cleaning firstContainer");
                    firstContainer.clean();
                    break;
                }
                case 17: {
                    System.out.println("For cleaning secondContainer1");
                    secondContainer1.clean();
                    break;
                }
                case 18: {
                    System.out.println("To exit ");
                    System.exit(0);
                    break;
                }
                case 19: {
                    System.out.println("show firstContainer" + firstContainer);
                    break;
                }
                case 20: {
                    System.out.println("show secondContainer1" + secondContainer1);
                    break;
                }
                default:
                    System.out.println("Choose once again");
                    break;

            }
        }
    }
}






