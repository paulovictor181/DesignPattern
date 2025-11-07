package chainOfResponsibility;

public class DatabaseHandler extends ExceptionHandler{
    @Override
    public ErrorResponse handle(Exception e) {
        if (e instanceof DatabaseException) {
            System.err.println("LOG CRÍTICO: Erro de banco de dados! " + e.getMessage());
            return new ErrorResponse(500, "Erro Interno no Servidor. Contate o suporte.");
        }

        return proximo.handle(e);
    }
}
