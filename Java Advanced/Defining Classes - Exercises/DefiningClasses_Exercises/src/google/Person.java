package google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private List<Pokemon> pokemons;
    private List<Parent> parents;
    private List<Children> children;
    private Car car;

    public Person(String name) {
        this.name = name;
        this.pokemons = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public List<Children> getChildren() {
        return children;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(this.name).append(System.lineSeparator());
        output.append("Company:").append(System.lineSeparator());
        if (this.company != null) {
            output.append(this.company);
        }
        output.append("Car:").append(System.lineSeparator());
        if (this.car != null) {
            output.append(this.car);
        }
        output.append("Pokemon:").append(System.lineSeparator());
        this.pokemons.forEach(output::append);
        output.append("Parents:").append(System.lineSeparator());
        this.parents.forEach(output::append);
        output.append("Children:").append(System.lineSeparator());
        this.children.forEach(output::append);
        return output.toString();
    }
}
