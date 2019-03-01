package Exception;

public class WrongSpaceException extends  Exception{
    public WrongSpaceException(Throwable e){
        initCause(e);
    }
    public WrongSpaceException(String message) {
        super(message);
    }

}
