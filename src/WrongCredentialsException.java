public class WrongCredentialsException extends Exception{
    // This WrongCredentialsException will become checked exception or compile time exception
    public WrongCredentialsException(String mssg){
        super(mssg);
    }
}
