package pizzaCalories;

public class Dough {

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (!flourType.equals("White") && !flourType.equals("Wholegrain")){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (!bakingTechnique.equals("Crispy") && !bakingTechnique.equals("Chewy") && !bakingTechnique.equals("Homemade")){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories(){
        double totalCalories = 2.0 * weight;

        if (this.flourType.equals("White")){
            switch (this.bakingTechnique){
                case "Crispy":
                    totalCalories = (totalCalories * 1.5) * 0.9;
                    break;
                case "Chewy":
                    totalCalories = (totalCalories * 1.5) * 1.1;
                    break;
                case "Homemade":
                    totalCalories = totalCalories * 1.5;
                    break;
            }
        } else if (this.flourType.equals("Wholegrain")){
            switch (this.bakingTechnique){
                case "Crispy":
                    totalCalories = totalCalories * 0.9;
                    break;
                case "Chewy":
                    totalCalories = totalCalories * 1.1;
                    break;
                case "Homemade":
                    break;
            }
        }

        return totalCalories;
    }
}
