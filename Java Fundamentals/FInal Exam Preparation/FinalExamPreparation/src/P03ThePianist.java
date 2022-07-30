import java.util.*;

public class P03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> pieceAndAuthor = new LinkedHashMap<>();
        Map<String, String> pieceAndKey = new LinkedHashMap<>();

        for (int i = 0; i < n; i++){
            String[] piece = scanner.nextLine().split("\\|");

            pieceAndAuthor.put(piece[0],piece[1]);
            pieceAndKey.put(piece[0], piece[2]);
        }

        String command = scanner.nextLine();

        while (!command.equals("Stop")){

            String pieceFromCommand = command.split("\\|")[1];

            switch (command.split("\\|")[0]){

                case "Add":
                   if (pieceAndAuthor.containsKey(pieceFromCommand)){
                       System.out.println(pieceFromCommand + " is already in the collection!");
                   } else {
                        String authorFromCommand = command.split("\\|")[2];
                        String keyFromCommand = command.split("\\|")[3];

                        pieceAndAuthor.put(pieceFromCommand, authorFromCommand);
                        pieceAndKey.put(pieceFromCommand, keyFromCommand);
                       System.out.println(pieceFromCommand + " by " + authorFromCommand + " in " + keyFromCommand +
                               " added to the collection!");
                   }
                   break;
                case "Remove":
                    if (pieceAndAuthor.containsKey(pieceFromCommand)){
                        pieceAndAuthor.remove(pieceFromCommand);
                        pieceAndKey.remove(pieceFromCommand);
                        System.out.println("Successfully removed " + pieceFromCommand + "!");
                    } else {
                        System.out.println("Invalid operation! " + pieceFromCommand + " does not exist in the collection.");
                    }
                    break;
                case "ChangeKey":
                    String newKey = command.split("\\|")[2];
                    if (pieceAndKey.containsKey(pieceFromCommand)){
                        pieceAndKey.put(pieceFromCommand, newKey);
                        System.out.println("Changed the key of " + pieceFromCommand + " to " + newKey + "!");
                    } else {
                        System.out.println("Invalid operation! " + pieceFromCommand + " does not exist in the collection.");
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : pieceAndAuthor.entrySet()) {
            System.out.println(entry.getKey() + " -> Composer: " + entry.getValue() + ", Key: " + pieceAndKey.get(entry.getKey()));
        }

    }
}
