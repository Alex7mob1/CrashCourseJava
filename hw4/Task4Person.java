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
        this.name = "null";
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


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthdayYear() {
        return birthdayYear;
    }

    public void setBirthdayYear(int birthdayYear) {
        this.birthdayYear = birthdayYear;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    @Override
    public String toString() {
        System.out.println("Person{ " + this.name + ", Age = " + this.birthdayYear + ", CurY = " + this.currentYear + '}');
        return "Person{" + '}';
    }

    public void outPut() {
        System.out.println("values (" + this.name + ", birth = " + this.birthdayYear + ", cur = " + this.currentYear);
    }

    public void age() {
        setBirthdayYear(currentYear - birthdayYear);
    }

    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String newName = sc.nextLine();
        setName(newName);
        System.out.println("Enter current year: ");
        int newCurYer = sc.nextInt();
        setCurrentYear(newCurYer);
        System.out.println("Enter your birth year: ");
        int newBirthYer = sc.nextInt();
        setBirthdayYear(newBirthYer);
    }

    public String changeName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Change your name: ");
        String newName = sc.nextLine();
        setName(newName);
        return newName;
    }
}
