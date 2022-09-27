import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(31);
        numbers.add(4);
        numbers.add(27);

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("serialization.txt"));
        outputStream.writeObject(numbers);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("serialization.txt"));
        List<Integer> deserialization = (List) inputStream.readObject();

        for (Integer n : deserialization){
            System.out.println(n);
        }
    }
}
