import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> text = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")){

            if (command.contains("merge")){

                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);

                if (startIndex < 0){
                    startIndex = 0;
                }

                if (endIndex > text.size() - 1){
                    endIndex = text.size() - 1;
                }

                boolean isIndexValid = (startIndex <= text.size() - 1) && (endIndex >= 0) && startIndex < endIndex;

                if (isIndexValid){
                    String resultMerge = "";
                    for (int i = startIndex; i <= endIndex; i++){
                        String currentText = text.get(i);
                        resultMerge += currentText;
                    }

                    for (int i = startIndex; i <= endIndex; i++){
                        text.remove(startIndex);
                    }

                    text.add(startIndex, resultMerge);
                }

            } else if (command.contains("divide")){
                int index = Integer.parseInt(command.split(" ")[1]);
                int parts = Integer.parseInt(command.split(" ")[2]);

                String elementToDivide = text.get(index);
                text.remove(index);

                int partSize = elementToDivide.length() / parts;
                int beginIndexOfText = 0;

                for (int i = 1; i < parts; i++){
                    text.add(index, elementToDivide.substring(beginIndexOfText, beginIndexOfText + partSize));
                    index++;
                    beginIndexOfText += partSize;
                }

                text.add(index, elementToDivide.substring(beginIndexOfText));

            }

            command = scanner.nextLine();
        }

        System.out.println(String.join(" ",text));

    }
}
