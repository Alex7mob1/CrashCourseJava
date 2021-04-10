package crashCourseSoftServe.hw4;

public class Task4Main {
    public static void main(String[] args) {
        Task4Person data = new Task4Person("Alex");
        data.output();

        Task4Person data2 = new Task4Person();
        data2.output();
        System.out.println();

        Task4Person data3 = new Task4Person();
        data3.output();
        System.out.println();

        Task4Person data4 = new Task4Person();
        data4.output();
        System.out.println();

        Task4Person data5 = new Task4Person();
        data5.output();
        System.out.println();

        data2.input();
        data2.age();
        System.out.println(data2);
        data2.output();
        data2.changeName();
        data2.output();
    }
}
