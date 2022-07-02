package students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++){
            String input = scanner.nextLine();

            String[] inputArr = input.split(" ");
            String firstName = inputArr[0];
            String lastName = inputArr[1];
            double grade = Double.parseDouble(inputArr[2]);

            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);
        }

        for (int i = 0; i < studentList.size() - 1; i++){
            for (int j = i + 1; j < studentList.size(); j++){
                if (studentList.get(i).getGrade() < studentList.get(j).getGrade()){

                    Student higherGradeStudent = studentList.get(j);
                    Student lowerGradeStudent = studentList.get(i);

                    studentList.set(i, higherGradeStudent);
                    studentList.set(j, lowerGradeStudent);
                }
            }
        }

        for (Student student : studentList){
            String studentInfo = student.toString();
            System.out.println(studentInfo);
        }
    }
}
