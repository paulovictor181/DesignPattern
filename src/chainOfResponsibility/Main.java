package chainOfResponsibility;

public class Main {
    private static ExceptionHandler exceptionHandler;

    public static ErrorResponse processarErro(Exception e) {
        return exceptionHandler.handle(e);
    }

    public static void main(String[] args) {
        ExceptionHandler validation = new ValidationHandler();
        ExceptionHandler database = new DatabaseHandler();
        ExceptionHandler fallback = new FallbackHandler();

        validation.setProximo(database).setProximo(fallback);

        exceptionHandler = validation;

        // Simulação 1: Erro de Validação
        Exception e1 = new ValidationException("Campo 'email' está vazio.");
        System.out.println(processarErro(e1));

        System.out.println("---");

        // Simulação 2: Erro de Banco de Dados
        Exception e2 = new DatabaseException("Timeout ao conectar com o BD.");
        System.out.println(processarErro(e2));

        System.out.println("---");

        // Simulação 3: Erro inesperado (NullPointer)
        Exception e3 = new NullPointerException("Variável 'user' é nula.");
        System.out.println(processarErro(e3));
    }
}
