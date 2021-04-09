package crashCourseSoftServe.hw4;

public class Task4Main {
    public static void main(String[] args) {
        Task4Person data = new Task4Person("Alex");
        data.outPut();

        Task4Person data2 = new Task4Person();
        data2.outPut();
        System.out.println();

        Task4Person data3 = new Task4Person();
        data3.outPut();
        System.out.println();

        Task4Person data4 = new Task4Person();
        data4.outPut();
        System.out.println();

        Task4Person data5 = new Task4Person();
        data5.outPut();
        System.out.println();

        data2.inPut();
        data2.age();
        data2.toString();
        data2.outPut();
        data2.changeName();
        data2.outPut();
    }
}
