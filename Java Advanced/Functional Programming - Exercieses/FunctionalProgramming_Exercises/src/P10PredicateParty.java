import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P10PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String> filters = new ArrayList<>();

        String command = scanner.nextLine();

        while (!command.equals("Party!")) {
            filters.add(command);
            command = scanner.nextLine();
        }

        filters.forEach(filter -> {
            Predicate<String> filterToApply = getPredicate(filter);

            if (filter.contains("Double")) {
                //Double each element that meets the given criteria
                List<String> guestsToAdd = new ArrayList<>();
                guests.stream().filter(filterToApply).forEach(g -> guestsToAdd.add(g));
                guests.addAll(guestsToAdd);
            } else if (filter.contains("Remove")) {
                //Remove each element that meets the given criteria
                guests.removeIf(filterToApply);
            }
        });

        if (guests.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            String result = guests.stream().sorted().collect(Collectors.joining(", "));
            System.out.println(result + " are going to the party!");
        }

    }

    private static Predicate<String> getPredicate(String filter) {
        String[] filterParts = filter.split(" ");
        String type = filterParts[1];
        String parameter = filterParts[2];

        switch (type) {
            case "StartsWith":
                return s -> s.startsWith(parameter);
            case "EndsWith":
                return s -> s.endsWith(parameter);
            case "Length":
                return s -> s.length() == Integer.parseInt(parameter);
        }
        return null;
    }
}
