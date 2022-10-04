package bankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> bankAccounts = new HashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");

            switch (tokens[0]) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    bankAccounts.put(bankAccount.getId(), bankAccount);
                    System.out.printf("Account ID%d created%n", bankAccount.getId());
                    break;
                case "Deposit":
                    int id = Integer.parseInt(tokens[1]);
                    double amount = Double.parseDouble(tokens[2]);
                    if (doesExist(id, bankAccounts)) {
                        bankAccounts.get(id).deposit(amount);
                        System.out.printf("Deposited %.0f to ID%d%n", amount, id);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    double newInterestRate = Double.parseDouble(tokens[1]);
                    BankAccount.setInterestRate(newInterestRate);
                    break;
                case "GetInterest":
                    int accountId = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    if (doesExist(accountId, bankAccounts)){
                        System.out.printf("%.2f%n", bankAccounts.get(accountId).getInterest(years));
                    } else {
                        System.out.println("Account does not exist");

                    }
                    break;
            }

            command = scanner.nextLine();
        }
    }

    private static boolean doesExist(int id, Map<Integer, BankAccount> bankAccounts) {
        if (bankAccounts.containsKey(id)) {
            return true;
        } else {
            return false;
        }
    }
}
