package crashCourseSoftServe.hw3;

public class Call {
    private int price;
    private int time;
    private String country;

    public Call(int price, int time, String country) {
        this.price = price;
        this.time = time;
        this.country = country;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Calls{" +
                "country = " + country +
                ", price=" + price +
                " dollars for min, time=" + time +
                " minutes }";
    }

    public double sum() {
        double sum;
        sum = getPrice() * getTime();
        return sum;
    }

    public void printSum() {
        System.out.println("You must pay for " + getCountry() + " call = " + sum() + " dollars");
    }
}
