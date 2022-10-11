package genericScale;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> scale = new Scale<>(14, 32);
        System.out.println(scale.getHeavier());

        Scale<String> scale1 = new Scale<>("ASD", "A");
        System.out.println(scale1.getHeavier());
    }
}
