import java.util.*;

public class P03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> plantMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++){
            String input = scanner.nextLine();

            String plant = input.split("<->")[0];
            String rarity = input.split("<->")[1];

            plantMap.put(plant,new ArrayList<>());
            plantMap.get(plant).add(rarity);
        }

        String command = scanner.nextLine();

        while (!command.equals("Exhibition")){

            /*
            Rate: Woodii - 5
            Update: Woodii - 5
            Reset: Arnoldii
            */

            String plantName = command.split(" ")[1];

            if (command.contains("Rate")){

                if (plantMap.containsKey(plantName)){
                    String rating = command.split(" - ")[1];
                    plantMap.get(plantName).add(rating);
                } else {
                    System.out.println("error");
                }

            } else if (command.contains("Update")){

                if (plantMap.containsKey(plantName)){
                    String newRarity = command.split(" - ")[1];
                    plantMap.get(plantName).remove(0);
                    plantMap.get(plantName).add(0, newRarity);
                } else {
                    System.out.println("error");
                }

            } else if (command.contains("Reset")){

                if (plantMap.containsKey(plantName)){
                    for (int i = 1; i < plantMap.get(plantName).size(); i++){
                        plantMap.get(plantName).remove(i);
                        i--;
                    }
                } else {
                    System.out.println("error");
                }
            }
            command = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");

        for (Map.Entry<String, List<String>> entry : plantMap.entrySet()) {
            if (entry.getValue().size() > 1){
                double avg = 0;

                for (int i = 1; i < entry.getValue().size(); i++){
                    double temp = Double.parseDouble(entry.getValue().get(i));
                    avg += temp;
                }

                avg = avg / (entry.getValue().size() - 1);

                System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(),Integer.parseInt(entry.getValue().get(0)), avg);
            } else {
                System.out.printf("- %s; Rarity: %d; Rating: 0.00%n", entry.getKey(),Integer.parseInt(entry.getValue().get(0)));
            }
        }


    }

    public static class Plant{
        int rarity;
        List<Double> rating;

        public int getRarity() {
            return rarity;
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public List<Double> getRating() {
            return rating;
        }

        public void setRating(List<Double> rating) {
            this.rating = rating;
        }

        public double calculateAverageRating(){
            if (getRating().size() > 0){
                double avg = 0.00;

                for (int i = 0; i < getRating().size(); i++){
                    avg += getRating().get(i);
                }

                avg = avg / getRating().size();

                return avg;
            } else {
                return 0.00;
            }
        }
    }
}
