import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {

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

            Student student = new Student(firstName, lastName, age, hometown);
            studentList.add(student);

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
}

//John Smith 15 Sofia
//Peter Ivanov 14 Plovdiv
//Linda Bridge 16 Sofia
//Simon Stone 12 Varna
//end
//Sofia
