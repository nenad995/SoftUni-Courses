package listUtilities;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4);

        int max = ListUtils.getMax(list);
        System.out.println(max);

        int min = ListUtils.getMin(list);
        System.out.println(min);

    }
}
