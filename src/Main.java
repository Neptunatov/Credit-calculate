import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        for (int month = 0; month<37; month=month+12) {
            double percent = 9.99;
            int amount = 1_000_000;
            double myPay = service.calculate(month, percent, amount);
            System.out.println(myPay);
        }
    }
}