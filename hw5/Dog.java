package crashCourseSoftServe.hw5;

public class Dog {

    enum Breed {
        COCKER,
        LABRADOR,
        BIGL,
        HUSKY
    }

    private String name;
    private int age;
    private Breed breed;

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }

//    public int compareAge(){
//        return 0;
//    }

//    public int checkName(){
//        return name.compareTo(getName());
//    }

    Dog first = new Dog("num1", 5,Breed.HUSKY);
    Dog second = new Dog("num2", 2,Breed.COCKER);
    Dog third = new Dog("num3", 9, Breed.LABRADOR);

    public void checkName() {
        if (first.getName().equals(second.getName()) || second.getName().equals(third.getName()) || first.getName().equals(third.getName())) {
            System.out.println("We have the same name");
        } else {
            System.out.println("We don't have duplicate");
        }
    }

    public void compareAge() {
        if (first.getAge() < second.getAge() && second.getAge() < third.getAge()) {
            System.out.println(third.name + " have the biggest age, it's " + third.getAge());
        } else if (second.getAge() < third.getAge() && third.getAge() < first.getAge()) {
            System.out.println(first.name + " have the biggest age, it's " + first.getAge());
        } else if (third.getAge() < first.getAge() && first.getAge() < second.getAge()) {
            System.out.println(second.name + " have the biggest age, it's " + second.getAge());
        } else {
            System.out.println("All age have one number");
        }
    }
}
