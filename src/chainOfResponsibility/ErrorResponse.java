package chainOfResponsibility;

public class ErrorResponse {
    private int statusCode;
    private String message;

    public ErrorResponse(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Resposta [HTTP " + statusCode + "]: " + message;
    }
}
