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
