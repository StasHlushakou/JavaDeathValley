package DBAccess;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOImplementation implements DAOInterface<UserDTO>{

    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/banklist?serverTimezone=Europe/Moscow&useSSL=false";
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String USER = "root";
    static final String PASSWORD = "root";

    private Connection connection;
    private Statement statement;


    private void createConnection() {
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    private void closeConnection(){
        try {
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    @Override
    public UserDTO getUserById(int id) throws FieldNotFoundInDataBase{

        this.createConnection();
        UserDTO user = null;
        String sql;
        sql = "SELECT * FROM user WHERE userid=" + Integer.toString(id);

        try {
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()){
                int userid = resultSet.getInt("userid");
                String name = resultSet.getString("name");
                String sureName = resultSet.getString("sureName");

                user = new UserDTO(userid, name, sureName);
            } else {
                throw new FieldNotFoundInDataBase( "User with id " + Integer.toString(id) + " not found in database" );
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        this.closeConnection();

        return user;

    }

    @Override
    public List<UserDTO> getAllUsers() {

        this.createConnection();

        String sql;
        sql = "SELECT * FROM user";
        List<UserDTO> users = new ArrayList<>();

        try {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int userid = resultSet.getInt("userid");
                String name = resultSet.getString("name");
                String sureName = resultSet.getString("sureName");

                UserDTO user = new UserDTO(userid, name, sureName);
                users.add(user);

            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        this.closeConnection();

        return users;

    }



}
