import java.util.*;

public class P05AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentRecord = new TreeMap<>();

        for (int i = 0; i < n; i++){
            String input = scanner.nextLine();
            String name = input.split(" ")[0];
            double grade = Double.parseDouble(input.split(" ")[1]);

            if (!studentRecord.containsKey(name)){
                studentRecord.put(name, new ArrayList<>());
                studentRecord.get(name).add(grade);
            } else {
                studentRecord.get(name).add(grade);
            }
        }

        for (Map.Entry<String, List<Double>> entry : studentRecord.entrySet()) {
            double avg = 0.0;
            StringBuilder sb = new StringBuilder();

            for (double grade : entry.getValue()){
                avg += grade;
                String tmp = String.format("%.2f ", grade);
                sb.append(tmp);
            }

            avg = avg / entry.getValue().size();


            System.out.printf("%s -> %s(avg: %.2f)%n",
                    entry.getKey(),
                    sb,
                    avg);
        }
    }
}
