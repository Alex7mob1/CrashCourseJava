package crashCourseSoftServe.hw3;

import java.util.Scanner;

public class Task3ConsoleApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number, what function you want: \n 1 - calc circle perimeter and area \n 2 - personal information \n 3 - phone calls");
        int menu = scan.nextInt();
        switch (menu) {
            case 1:
                calcPerimeterArea();
                break;

            case 2:
                System.out.println(personalInformation());
                break;

            case 3:

                Call ukraine = new Call(10, 20, "Ukr");
                System.out.println(ukraine);
                ukraine.printSum();

                Call usa = new Call(30, 5, "Usa");
                System.out.println(usa);
                usa.printSum();

                Call german = new Call(20, 30, "Ger");
                System.out.println(german);
                german.printSum();


                System.out.println("Do you want choose sum? \n yes or no");
                String choose = scan.next();
                if (choose.equals("no")) {
                    break;
                } else if (choose.equals("yes")) {
                    double[] sums = {ukraine.sum(), usa.sum(), german.sum()};
                    double totalSum = 0;
                    for (double sum : sums) {
                        totalSum = totalSum + sum;
                    }
                    System.out.println("Total sum = " + totalSum);
                } else {
                    System.out.println("incorrect");
                }


                break;

            default:
                throw new IllegalArgumentException();
        }
    }

    public static void calcPerimeterArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle radius: ");
        double r = scanner.nextDouble();
        if (r <= 0) {
            throw new IllegalArgumentException();
        }
        double perimeter;
        double area;
        double pi = 3.14;
        perimeter = 2 * pi * r;
        area = pi * (r * r);
        System.out.println("Circle perimeter = " + perimeter + " and area =  " + area);
    }

    public static String personalInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Where are you live " + name + " ?");
        String address = scanner.nextLine();
        return "Hello " + name + " from " + address;
    }

}
