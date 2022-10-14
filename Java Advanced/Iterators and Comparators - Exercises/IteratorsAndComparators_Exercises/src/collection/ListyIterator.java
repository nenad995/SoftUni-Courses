package collection;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String>{
    private List<String> list;
    private int currentIndex;

    public ListyIterator(String... elements) {
        this.list = List.of(elements);
        currentIndex = 0;
    }

    public boolean hasNext(){
        return currentIndex < list.size() - 1;
    }

    public boolean move(){
        if (hasNext()){
            currentIndex++;
            return true;
        } else {
            return false;
        }
    }

    public void print(){
        if (list.isEmpty()){
            throw new IllegalStateException("Invalid Operation!");
        } else {
            System.out.println(list.get(currentIndex));
        }

    }

    public void printAll(){
        String result = String.join(" ", list);
        System.out.printf("%s%n", result);
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int internalIndex;

            @Override
            public boolean hasNext() {
                return internalIndex < list.size();
            }

            @Override
            public String next() {
                String element = list.get(internalIndex);
                internalIndex++;
                return element;
            }
        };
    }
}
