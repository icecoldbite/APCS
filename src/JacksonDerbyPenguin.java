public class JacksonDerbyPenguin {
    private String species;
    private double height;
    private double weight;
    private int age;
    private boolean isParent;
    private char gender;
    private boolean isHungry;
    private String location;
    private boolean isSick;
    private boolean isInjured;
    private boolean canFly =  false;

    public JacksonDerbyPenguin(String species, double height, double weight, int age, boolean isParent, char gender, boolean isHungry, boolean isSick, boolean isInjured, String location) {
        this.species = species;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.isParent = isParent;
        this.gender = gender;
        this.isHungry = isHungry;
        this.isSick = isSick;
        this.isInjured = isInjured;
        this.location = location;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isParent() {
        return isParent;
    }

    public void setParent(boolean parent) {
        isParent = parent;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isSick() {
        return isSick;
    }

    public void setSick(boolean sick) {
        isSick = sick;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {  //In the unlikely case someone creates a functioning jetpack, straps it to a penguin, and teaches it to use it, this method is here
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return "The penguin's species is " + species + ", its height is " + height + ", and its weight is " + weight + ". It is " + age + " years old, and its gender is " + gender +
                ". It lives in the " + location;
    }
}
