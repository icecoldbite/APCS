/**
 * DVD represents a DVD that is owned of a specific movie
 */

public class JacksonDerbyDVD {
    private String title;
    private String director;
    private int year;
    private double cost;
    private boolean isBlueray;

    /**
     * Constructs and initializes a DVD using the given information
     * @param title Title of the movie
     * @param director Director of the movie
     * @param year The year in which the movie was made
     * @param cost The cost of the DVD
     * @param isBlueray Is the DVD blue-ray(true) or not(false)
     */

    public JacksonDerbyDVD(String title, String director, int year, double cost, boolean isBlueray) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.cost = cost;
        this.isBlueray = isBlueray;
    }

    /**
     * Returns the information of the movie in a specified format. Displays the cost, then year, then title, then director, and Blu-Ray if it is one
     * @return Return type is String, as specified in description
     */

    @Override
    public String toString() {
        if(isBlueray) {
            return "$" + cost + "  " + year + "   " + title + "   " + director + "   Blu-Ray";
        }

        else {
            return "$" + cost + " " + year + " " + title + " " + director;
        }


    }
}
