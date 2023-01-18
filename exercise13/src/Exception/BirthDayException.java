package Exception;

public class BirthDayException extends  Exception{
    public BirthDayException(String msg){
        super(msg);
    }

    public BirthDayException(String msg, Throwable e) {
        super(msg, e);
    }
}
