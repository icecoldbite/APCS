package CH10_ArrayList.FinancialAssets;

public class FinancialAssetsClient {
    public static void main(String[] args) {
        Asset[] myAssets = {new Cash(500),
                new Stock("Apple", 188.76, 30),
                new DividendStock("Microsoft", 117.31, 15)};
    }
}
