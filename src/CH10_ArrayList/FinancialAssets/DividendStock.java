package CH10_ArrayList.FinancialAssets;

public class DividendStock extends Stock {
    private double dividends;

    public DividendStock(String symbol, double currentPrice, int totalShares){
        super(symbol, currentPrice, totalShares);
    }
}
