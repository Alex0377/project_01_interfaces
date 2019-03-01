package Exception;

public class WrongIlluminanceException extends Exception{
    public WrongIlluminanceException(Throwable e){
        initCause(e);
    }
    public WrongIlluminanceException(String message) {
        super(message);
    }

}

