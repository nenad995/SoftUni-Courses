import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("course start")){

            List<String> commandList = Arrays.stream(command.split(":")).collect(Collectors.toList());
            String commandType = commandList.get(0);

            switch (commandType){

                case "Add":
                    String lessonToAdd = commandList.get(1);
                    if (!schedule.contains(lessonToAdd)){
                        schedule.add(lessonToAdd);
                    }
                    break;
                case "Insert":
                    String lessonToInsert = commandList.get(1);
                    if (!schedule.contains(lessonToInsert)) {
                        int index = Integer.parseInt(commandList.get(2));
                        if (index >= 0 && index <= schedule.size()-1){
                            schedule.add(index, lessonToInsert);
                        }
                    }
                    break;
                case "Remove":
                    String lessonToRemove = commandList.get(1);
                    if (schedule.contains(lessonToRemove)) {
                        schedule.remove(lessonToRemove);
                        String exerciseToRemove = lessonToRemove + "-Exercise";
                        schedule.remove(exerciseToRemove);
                    }
                    break;
                case "Swap":
                    String firstLesson = commandList.get(1);
                    String secondLesson = commandList.get(2);

                    if (schedule.contains(firstLesson) && schedule.contains(secondLesson)){

                        int firstLessonIndex = schedule.indexOf(firstLesson);
                        int secondLessonIndex = schedule.indexOf(secondLesson);

                        schedule.set(firstLessonIndex, secondLesson);
                        schedule.set(secondLessonIndex, firstLesson);

                        String firstExercise = firstLesson + "-Exercise";
                        String secondExercise = secondLesson + "-Exercise";

                        if (schedule.contains(firstExercise)){
                            schedule.remove(schedule.indexOf(firstExercise));
                            schedule.add(schedule.indexOf(firstLesson) + 1, firstExercise);
                        }

                        if (schedule.contains(secondExercise)) {
                            schedule.remove(schedule.indexOf(secondExercise));
                            schedule.add(schedule.indexOf(secondLesson) + 1, secondExercise);
                        }
                    }
                    break;
                case "Exercise":
                    String lessonName = commandList.get(1);
                    String exercise = lessonName + "-Exercise";

                    int lessonIndex = schedule.indexOf(lessonName);

                    if (schedule.contains(lessonName)) {
                        if (lessonIndex == schedule.size() - 1) {
                            schedule.add(lessonIndex + 1, exercise);
                        } else if (!schedule.get(lessonIndex + 1).equals(exercise)) {
                            schedule.add(lessonIndex + 1, exercise);
                        }
                    } else {
                        schedule.add(lessonName);
                        schedule.add(exercise);
                    }

                    break;
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < schedule.size(); i++){
            System.out.println(i+1 + "." + schedule.get(i));
        }
    }
}
