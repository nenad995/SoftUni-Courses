package genericBoxOfInteger;

import java.util.ArrayList;
import java.util.List;

public class Box <T>{
    private List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void add(T t){
        list.add(t);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : list){
            sb.append(String.format("%s: %s%n",t.getClass().getName(), t.toString()));
        }

        return sb.toString();
    }


}
