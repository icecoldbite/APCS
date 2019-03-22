package CH10_ArrayList.FinancialAssets;

public abstract class ShareAsset implements Asset{
    private String symbol;
    private double totalCost;
    private double currentPrice;

    public ShareAsset(String symbol, double currentPrice) {
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        this.totalCost = 0.0;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void addCost(double cost) {
        this.totalCost += cost;
    }

    @Override
    public double getProfit() {
        return getMarketValue() - totalCost;
    }

    public abstract double getMarketValue();

}
