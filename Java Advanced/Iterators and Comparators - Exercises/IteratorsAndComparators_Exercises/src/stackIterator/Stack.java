package stackIterator;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Stack implements Iterable<Integer>{
    ArrayDeque<Integer> stack;

    public Stack() {
        this.stack = new ArrayDeque<>();
    }

    public void push(int[] arr){
        for (int i = 0; i < arr.length; i++){
            this.stack.push(arr[i]);
        }
    }

    public void pop(){
        if (this.stack.isEmpty()){
            System.out.println("No elements");
        } else {
            this.stack.pop();
        }
    }

    public class StackIterator implements Iterator<Integer>{

        private ArrayDeque<Integer> originalStack = new ArrayDeque<>(stack);

        @Override
        public boolean hasNext() {
            return !originalStack.isEmpty();
        }

        @Override
        public Integer next() {
            return originalStack.pop();
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new StackIterator();
    }
}
