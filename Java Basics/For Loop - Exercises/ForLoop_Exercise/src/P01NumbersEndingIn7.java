public class P01NumbersEndingIn7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++){
            if (i % 10 == 7){
                System.out.println(i);
            }
        }
    }
}
