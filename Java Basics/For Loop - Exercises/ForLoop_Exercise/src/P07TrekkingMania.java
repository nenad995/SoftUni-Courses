import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());//4


        int allPeople = 0;
        int musalaPeople = 0;
        int montblanPeople = 0;
        int kilimandzharoPeople = 0;
        int k2People = 0;
        int everestPeople = 0;
        for (int i = 1; i <= groups; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());

            allPeople = allPeople + peopleInGroup;

            if (peopleInGroup <= 5) {
                musalaPeople = musalaPeople + peopleInGroup;
            } else if (peopleInGroup <= 12) {
                montblanPeople = montblanPeople + peopleInGroup;
            } else if (peopleInGroup <= 25) {
                kilimandzharoPeople = kilimandzharoPeople + peopleInGroup;
            } else if (peopleInGroup <= 40) {
                k2People = k2People + peopleInGroup;
            } else {
                everestPeople = everestPeople + peopleInGroup;
            }
        }

        System.out.printf("%.2f%%", musalaPeople * 1.0 / allPeople * 100);
        System.out.println();
        System.out.printf("%.2f%%", montblanPeople * 1.0 / allPeople * 100);
        System.out.println();
        System.out.printf("%.2f%%", kilimandzharoPeople * 1.0 / allPeople * 100);
        System.out.println();
        System.out.printf("%.2f%%", k2People * 1.0 / allPeople * 100);
        System.out.println();
        System.out.printf("%.2f%%", everestPeople * 1.0 / allPeople * 100);
        System.out.println();
    }
}
