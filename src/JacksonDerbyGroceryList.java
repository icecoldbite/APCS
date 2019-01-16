import java.util.Arrays;

public class JacksonDerbyGroceryList {
    private int numberOfItems;
    private JacksonDerbyGroceryItem[] list;

    public JacksonDerbyGroceryList() {
        this.list = new JacksonDerbyGroceryItem[10];
        this.numberOfItems = 0;
    }

    public void addItem(JacksonDerbyGroceryItem item) {
        if(numberOfItems < 10) {  //If the list has space, add the Item, otherwise display that there is no space left
            list[numberOfItems] = item;  //Sets the value of the empty spot in the array to the given Item object, then increments the number of items by 1 for the next Item object
            numberOfItems += 1;
        }

        else {
            System.out.println("List is already full. Sorry!");
        }
    }

    public double getTotalCost() {
        double sum = 0.0;

        for(int i = 0; i < numberOfItems; i++) {  //Sums the cost of all Items in the array and returns the value
            sum+= list[i].getCost();
        }

        return sum;
    }

    @Override
    public String toString() {
        return "The list contains " + numberOfItems + " items, which are " + Arrays.toString(list);
    }
}
