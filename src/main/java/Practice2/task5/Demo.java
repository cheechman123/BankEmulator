package Practice2.task5;

import java.util.Scanner;

class Demo {

    public static void main(String[] args) {
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        System.out.println("1-Fill in first Container");
        System.out.println("2-Fill in second Container");
        System.out.println("3-To delete element from first Container choose its index");
        System.out.println("4-To delete element from second Container choose its index");
        System.out.println("5-Enter 1-index,2-int value for changing element from first Container");
        System.out.println("6-Enter 1-index,2-int value for changing element from second Container");
        System.out.println("7-Enter element which first Container have to contains");
        System.out.println("8-Enter element which second Container have to contains");
        System.out.println("9-Does the Container contains all elements? - ");
        System.out.println("10-Call bubble Sort for first Container");
        System.out.println("11-Call bubble Sort for second Container");
        System.out.println("12-If you want to see your first Container");
        System.out.println("13-If you want to see your second Container");
        System.out.println("14-Enter element for search in first Container");
        System.out.println("15-Enter element for search in second Container");
        System.out.println("16-For cleaning first Container");
        System.out.println("17-For cleaning second Container");
        System.out.println("18-To exit");

        Scanner sc = new Scanner(System.in);
        int scanner = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            int generatedValue = (int) (Math.random() * 21);
            firstContainer.add(generatedValue);
        }
        for (int i = 0; i < 10; i++) {
            int generatedValue = (int) (Math.random() * 21);
            secondContainer.add(generatedValue);
        }

        while (true) {
            scanner = sc.nextInt();
            switch (scanner) {
                case 1: {
                    System.out.println("Enter your values  ");
                    int �ontainerValue = sc.nextInt();
                    firstContainer.add(�ontainerValue);
                    break;
                }
                case 2: {
                    System.out.println("Enter your values ");
                    int �ontainerValue = sc.nextInt();
                    secondContainer.add(�ontainerValue);
                    break;
                }
                case 3: {
                    System.out.println("To delete element from continer choose its index");
                    int valueForDelete = sc.nextInt();
                    firstContainer.delete(valueForDelete);
                    break;
                }
                case 4: {
                    System.out.println("To delete element from continer1 choose its index");
                    int valueForDelete = sc.nextInt();
                    secondContainer.delete(valueForDelete);
                    break;
                }
                case 5: {
                    System.out.println(
                            "Enter 1-index,2-int value for changeing element from firstContainer");
                    int indexValueForChangeing = sc.nextInt();
                    int intValueForChangeing = sc.nextInt();
                    firstContainer.change(indexValueForChangeing, intValueForChangeing);
                    break;
                }
                case 6: {
                    System.out.println(
                            "Enter 1-index,2-int value for changeing element from secondContainer");
                    int intValueForChangeing = sc.nextInt();
                    int indexValueForChangeing = sc.nextInt();
                    secondContainer.change(intValueForChangeing, indexValueForChangeing);
                    break;
                }
                case 7: {
                    System.out.println("Enter element whitch firstContainer have to contains");
                    int intValueForContainingElement = sc.nextInt();
                    firstContainer.contains(intValueForContainingElement);
                    break;
                }
                case 8: {
                    System.out.println("Enter element whitch secondContainer have to contains");
                    int intValueForContainingElement = sc.nextInt();
                    secondContainer.contains(intValueForContainingElement);
                    break;
                }
                case 9: {
                    System.out.println("Does the Container contains all elements? - " +
                                               firstContainer.containsAll(secondContainer));
                    break;
                }
                case 10: {
                    System.out.println("Call bubble Sort for firstContainer");
                    firstContainer.bubbleSort();
                    break;
                }
                case 11: {
                    System.out.println("Call bubble Sort for secondContainer");
                    secondContainer.bubbleSort();
                    break;
                }
                case 12: {
                    System.out.println(firstContainer);
                    break;
                }
                case 13: {
                    System.out.println(secondContainer);
                    break;
                }
                case 14: {
                    System.out.println("Enter element for search in firstContainer");
                    int elementValue = sc.nextInt();
                    firstContainer.linearSearch(elementValue);
                    break;
                }
                case 15: {
                    System.out.println("Enter element for search in secondContainer");
                    int elementValue1 = sc.nextInt();
                    secondContainer.linearSearch(elementValue1);
                    break;
                }
                case 16: {
                    System.out.println("For cleaning firstContainer");
                    firstContainer.clean();
                    break;
                }
                case 17: {
                    System.out.println("For cleaning secondContainer");
                    secondContainer.clean();
                    break;
                }
                case 18: {
                    System.out.println("To exit ");
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Choose once again");
                    break;

            }
        }
    }
}






