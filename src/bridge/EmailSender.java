package bridge;

class EmailSender implements NotificationSender {
    @Override
    public void send(String title, String message) {
        System.out.println("--- ENVIANDO E-MAIL ---");
        System.out.printf("Assunto: %s\n", title);
        System.out.printf("Corpo: %s\n", message);
        System.out.println("-----------------------\n");
    }
}