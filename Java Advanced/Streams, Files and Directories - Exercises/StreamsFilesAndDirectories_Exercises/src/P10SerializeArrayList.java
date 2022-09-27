import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class P10SerializeArrayList {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        List<Double> list = new ArrayList<>();
        list.add(2.49);
        list.add(3.14);
        list.add(4.20);
        list.add(5.40);

        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("resources/list.ser"));
        output.writeObject(list);

        ObjectInputStream input = new ObjectInputStream(new FileInputStream("resources/list.ser"));
        ArrayList<Double> listFromFile = (ArrayList<Double>) input.readObject();

        for (Double d : listFromFile){
            System.out.println(d);
        }

    }
}
