package prototype;

public class Email implements Prototype {
    private String assunto;
    private String remetente;
    private String corpo;
    private String destinatario;

    public Email(String assunto, String remetente, String corpo) {
        this.assunto = assunto;
        this.remetente = remetente;
        this.corpo = corpo;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public Prototype clone() {
        return new Email(this.assunto, this.remetente, this.corpo);
    }

    @Override
    public String toString() {
        return "Email{" +
                "assunto='" + assunto + '\'' +
                ", remetente='" + remetente + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", corpo='" + corpo + '\'' +
                '}';
    }
}