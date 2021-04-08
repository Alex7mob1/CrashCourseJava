package crashCourseSoftServe;

public class Task4Person {
    private String name;
    private int year;


    public Task4Person(String name) {
        this.name = name;
        this.year = 0;
    }

    public Task4Person(int year) {
        this.name = "null";
        this.year = year;
    }

    public Task4Person(String name, int year) {
        this.name = name;
        this.year = year;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            throw new IllegalArgumentException();
        }//this.year = 0;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + this.name + ", y=" + this.year + '}';
    }


    public int age(){
        int age1;
        age1 = 2020 - year;
        return age1;
    }
    public void print(){
        System.out.println("Point ("+this.getYear()+","+ this.getName()+")");
    }
}
