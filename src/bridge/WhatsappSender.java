package bridge;

class WhatsappSender implements NotificationSender {
    @Override
    public void send(String title, String message) {
        System.out.println("--- ENVIANDO MENSAGEM VIA WHATSAPP ---");
        System.out.printf("Mensagem: %s - %s\n", title, message);
        System.out.println("--------------------\n");
    }
}