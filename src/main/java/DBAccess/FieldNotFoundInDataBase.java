package DBAccess;

public class FieldNotFoundInDataBase extends Exception {

    public FieldNotFoundInDataBase() {
    }

    public FieldNotFoundInDataBase(String message) {
        super(message);
    }

}
