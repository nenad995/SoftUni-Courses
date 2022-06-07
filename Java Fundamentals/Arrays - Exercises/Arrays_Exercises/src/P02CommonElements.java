import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String valuesOfFirstArr = scanner.nextLine();
        String[] firstArr = valuesOfFirstArr.split(" ");

        String valuesOfSecondArr = scanner.nextLine();
        String[] secondArr = valuesOfSecondArr.split(" ");

        for (int i = 0; i < secondArr.length; i++){
            for (int j = 0; j < firstArr.length; j++){
                if (secondArr[i].equals(firstArr[j])){
                    System.out.print(secondArr[i] + " ");
                }
            }
        }
    }
}
