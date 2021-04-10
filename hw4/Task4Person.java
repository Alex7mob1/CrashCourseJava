package crashCourseSoftServe.hw4;

import java.util.Scanner;

public class Task4Person {
    private String name;
    private int birthdayYear;
    private int currentYear;

    public Task4Person() {
        this.name = "lol";
        this.birthdayYear = 0;
    }

    public Task4Person(String name) {
        this.name = name;
        this.birthdayYear = 0;
    }

    public Task4Person(int birthdayYear) {
        this.name = "empty";
        this.birthdayYear = birthdayYear;
    }

    public Task4Person(String name, int birthdayYear) {
        this.name = name;
        this.birthdayYear = birthdayYear;
    }

    public Task4Person(String name, int birthdayYear, int currentYear) {
        this.name = name;
        this.birthdayYear = birthdayYear;
        this.currentYear = currentYear;
    }

    @Override
    public String toString() {
        return "Person{ " + this.name + ", Age = " + this.birthdayYear + ", CurY = " + this.currentYear + '}';
    }

    public void output() {
        System.out.println("values (" + this.name + ", birth = " + this.birthdayYear + ", cur = " + this.currentYear);
    }

    public void age() {
        this.birthdayYear = currentYear - birthdayYear;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = sc.nextLine();

        System.out.println("Enter current year: ");
        this.currentYear = sc.nextInt();

        System.out.println("Enter your birth year: ");
        this.birthdayYear = sc.nextInt();
    }

    public String changeName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Change your name: ");
        this.name = sc.nextLine();

        return this.name;
    }
}
