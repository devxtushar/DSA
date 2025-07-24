public class Fn {

    public static void updatePrices(int prices[]) {
        prices[1] = prices[1] + 1; // call by reference work with non primitive datatypes like arrays , strings and
                                   // others
    }

    public static void main(String[] args) {
        int prices[] = { 10, 20, 30 };

        System.out.println("Prices before update" + prices[1]);
        updatePrices(prices);
        System.out.println("Prices after update" + prices[1]);

    }

}
