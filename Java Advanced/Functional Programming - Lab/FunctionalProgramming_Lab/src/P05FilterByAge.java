import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class P05FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Function<Scanner, Person> readPerson = sc -> {
            String[] data = sc.nextLine().split(", ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            return new Person(name, age);
        };

        /*List<Person> people = IntStream.range(0, n)
                .mapToObj(i -> readPerson.apply(scanner))
                .collect(Collectors.toList());*/

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++){
            Person p = readPerson.apply(scanner);
            people.add(p);
        }

        String condition = scanner.nextLine();
        int ageFilter = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        Predicate<Person> filterByAge = getFilter(condition, ageFilter);
        Consumer<Person> printer = getPrinter(format);

        people.stream()
                .filter(filterByAge)
                .forEach(printer);

    }

    private static Consumer<Person> getPrinter(String format) {
        switch (format){
            case "name":
                return p -> System.out.println(p.name);
            case "age":
                return p -> System.out.println(p.age);
            case "name age":
                return p -> System.out.println(p.name + " - " + p.age);
            default:
                throw new IllegalArgumentException("Unknown print format: " + format);
        }
    }

    private static Predicate<Person> getFilter(String condition, int ageFilter) {
        switch (condition){
            case "older":
                return p -> p.age >= ageFilter;
            case "younger":
                return p -> p.age <= ageFilter;
            default:
                throw new IllegalArgumentException("Unknown condition: " + condition);
        }
    }

    public static class Person{
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
