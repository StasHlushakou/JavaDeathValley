package org.example.DBAccess;

import java.util.List;

public interface DAOInterface<T> {

    public T getUserById(int id) throws FieldNotFoundInDataBase;
    public List<T> getAllUsers();
    public T getRichestUser() throws FieldNotFoundInDataBase;
    public int getAccountSum();
}
