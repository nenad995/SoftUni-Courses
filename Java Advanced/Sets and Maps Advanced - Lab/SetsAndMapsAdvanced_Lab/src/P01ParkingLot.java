import java.util.*;

public class P01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parkingLot = new LinkedHashSet<>();

        String input = scanner.nextLine();

        while (!input.equals("END")){

            String[] inputArr = input.split(", ");
            String inOrOut = inputArr[0];
            String plateNumber = inputArr[1];

            if (inOrOut.equals("IN")){
                parkingLot.add(plateNumber);
            } else if (inOrOut.equals("OUT")){
                parkingLot.remove(plateNumber);
            }

            input = scanner.nextLine();
        }

        if (parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else {
            for (String plateNum : parkingLot){
                System.out.println(plateNum);
            }
        }

    }
}
