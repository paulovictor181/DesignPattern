package bridge;

class PromotionalNotification extends Notification {
    private String promotionDetails;

    public PromotionalNotification(NotificationSender sender, String promotionDetails) {
        super(sender);
        this.promotionDetails = promotionDetails;
    }

    @Override
    public void send() {
        String title = " Nova Promoção Imperdível!";
        sender.send(title, this.promotionDetails);
    }
}