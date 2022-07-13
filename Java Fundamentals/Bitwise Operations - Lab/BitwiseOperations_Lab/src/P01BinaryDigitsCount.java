import java.util.Scanner;

public class P01BinaryDigitsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        String bitRepresentation = Integer.toBinaryString(n);

        /*while (n > 0){
            int reminder = n % 2;
            bitRepresentation = bitRepresentation + reminder;
            n /= 2;
        }*/

        int bitCounter = 0;

        for (int i = 0; i < bitRepresentation.length(); i++){
            if (b == Character.getNumericValue(bitRepresentation.charAt(i))){
                bitCounter++;
            }
        }

        System.out.println(bitCounter);
    }
}

