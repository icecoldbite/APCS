public class JacksonDerbyBicycle {
    private double price;
    private boolean isPurchased;
    private String condition;
    private double psi;
    private int wheels;
    private int numberOfGears;
    private int ageRange;
    private String color;
    private double rpm;
    private boolean isBraking;
    private boolean isInMotion;

    public JacksonDerbyBicycle(double price, boolean isPurchased, String condition, int ageRange, String color) {
        this.price = price;
        this.isPurchased = isPurchased;
        this.condition = condition;
        this.ageRange = ageRange;
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPurchased(boolean purchased) {
        isPurchased = purchased;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setPsi(double psi) {
        this.psi = psi;
    }


    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void setBraking(boolean braking) {
        isBraking = braking;
    }

    public void setInMotion(boolean inMotion) {
        isInMotion = inMotion;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPurchased() {
        return isPurchased;
    }

    public String getCondition() {
        return condition;
    }

    public double getPsi() {
        return psi;
    }

    public int getWheels() {
        return wheels;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public int getAgeRange() {
        return ageRange;
    }

    public String getColor() {
        return color;
    }

    public double getRpm() {
        return rpm;
    }

    public boolean isBraking() {
        return isBraking;
    }

    public boolean isInMotion() {
        return isInMotion;
    }

    @Override
    public String toString() {
        return "Price = " + price + ", The bike has been bought is " + isPurchased + ", The condition of the bike is " + condition + ", The age range of the bike is " + ageRange +
                ", The color of the bike is " + color;
    }
}
