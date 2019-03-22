package CH10_ArrayList.FinancialAssets;

public class Stock extends ShareAsset{
    private int totalShares;

    public Stock(String symbol, double currentPrice, int totalShares) {
        super(symbol, currentPrice);
        this.totalShares = totalShares;
    }

    @Override
    public double getMarketValue() {
        return totalShares * getCurrentPrice();
    }

    public void purchase(int shares, double pricePerStock) {
        totalShares += shares;
        addCost(shares * pricePerStock);
    }
}
