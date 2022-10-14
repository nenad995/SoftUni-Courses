package listyIterator;

import java.util.List;

public class ListyIterator {
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

}
