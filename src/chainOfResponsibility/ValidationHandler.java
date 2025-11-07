package chainOfResponsibility;

public class ValidationHandler extends ExceptionHandler{
    @Override
    public ErrorResponse handle(Exception e) {
        if (e instanceof ValidationException) {
            return new ErrorResponse(400, "Dados Inválidos: " + e.getMessage());
        }

        return proximo.handle(e);
    }
}
