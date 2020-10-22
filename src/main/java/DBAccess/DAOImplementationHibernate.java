package DBAccess;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class DAOImplementationHibernate implements DAOInterface<UserDTO> {

    private static SessionFactory sessionFactory ;

    static {
        sessionFactory  = new Configuration().configure().buildSessionFactory();
    }


    @Override
    public UserDTO getUserById(int id) throws FieldNotFoundInDataBase {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();
        List users = session.createQuery("FROM UserDTO WHERE userid =" + id).list();
        transaction.commit();
        session.close();

        if (users.isEmpty()){
            throw new FieldNotFoundInDataBase( "User with id " + Integer.toString(id) + " not found in database" );
        }
        UserDTO user = (UserDTO) users.get(0);
        return user;
    }

    @Override
    public List<UserDTO> getAllUsers() {

        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();
        List users = session.createQuery("FROM UserDTO").list();
        transaction.commit();
        session.close();
        return users;

    }

    @Override
    public UserDTO getRichestUser() throws FieldNotFoundInDataBase {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();
        List users = session.createQuery("FROM UserDTO WHERE userid = (SELECT userid FROM AccountDTO WHERE account = (SELECT MAX(account) FROM AccountDTO ))").list();


        transaction.commit();
        session.close();

        if (users.isEmpty()){
            throw new FieldNotFoundInDataBase( "Database is empty" );
        }
        UserDTO user = (UserDTO) users.get(0);
        return user;
    }

    @Override
    public int getAccountSum() {

        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();
        List sumList = session.createQuery("SELECT SUM(account) FROM AccountDTO").list();
        transaction.commit();
        session.close();

        int sum = 0;
        if (!sumList.isEmpty()){
            sum = (int) ( (long) sumList.get(0) );
        }

        return sum;

    }
}
