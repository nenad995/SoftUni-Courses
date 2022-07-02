package students;

public class Student {
    private String firstName;
    private String lastName;
    private double grade;

    public Student(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        String report = String.format("%s %s: %.2f", firstName, lastName, grade);
        return report;
    }
}
