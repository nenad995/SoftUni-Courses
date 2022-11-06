package salaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }
    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percent){
        double currentSalary = this.getSalary();
        double newSalary;

        if (this.getAge() < 30){
            newSalary = currentSalary + currentSalary * (percent / 200);
        } else {
            newSalary = currentSalary + currentSalary * (percent / 100);
        }

        this.setSalary(newSalary);
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva", firstName, lastName, salary);
    }
}
