package crashCourseSoftServe;

import crashCourseSoftServe.Task4Person;

public class Task4Main {
    public static void main(String[] args) {
        Task4Person data = new Task4Person("Alex");
        System.out.println(data);

        Task4Person data2 = new Task4Person("Alex",2000);
        System.out.println(data2);
        System.out.println();

        Task4Person data3 = new Task4Person(2000);
        System.out.println(data3);

        Task4Person Task4Person = new Task4Person(1000);
        Task4Person.age();
        Task4Person.print();
    }
}
