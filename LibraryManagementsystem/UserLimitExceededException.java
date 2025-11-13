package LibraryManagementsystem;

public class UserLimitExceededException extends Exception {
    public UserLimitExceededException(String msg) { super(msg); }
}