package defaultAndStaticDemo;

interface PaymentRules {
    static boolean isValidAmount(double amount) {
        return amount > 0;
    }
}

public class PaymentRulesMain {
    public static void main(String[] args) {
        System.out.println(PaymentRules.isValidAmount(500));
        System.out.println(PaymentRules.isValidAmount(-20));
    }
}