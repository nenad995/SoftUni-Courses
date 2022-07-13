import java.util.*;

public class P07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            String  studentGrade = scanner.nextLine();

            if (!map.containsKey(studentName)){
                map.put(studentName, new ArrayList<>());
            }

            map.get(studentName).add(studentGrade);
        }

        Map<String, Double> studentAverageGradeMap = new LinkedHashMap<>();

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {

            String studentName = entry.getKey();
            List<String> grades = entry.getValue();

            double avg = grades.stream().mapToDouble(Double::parseDouble).average().getAsDouble();

            if (avg >= 4.50){
                studentAverageGradeMap.put(studentName, avg);
            }
        }

        for (Map.Entry<String, Double> entry : studentAverageGradeMap.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }
    }
}
