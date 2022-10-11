package genericScale;

public class Scale<T extends Comparable<T>> {
    private T left;
    private T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getHeavier(){
        if (this.left.equals(this.right)){
            return null;
        } else {
            int result = this.left.compareTo(this.right);

            if (result > 0){
                return left;
            } else {
                return right;
            }
        }
    }
}
