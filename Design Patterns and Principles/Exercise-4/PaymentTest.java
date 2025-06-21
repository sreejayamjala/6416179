public class PaymentTest {
    public static void main(String[] args) {
        RazorPayGateway razor = new RazorPayGateway();
        PaymentProcessor razorProcessor = new RazorPayAdapter(razor);
        razorProcessor.processPayment(250.00);

        PhonePeGateway phonepe = new PhonePeGateway();
        PaymentProcessor phonePeProcessor = new PhonePeAdapter(phonepe);
        phonePeProcessor.processPayment(750.00);
    }
}
