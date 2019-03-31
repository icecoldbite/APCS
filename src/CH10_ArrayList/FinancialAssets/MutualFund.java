package CH10_ArrayList.FinancialAssets;

public class MutualFund extends ShareAsset {
    private double totalShares;

    public MutualFund(String symbol, double currentPrice, double totalShares) {
        super(symbol, currentPrice);
        this.totalShares = totalShares;
    }

    @Override
    public double getMarketValue() {
        return totalShares * getCurrentPrice();
    }

    public void purchase(int shares, double pricePerShare) {
        totalShares += shares;
        addCost(shares * pricePerShare);
    }

}
