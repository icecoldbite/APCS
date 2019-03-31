import java.util.ArrayList;

/**
 * Represents a collection of owned DVDs
 */

public class JacksonDerbyDVDCollectionMod {
    private ArrayList<JacksonDerbyDVDMod> collection;
    private int count;
    private double totalCost;

    /**
     * Initializes a blank DVD collection
     */

    public JacksonDerbyDVDCollectionMod() {
        this.collection = new ArrayList<>();
        this.count = 0;
        this.totalCost = 0.0;
    }

    /**
     * Adds a DVD to the collection based on the information given. Method automatically increments count, sums total cost, and adds a blank entry onto the array for the next DVD
     * @param title Title of the movie
     * @param director Director of the movie
     * @param year The year in which the movie was made
     * @param cost The cost of the DVD
     * @param isBlueray Is the DVD blue-ray(true) or not(false)
     */

    public void addDVD(String title, String director, int year, double cost, boolean isBlueray) {
        collection.add(new JacksonDerbyDVDMod(title, director, year, cost, isBlueray));
        totalCost = totalCost + cost;
        this.count+= 1;
    }

    /**
     * Returns a formatted index of the collection, using a for loop to add every DVD to the returned string
     * @return Returns the string in its proper format
     */

    public String toString() {
        String movieCollection = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \nMy DVD Collection \n \nNumber Of Movies: " + count + "\nTotal Cost: $" + Math.round(100 * totalCost) /100.0 + "\nAverage Cost: $" + Math.round(100 * (totalCost/count)) /100.0 + "\n \nDVD List: \n \n";

        for(int i = 0; i < count; i++) {
            movieCollection = movieCollection + collection.get(i) + "\n";

        }

        return movieCollection;
    }



}
