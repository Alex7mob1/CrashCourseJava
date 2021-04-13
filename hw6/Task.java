package crashCourseSoftServe.hw6;

import java.util.Objects;

public class Task {
    private int firstField;
    private int secondField;


    public Task(int firstField) {
        this.firstField = firstField;
        this.secondField = secondField;
    }

    public Task(int firstField, int secondField) {
        this.firstField = firstField;
        this.secondField = secondField;
    }

    public int getFirstField() {
        return firstField;
    }

    public void setFirstField(int firstField) {
        this.firstField = firstField;
    }

    public int getSecondField() {
        return secondField;
    }

    public void setSecondField(int secondField) {
        this.secondField = secondField;
    }

    @Override
    public String toString() {
        return "Task{" +
                "firstField=" + firstField +
                ", secondField=" + secondField +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return firstField == task.firstField &&
                secondField == task.secondField;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstField, secondField);
    }
}
