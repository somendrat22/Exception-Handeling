public class UserNotExistException extends RuntimeException {
    public UserNotExistException(String mssg){
        // Whenever we write super it means we are calling constructor of parent class
        super(mssg);
    }
}
