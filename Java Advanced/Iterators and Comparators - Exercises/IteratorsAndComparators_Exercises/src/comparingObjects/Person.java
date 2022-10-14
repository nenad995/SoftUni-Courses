package comparingObjects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTown() {
        return town;
    }

    @Override
    public int compareTo(Person another) {
        if (this.name.equals(another.getName())){
            if (this.age == another.getAge()){
                return this.town.compareTo(another.getTown());
            } else {
                return Integer.compare(this.age, another.getAge());
            }
        } else {
            return this.name.compareTo(another.getName());
        }
    }
}
