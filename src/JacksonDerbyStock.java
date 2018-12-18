public class JacksonDerbyStock {
    private String stockName;
    private double stockPrice;
    private int totalShares;
    private int sharesOwned;
    private double percentOwned;

    public JacksonDerbyStock(String stockName, double stockPrice, int sharesOwned, int totalShares) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.sharesOwned = sharesOwned;
        this.totalShares = totalShares;
        this.percentOwned = (sharesOwned / (double) totalShares) * 100;
    }

    public void buyShares(int amount) {
        this.sharesOwned += amount;
        this.percentOwned = (sharesOwned / (double) totalShares) * 100;
    }

    public void sellShares(int amount) {
        this.sharesOwned -= amount;
        this.percentOwned = (sharesOwned / (double) totalShares) * 100;
    }

    public String toString() {
        return "The stock is of " + stockName + ", and its price is $" + stockPrice + ". You own " + sharesOwned + " shares of a possible " + totalShares + ", which means you own " + percentOwned + "% of the shares";
    }
}
