import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06StudentsV2 {

    public static class Student{
        String firstName;
        String lastName;
        int age;
        String hometown;

        public Student(String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getHometown() {
            return hometown;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();
        String command = scanner.nextLine();

        while (!command.equals("end")){

            String[] commandArr = command.split(" ");

            String firstName = commandArr[0];
            String lastName = commandArr[1];
            int age = Integer.parseInt(commandArr[2]);
            String hometown = commandArr[3];

            //Lecture logic
            if (doesExists(studentList, firstName, lastName)){
                Student student = findStudent(studentList, firstName, lastName);
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHometown(hometown);
            } else {
                Student student = new Student(firstName, lastName, age, hometown);
                studentList.add(student);
            }

            /*My logic
            Student student = new Student(firstName, lastName, age, hometown);
            int index = getStudentIndex(student, studentList);
            if (index >= 0){
                studentList.set(index, student);
            } else {
                studentList.add(student);
            }*/

            command = scanner.nextLine();
        }

        String cityName = scanner.nextLine();

        for (Student student : studentList){
            if (student.getHometown().equals(cityName)){
                System.out.println(student.getFirstName() + " "
                        + student.getLastName() + " is "
                        + student.getAge() + " years old");
            }
        }
    }

    /*
    My logic
    public static int getStudentIndex(Student student, List<Student> studentList){

        for (int i = 0; i < studentList.size(); i++){
            if (studentList.get(i).getFirstName().equals(student.getFirstName()) &&
            studentList.get(i).getLastName().equals(student.getLastName())){
                return i;
            }
        }
        return -1;
    }*/

    public static boolean doesExists(List<Student> studentList, String firstName, String lastName){

        for (Student studentElement : studentList) {
            if (studentElement.getFirstName().equals(firstName) &&
            studentElement.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    public static Student findStudent(List<Student> studentList, String firstName, String lastName){
        Student existingStudent = null;

        for (Student studentElement : studentList){
            if (studentElement.getFirstName().equals(firstName) &&
            studentElement.getLastName().equals(lastName)){
                existingStudent = studentElement;
            }
        }

        return existingStudent;
    }
}
