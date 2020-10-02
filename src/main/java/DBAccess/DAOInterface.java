package DBAccess;

import java.util.List;

public interface DAOInterface<T> {

    public T getUserById(int id) throws FieldNotFoundInDataBase;
    public List<T> getAllUsers();

}
