package customList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList <T extends Comparable<T>>{
    private List<T> list;

    public CustomList() {
        this.list = new ArrayList<>();
    }

    public void add(T t){
        list.add(t);
    }

    public T remove(int index){
        T removedElement = list.get(index);
        list.remove(index);

        return removedElement;
    }

    public boolean contains(T element){
        return list.contains(element);
    }

    public void swap(int firstIndex, int secondIndex){
        Collections.swap(list, firstIndex, secondIndex);
    }

    public int countGreaterThan(T element){
        return (int) list.stream().filter(elementFromList -> elementFromList.compareTo(element) > 0).count();
    }

    public T max(){
        return list.stream().max(Comparable::compareTo).get();
    }

    public T min(){
        return list.stream().min(Comparable::compareTo).get();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for (T element : list){
            sb.append(element.toString()).append(System.lineSeparator());
        }

        return sb.toString().trim();
    }
}
