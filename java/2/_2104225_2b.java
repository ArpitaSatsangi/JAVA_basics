import java.text.DecimalFormat;
import java.util.*;

class Stock {
    private String symbol;
    private int totalShares;
    private double totalCost;
    private double currentPrice;

    public Stock(String symbol, double currentPrice) {
        this.symbol = symbol;
        this.currentPrice = currentPrice;
    }

    public double getProfit() {
        return ((currentPrice * totalShares) - totalCost);
    }

    public void purchase(int shares, double pricePerShare) {
        double update_cost = shares * pricePerShare;
        totalShares += shares;
        totalCost += update_cost;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }
}

class Investor {
    private String investorName;
    public ArrayList<Stock> cosList;

    public Investor(String name) {
        investorName = name;
        this.cosList = new ArrayList<Stock>();
    }

    public void addStock(Stock s) {
        cosList.add(s);
    }

    public double getTotalProfit() {
        double totalProfit = 0;
        Stock stocks;
        for (int i = 0; i < (cosList.size()); i++) {
            stocks = cosList.get(i);
            totalProfit += stocks.getProfit();
        }
        return totalProfit;
    }

    public void displayStockSummary() {
        Stock s;
        double profit, total_profit;

        System.out.println(investorName);
        System.out.print("\n");

        System.out.printf("%s %13s %20s", "Stock", "Curr. Price", "Profit/Loss\n");

        for (int i = 0; i < (cosList.size()); i++) {
            s = cosList.get(i);

            System.out.printf("%s    %-15.2f     %-32.2f", s.getSymbol(), s.getCurrentPrice(), s.getProfit());
            System.out.println();
        }
        total_profit = getTotalProfit();
        System.out.println();
        System.out.printf("%s %1.2f", "Total Profit/Loss = ", total_profit);
        System.out.println("\n");
    }

    public String getInvestorName() {
        return investorName;
    }
}

public class _2104225_2b {
    public static void main(String[] args) {
        Investor invest = readInput();
        invest.displayStockSummary();
        report(invest);
    }

    public static Investor readInput() {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(",");
        String name = s[0].trim();
        int num_stocks = Integer.parseInt(s[1].trim());
        Investor invest = new Investor(name);

        for (int i = 0; i < num_stocks; i++) {
            int shares, purchases;
            double share_price, curr_price;
            String symbol;
            s = sc.nextLine().split(",");
            symbol = s[0].trim();
            curr_price = Double.parseDouble(s[1].trim());
            purchases = Integer.parseInt(s[2].trim());
            Stock stocks = new Stock(symbol, curr_price);
            while (purchases-- != 0) {
                s = sc.nextLine().split(",");
                shares = Integer.parseInt(s[0].trim());
                share_price = Double.parseDouble(s[1].trim());

                stocks.purchase(shares, share_price);
            }
            invest.addStock(stocks);
        }
        sc.nextLine();
        return invest;
    }

    public static void report(Investor I) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        double totalProfit = I.getTotalProfit();

        System.out.println("Nett. Profit/Loss as of today: $" + df.format(totalProfit));

        Stock mostProfitableStock = null;
        for (Stock stock : I.cosList) {
            if (mostProfitableStock == null || stock.getProfit() > mostProfitableStock.getProfit()) {
                mostProfitableStock = stock;
            }
        }
        System.out.println(I.getInvestorName() + "’s most profitable scrip is: " + mostProfitableStock.getSymbol() +
                " (Price: " + df.format(mostProfitableStock.getCurrentPrice()) + " Profit: $" +
                df.format(mostProfitableStock.getProfit()) + ")");

        Stock leastProfitableStock = null;
        for (Stock stock : I.cosList) {
            if (leastProfitableStock == null || stock.getProfit() < leastProfitableStock.getProfit()) {
                leastProfitableStock = stock;
            }
        }
        System.out.println("What " + I.getInvestorName() + " should probably sell off: " +
                leastProfitableStock.getSymbol());
    }
}