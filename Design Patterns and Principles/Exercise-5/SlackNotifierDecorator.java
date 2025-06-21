public class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        super.send(message); // Send existing notification
        System.out.println("Sending Slack: " + message); // Add new behavior
    }
}
