public class CCB {
    public static void main(String[] args) {
        //variables
        int creditCardBalance = 5000;
        double creditCardInterestRate = 1.17;
        double costAfterOneMonth;
        double costAfterTwoMonths;

        //process
        costAfterOneMonth = creditCardBalance * creditCardInterestRate;
        costAfterTwoMonths = costAfterOneMonth * creditCardInterestRate;

        //output
        System.out.println("A credit card with a $5,000 balance with a 17% interest rate will be $" + costAfterOneMonth + " after one month. The same card with a 17% interest rate will be $" + costAfterTwoMonths + " after two months.");
    }
}