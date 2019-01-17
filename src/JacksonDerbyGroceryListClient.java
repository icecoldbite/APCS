public class JacksonDerbyGroceryListClient {
    public static void main(String[] args) {
        JacksonDerbyGroceryList stopandshop = new JacksonDerbyGroceryList();
        stopandshop.addItem(new JacksonDerbyGroceryItem("Orange", 4, 2.59));
        stopandshop.addItem(new JacksonDerbyGroceryItem("Milk", 1, 3.82));

        System.out.println(stopandshop);

    }
}
