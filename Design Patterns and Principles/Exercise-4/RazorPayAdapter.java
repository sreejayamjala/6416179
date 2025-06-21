public class RazorPayAdapter implements PaymentProcessor {
    private RazorPayGateway razor;

    public RazorPayAdapter(RazorPayGateway razor) {
        this.razor = razor;
    }

    public void processPayment(double amount) {
        razor.payR(amount);
    }
}
