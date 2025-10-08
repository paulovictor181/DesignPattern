package bridge;

public class Main {
    public static void main(String[] args) {

        NotificationSender emailSender = new EmailSender();
        NotificationSender whatsappSender = new WhatsappSender();

        Notification urgentMessage = new UrgentNotification(whatsappSender, "Falha na conexão com o banco de dados principal.");
        urgentMessage.send();

        Notification urgentLog = new UrgentNotification(emailSender, "Stack Trace: NullPointerException at com.app.Service:52");
        urgentLog.send();

        Notification campaignMarketing = new PromotionalNotification(emailSender, "Use o cupom DEV25 para 25% de desconto!");
        campaignMarketing.send();

        Notification campaignMarketingWhats = new PromotionalNotification(whatsappSender, "Use o cupom DEV25 para 25% de desconto!");
        campaignMarketingWhats.send();
    }
}