package randomArrayList;

public class Main {
    public static void main(String[] args) {

        RandomArrayList<Integer> list = new RandomArrayList();
        list.add(5);
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(45);
        list.add(55);
        list.add(65);
        list.add(75);

        System.out.println(list.getRandomElement());
    }
}
