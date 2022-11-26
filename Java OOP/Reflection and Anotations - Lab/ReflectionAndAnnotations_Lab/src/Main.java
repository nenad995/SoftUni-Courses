public class Main {

    public static void main(String[] args) {

        Reflection reflection = new Reflection();

        Class<Reflection> clazz = Reflection.class;

        System.out.println(clazz.getSimpleName());

    }
}
