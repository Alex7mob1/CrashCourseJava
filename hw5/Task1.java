package crashCourseSoftServe.hw5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.httpEr();
    }


    //task1

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


    //task2

    public void maxMix() {

        System.out.println("Enter three numbers: ");
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[3];
        int max = 0;
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            int entr = scan.nextInt();
            arr[i] = entr;

            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            System.out.println(max +"\n"+min);
        }
        System.out.println("Max = " + max + "; Min = " + min);
    }


    //task3

    public void httpEr(){
        System.out.println("Enter error number from 500 to 504: ");
        Scanner scan = new Scanner(System.in);
        int entr = scan.nextInt();
        if(entr>504||entr<500){
            System.out.println("you enter wrong data try one more time ");
            entr = scan.nextInt();
        }

        switch (entr){
            case 500:
                System.out.println("Internal Server Error");
                break;
            case 501:
                System.out.println("Not Implemented");
                break;
            case 502:
                System.out.println("Bad Gateway");
                break;
            case 503:
                System.out.println("Service Unavailable");
                break;
            case 504:
                System.out.println("Gateway Timeout");
                break;
            default:
                System.out.println("don't have error");
        }
    }
}
