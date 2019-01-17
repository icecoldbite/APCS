/**
 * Represents a collection of owned DVDs
 */

public class JacksonDerbyDVDCollection {
    private JacksonDerbyDVD[] collection;
    private int count;
    private double totalCost;

    /**
     * Initializes a blank DVD collection
     */

    public JacksonDerbyDVDCollection() {
        this.collection = new JacksonDerbyDVD[1];
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
        JacksonDerbyDVD dvd = new JacksonDerbyDVD(title, director, year, cost, isBlueray);
        collection[count] = dvd;
        this.increaseSize();
        totalCost = totalCost + cost;

    }

    /**
     * Private helper method that creates a new array 1 size bigger, copies all the information to the new, bigger array, and then dereferences the old array
     */

    private void increaseSize() {
        count+=1;
        JacksonDerbyDVD[] collection = new JacksonDerbyDVD[count + 1];
        for(int i = 0; i < count; i++) {
            collection[i] = this.collection[i];
        }

        this.collection = collection;

    }

    /**
     * Returns a formatted index of the collection, using a for loop to add every DVD to the returned string
     * @return Returns the string in its proper format
     */

    public String toString() {
        String movieCollection = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \nMy DVD Collection \n \nNumber Of Movies: " + count + "\nTotal Cost: $" + Math.round(100 * totalCost) /100.0 + "\nAverage Cost: $" + Math.round(100 * (totalCost/count)) /100.0 + "\n \nDVD List: \n \n";

        for(int i = 0; i < count; i++) {
            movieCollection = movieCollection + this.collection[i] + "\n";

        }

        return movieCollection;
    }



}
