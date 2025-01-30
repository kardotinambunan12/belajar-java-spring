package belajar_restful.exception;

public class ApiException extends RuntimeException {
    public ApiException(String message) {
        super(message);
    }
}
