package chainOfResponsibility;

public class FallbackHandler extends ExceptionHandler {
    @Override
    public ErrorResponse handle(Exception e) {
        System.err.println("LOG GERAL: Erro não tratado: " + e.getClass().getName());
        return new ErrorResponse(500, "Ocorreu um erro inesperado no sistema.");
    }
}
