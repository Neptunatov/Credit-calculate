public class CreditPaymentService {
    public double calculate(int x, double y, int z) {
        double result;
        double a = y / 100 / x;
        double b = Math.pow((1 + a), x);
        result = (z * a) / (1 - (1 / b));

        return result;
    }

}
