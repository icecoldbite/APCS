public class JacksonDerbyCake {
    private String ingredients;
    private int numberOfTiers;
    private String frostingFlavor;
    private double cost;
    private boolean isGood;
    private String typeOfCake;
    private boolean hasDecorations;
    private String event;

    public JacksonDerbyCake(String ingredients, String frostingFlavor, String typeOfCake, boolean isGood) {
        this.ingredients = ingredients;
        this.frostingFlavor = frostingFlavor;
        this.typeOfCake = typeOfCake;
        this.isGood = isGood;
    }

    public JacksonDerbyCake(String ingredients, String frostingFlavor, String typeOfCake, boolean isGood, int numberOfTiers, double cost, boolean hasDecorations, String event) {
        this.ingredients = ingredients;
        this.frostingFlavor = frostingFlavor;
        this.typeOfCake = typeOfCake;
        this.isGood = isGood;
        this.numberOfTiers = numberOfTiers;
        this.cost = cost;
        this.hasDecorations = hasDecorations;
        this.event = event;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public int getNumberOfTiers() {
        return numberOfTiers;
    }

    public void setNumberOfTiers(int numberOfTiers) {
        this.numberOfTiers = numberOfTiers;
    }

    public String getFrostingFlavor() {
        return frostingFlavor;
    }

    public void setFrostingFlavor(String frostingFlavor) {
        this.frostingFlavor = frostingFlavor;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isGood() {
        return isGood;
    }

    public String getTypeOfCake() {
        return typeOfCake;
    }

    public void setTypeOfCake(String typeOfCake) {
        this.typeOfCake = typeOfCake;
    }

    public boolean isHasDecorations() {
        return hasDecorations;
    }

    public void setHasDecorations(boolean hasDecorations) {
        this.hasDecorations = hasDecorations;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "The cake is a " + typeOfCake  + " cake with " + frostingFlavor + " frosting. It was made using " + ingredients + ", and the fact that this cake is good is a " + isGood + " statement";

    }
}
