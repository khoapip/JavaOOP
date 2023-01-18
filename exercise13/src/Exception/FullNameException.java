package Exception;

public class FullNameException extends Exception{
    public FullNameException(String msg){
        super(msg);
    }

    public FullNameException(String msg, Throwable e){
        super(msg, e);
    }
}
