package gov.mo.courts.cases.exception;

public class CaseException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public CaseException(String message) {
        super(message);
    }

    public CaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public CaseException(Throwable cause) {
        super(cause);
    }
}
