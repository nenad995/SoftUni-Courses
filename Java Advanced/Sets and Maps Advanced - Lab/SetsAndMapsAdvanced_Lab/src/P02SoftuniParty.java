import java.util.*;

public class P02SoftuniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> VIP = new TreeSet<>();
        Set<String> regular = new TreeSet<>();

        String input = scanner.nextLine();

        while (!input.equals("PARTY")){
            if (Character.isDigit(input.charAt(0))){
                VIP.add(input);
            } else {
                regular.add(input);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("END")){
            if (Character.isDigit(input.charAt(0))){
                VIP.remove(input);
            } else {
                regular.remove(input);
            }
            input = scanner.nextLine();
        }

        int numberOfNotPresentGuests = (VIP.size()) + (regular.size());
        System.out.println(numberOfNotPresentGuests);

        if (!VIP.isEmpty()){
            for (String guest : VIP){
                System.out.println(guest);
            }
        }
        if (!regular.isEmpty()){
            for (String guest : regular){
                System.out.println(guest);
            }
        }
    }
}
