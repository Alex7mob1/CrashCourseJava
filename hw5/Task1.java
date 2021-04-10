package crashCourseSoftServe.hw5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.belong();
    }

    public void belong() {
        while (true) {
            System.out.println("Enter number in within [-5,5], or exit if you want exit from program: ");
            Scanner scan = new Scanner(System.in);
            String entr = scan.nextLine();
            if (entr.equals("exit")) {
                break;
            }
            float num = Float.parseFloat(entr);
            if (-5 <= num && num <= 5) {
                System.out.println(entr + " belong to the range");
            } else {
                System.out.println(entr + " don't belong to the range");
            }
        }
    }

    public void MaxMix() {
        while (true) {
            System.out.println("Enter three numbers or exit if you want exit from program: ");
            Scanner scan = new Scanner(System.in);
            String entr = scan.nextLine();
            if (entr.equals("exit")) {
                break;
            }
            int num = Integer.parseInt(entr);

        }
    }
}
