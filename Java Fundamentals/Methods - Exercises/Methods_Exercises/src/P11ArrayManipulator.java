import java.util.Arrays;
import java.util.Scanner;

public class P11ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        while (!command.equals("end")){

            String[] commands = command.split(" ");
            String commandType = commands[0];

            switch (commandType){
                case "exchange":
                    int exchangeIndex = Integer.parseInt(commands[1]);
                    if (isValidIndex(exchangeIndex, intArr.length)){
                        intArr = exchange(intArr, exchangeIndex);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    String maxOddOrEven = commands[1];
                    if (maxOddOrEven.equals("odd")){
                        maxOddElementIndex(intArr);
                    } else if (maxOddOrEven.equals("even")){
                        maxEvenElementIndex(intArr);
                    }
                    break;
                case "min":
                    String minOddOrEven = commands[1];
                    if (minOddOrEven.equals("odd")){
                        minOddElementIndex(intArr);
                    } else if (minOddOrEven.equals("even")){
                        minEvenElementIndex(intArr);
                    }
                    break;
                case "first":
                    int countFirst = Integer.parseInt(commands[1]);

                    if (!isCountValid(countFirst, intArr.length)){
                        System.out.println("Invalid count");
                        command = scanner.nextLine();
                        continue;
                    }

                    String firstOddOrEven = commands[2];

                    if (firstOddOrEven.equals("odd")){
                        printFirstOdd(intArr, countFirst);
                    } else if (firstOddOrEven.equals("even")){
                        printFirstEven(intArr, countFirst);
                    }
                    break;
                case "last":
                    int countLast = Integer.parseInt(commands[1]);

                    if (!isCountValid(countLast, intArr.length)){
                        System.out.println("Invalid count");
                        command = scanner.nextLine();
                        continue;
                    }

                    String lastOddOrEven = commands[2];

                    if (lastOddOrEven.equals("odd")){
                        printLastOdd(intArr, countLast);
                    } else if (lastOddOrEven.equals("even")){
                        printLastEven(intArr, countLast);
                    }

                    break;
            }

            command = scanner.nextLine();
        }

