import java.io.*;

public class P11SerializeCustomObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Course course = new Course();
        course.name = "Java Advanced";
        course.numberOfStudents = 280;

        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("resources/courses.ser"));

        output.writeObject(course);

        ObjectInputStream input = new ObjectInputStream(new FileInputStream("resources/courses.ser"));

        Course courseFromFile = (Course) input.readObject();
        System.out.println(courseFromFile.name);
        System.out.println(courseFromFile.numberOfStudents);

    }
}
