import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, List<String>> companiesMap = new LinkedHashMap<>();

        while (!command.equals("End")){

            String[] commandArr = command.split(" -> ");
            String companyName = commandArr[0];
            String employeeId = commandArr[1];

            if (!companiesMap.containsKey(companyName)){
                companiesMap.put(companyName, new ArrayList<>());
                companiesMap.get(companyName).add(employeeId);
            } else {
                List<String> employees = companiesMap.get(companyName);
                if (!employees.contains(employeeId)){
                    companiesMap.get(companyName).add(employeeId);
                }
            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companiesMap.entrySet()) {
            System.out.println(entry.getKey());
            for (String id : entry.getValue()){
                System.out.println("-- " + id);
            }
        }
    }
}