        System.out.print("[");
        for (int i = 0; i < intArr.length; i++){
            if (i == intArr.length - 1){
                System.out.print(intArr[i]);
            } else {
                System.out.print(intArr[i] + ", ");
            }
        }
        System.out.println("]");

    }

    public static boolean isCountValid(int count, int length){
        return count <= length;
    }

    public static void printLastEven(int[] numbers, int count){
        String output = "";

        for (int i = numbers.length - 1; i >= 0; i--){
            int currentNumber = numbers[i];

            if (currentNumber % 2 == 0){
                output += currentNumber;
                if (count != 1) {
                    output += " ";
                }
                count --;
            }

            if (count == 0) {
                break;
            }
        }

        if (output.equals("")){
            System.out.println("[]");
        } else {

            int[] convertedArray = Arrays.stream(output.split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.print("[");

            for (int i = convertedArray.length - 1; i >= 0; i--) {
                if (i == 0) {
                    System.out.print(convertedArray[i]);
                } else {
                    System.out.print(convertedArray[i] + ", ");
                }
            }

            System.out.println("]");
        }
    }

    public static void printLastOdd(int[] numbers, int count){
        String output = "";

        for (int i = numbers.length - 1; i >= 0; i--){
            int currentNumber = numbers[i];

            if (currentNumber % 2 != 0){
                output += currentNumber;

                if (count != 1) {
                    output += " ";
                }
                count --;


            }

            if (count == 0) {
                break;
            }
        }

        if (output.equals("")){
            System.out.println("[]");
        } else {

            int[] convertedArray = Arrays.stream(output.split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.print("[");

            for (int i = convertedArray.length - 1; i >= 0; i--) {
                if (i == 0) {
                    System.out.print(convertedArray[i]);
                } else {
                    System.out.print(convertedArray[i] + ", ");
                }
            }

            System.out.println("]");
        }
    }

    public static void printFirstEven(int[] numbers, int count) {
        String output = "";

        for (int i = 0; i < numbers.length; i++){
            int currentNumber = numbers[i];

            if (currentNumber % 2 == 0){
                output += currentNumber;

                if (count > 1) {
                    output += " ";
                }

                count --;
            }

            if (count == 0) {
                break;
            }

        }

        if (output.equals("")){
            System.out.println("[]");
        } else {
            int[] convertedArray = Arrays.stream(output.split(" ")).mapToInt(Integer::parseInt).toArray();

            System.out.print("[");

            for (int i = 0; i < convertedArray.length; i++){
                if (i == convertedArray.length - 1){
                    System.out.print(convertedArray[i]);
                } else {
                    System.out.print(convertedArray[i] + ", ");
                }
            }

            System.out.println("]");
        }

    }

    public static void printFirstOdd(int[] numbers, int count) {

        String output = "";

        for (int i = 0; i < numbers.length; i++){
            int currentNumber = numbers[i];

            if (currentNumber % 2 != 0){
                output += currentNumber;

                if (count != 1) {
                    output += " ";
                }
                count --;
            }

            if (count == 0) {
                break;
            }

        }

        if (output.equals("")){
            System.out.println("[]");
        } else {
            int[] convertedArray = Arrays.stream(output.split(" ")).mapToInt(Integer::parseInt).toArray();

            System.out.print("[");

            for (int i = 0; i < convertedArray.length; i++) {
                if (i == convertedArray.length - 1) {
                    System.out.print(convertedArray[i]);
                } else {
                    System.out.print(convertedArray[i] + ", ");
                }
            }

            System.out.println("]");
        }
    }

    public static boolean isValidIndex(int index, int length){
        return index >= 0 && index < length;
    }

    public static int[] exchange(int[] numbers, int exchangeIndex){

        int[] numbersBeforeIndex = new int[exchangeIndex + 1];
        int[] numbersAfterIndex = new int[numbers.length - numbersBeforeIndex.length];

        for (int i = 0; i <= exchangeIndex; i++){
            numbersBeforeIndex[i] = numbers[i];
        }

        for (int i = exchangeIndex + 1; i < numbers.length; i++){
            int currentElement = numbers[i];
            numbersAfterIndex[i - exchangeIndex - 1] = currentElement;
        }

        int[] exchangedArr = new int[numbers.length];

        for (int i = 0; i < numbersAfterIndex.length; i++){
            exchangedArr[i] = numbersAfterIndex[i];
        }

        for (int i = 0; i < numbersBeforeIndex.length; i++){
            exchangedArr[exchangedArr.length - exchangeIndex - 1 + i] = numbersBeforeIndex[i];
        }

        return exchangedArr;
    }

    public static void maxOddElementIndex(int[] numbers) {

        int biggestOddElement = Integer.MIN_VALUE;
        int indexOfBiggestElement = -1;

        for (int i = 0; i < numbers.length; i++){

            if (numbers[i] % 2 != 0 && numbers[i] >= biggestOddElement){
                biggestOddElement = numbers[i];
                indexOfBiggestElement = i;
            }
        }

        if (indexOfBiggestElement == -1){
            System.out.println("No matches");
        } else {
            System.out.println(indexOfBiggestElement);
        }

    }

    public static void maxEvenElementIndex(int[] numbers) {

        int biggestEvenElement = Integer.MIN_VALUE;
        int indexOfBiggestElement = -1;

        for (int i = 0; i < numbers.length; i++){

            if (numbers[i] % 2 == 0 && numbers[i] >= biggestEvenElement){
                biggestEvenElement = numbers[i];
                indexOfBiggestElement = i;
            }
        }

        if (indexOfBiggestElement == -1){
            System.out.println("No matches");
        } else {
            System.out.println(indexOfBiggestElement);
        }

    }

    public static void minOddElementIndex(int[] numbers) {

        int smallestOddElement = Integer.MAX_VALUE;
        int indexOfSmallestElement = -1;


        for (int i = 0; i < numbers.length; i++){

            if (numbers[i] % 2 != 0 && numbers[i] < smallestOddElement){
                smallestOddElement = numbers[i];
                indexOfSmallestElement = i;
            }
        }

        if (indexOfSmallestElement == -1){
            System.out.println("No matches");
        } else {
            System.out.println(indexOfSmallestElement);
        }

    }

    public static void minEvenElementIndex(int[] numbers) {

        int smallestEvenElement = Integer.MAX_VALUE;
        int indexOfSmallestElement = -1;


        for (int i = 0; i < numbers.length; i++){

            if (numbers[i] % 2 == 0 && numbers[i] < smallestEvenElement){
                smallestEvenElement = numbers[i];
                indexOfSmallestElement = i;
            }
        }

        if (indexOfSmallestElement == -1){
            System.out.println("No matches");
        } else {
            System.out.println(indexOfSmallestElement);
        }

    }

}
