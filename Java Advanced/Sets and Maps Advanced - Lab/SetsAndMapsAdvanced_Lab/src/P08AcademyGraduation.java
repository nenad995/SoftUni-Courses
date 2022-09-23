import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class P08AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        Map<String, Double[]> map = new TreeMap<>();

        for (int i = 0; i < numberOfStudents; i++){
            String studentName = scanner.nextLine();
            String[] stringScores = scanner.nextLine().split(" ");
            Double[] scores = new Double[stringScores.length];

            for (int j = 0; j < scores.length; j++){
                scores[j] = Double.parseDouble(stringScores[j]);
            }

            map.put(studentName,scores);
        }

        for (Map.Entry<String, Double[]> entry : map.entrySet()) {
            double avg = 0.0;

            for (Double e : entry.getValue()){
                avg += e;
            }

            avg = avg / entry.getValue().length;

            DecimalFormat decimalFormat = new DecimalFormat("#.#######################");
            System.out.println(entry.getKey() + " is graduated with " + decimalFormat.format(avg));
            //System.out.printf("%s is graduated with %f%n", entry.getKey(), avg);
        }
    }
}
