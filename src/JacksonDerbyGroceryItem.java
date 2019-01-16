public class JacksonDerbyGroceryItem {
    private String name;
    private int quantity;
    private double ppu;

    public JacksonDerbyGroceryItem(String name, int quantity, double ppu) {
        this.name = name;
        this.quantity = quantity;
        this.ppu = ppu;  //Price per unit
    }

    public double getCost() {
        return ppu * quantity;
    }  //Calculates and returns cost of the total number of the item bought

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item: " + name + ". Quantity bought: " + quantity + ". Price per unit: $" + ppu + ". Total cost of item: $" + this.getCost();
    }
}
