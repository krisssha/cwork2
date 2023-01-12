package exception;

public class IncorrectTaskParametrException extends Exception{
    private final String parametr;



    public IncorrectTaskParametrException(String parametr) {
        this.parametr = parametr;
    }
    @Override
    public String getMessage() {
        return "Параметр "+ parametr + " задан неверно!";
    }
}
