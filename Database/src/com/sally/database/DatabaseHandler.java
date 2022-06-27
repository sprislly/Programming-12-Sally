package com.sally.database;
import java.sql.*;

public class DatabaseHandler {
    private static final String DB_url = "jdbc:derby:database/forum;create=true";
    private static Connection conn = null;
    private static Statement stmt = null;
    public static DatabaseHandler handler;
    public static String name;

    public DatabaseHandler() {
        createConnection();
        createFileList();
    }

    /* Get Handler
    Returns the handler, if there is no handler, it creates a new instance.
    @return handler;
    */
    public static DatabaseHandler getHandler() {
        if (handler == null) {
            handler = new DatabaseHandler();
        }
        return handler;
    }

    /* Create File List
    Creates a database table with the columns name, path, extension, and size.
     */
    private void createFileList() {
        String TABLE_NAME = name;
        try{
            stmt = conn.createStatement();
            DatabaseMetaData dmn = conn.getMetaData();
            ResultSet tables = dmn.getTables(null,null,TABLE_NAME,null);
            if(tables.next()){
                System.out.println("Table "+TABLE_NAME+" exists");
            }else{
                String statement = "CREATE TABLE "+TABLE_NAME+" ("
                        + "num INT NOT NULL  GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1) , \n "
                        + "name varchar(200), \n"
                        + "path varchar(200), \n"
                        + "extension varchar(200), \n"
                        + "file_size varchar(200))";
                System.out.println(statement);
                stmt.execute(statement);
            }
        } catch (SQLException e) {
//            System.out.println("There is no such table. ");
            e.printStackTrace();
        }
    }

    /* Create Connection
    Sets up the derby connection.
     */
    private void createConnection() {
        try {
            conn = DriverManager.getConnection(DB_url);
        } catch (SQLException e) {
//            System.out.println("There is no such table. ");
            e.printStackTrace();
        }
    }

    /* ExecAction
    @param String qu is the SQL directions; Requires String.
    @return adds the files into the database table, otherwise returns false.
     */
    public boolean execAction(String qu) {
        try{
            stmt = conn.createStatement();
            stmt.execute(qu);
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Did not enter data");

        }
        return false;
    }

    /* ExecQuery
    Finds the database table using the SQL information.
    @param String query; Requires String;
    @return the database table, otherwise returns null;
     */
    public ResultSet execQuery(String query) {
        ResultSet resultSet;
        try{
            stmt = conn.createStatement();
            resultSet = stmt.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("There is no such table. ");
//            e.printStackTrace();
            return null;
        }
        return resultSet;
    }
}