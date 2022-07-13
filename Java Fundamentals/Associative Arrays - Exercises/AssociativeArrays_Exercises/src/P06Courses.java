import java.util.*;

public class P06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, List<String>> coursesMap = new LinkedHashMap<>();

        while (!command.equals("end")){

            String[] commandArr = command.split(" : ");
            String courseName = commandArr[0];
            String studentName = commandArr[1];

            if (!coursesMap.containsKey(courseName)){
                coursesMap.put(courseName, new ArrayList<>());
            }

            coursesMap.get(courseName).add(studentName);

            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : coursesMap.entrySet()) {
            int numberOfStudents = entry.getValue().size();

            System.out.println(entry.getKey() + ": " + numberOfStudents);
            for (String student : entry.getValue()){
                System.out.println("-- " + student);
            }
        }
    }
}
