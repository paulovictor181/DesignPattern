package bridge;

class UrgentNotification extends Notification {
    private String errorDetails;

    public UrgentNotification(NotificationSender sender, String errorDetails) {
        super(sender);
        this.errorDetails = errorDetails;
    }

    @Override
    public void send() {
        String title = "[URGENTE] Erro Crítico no Sistema";
        sender.send(title, this.errorDetails);
    }
}