package orderByAge;

public class Person {

    private String name;
    private int id;
    private int age;

    public Person(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

        return this.name + " with ID: " + this.id + " is " + this.age + " years old.";
    }
}
