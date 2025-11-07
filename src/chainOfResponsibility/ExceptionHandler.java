package chainOfResponsibility;

abstract public class ExceptionHandler {
    protected ExceptionHandler proximo;

    public ExceptionHandler setProximo(ExceptionHandler proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public abstract ErrorResponse handle(Exception e);
}
