import java.sql.*;

public class DatabaseHandler {
    private static final String DB_url = "jdbc:derby:database/forum;create=true";
    private static Connection conn = null;
    private static Statement stmt = null;
    public static DatabaseHandler handler;
    public static String name; // Storing name through Main Class

    public DatabaseHandler() {
        createConnection();
        createFileList();
    }

    public static DatabaseHandler getHandler() {
        if (handler == null) {
            handler = new DatabaseHandler();
        }
        return handler;
    }

    private void createTable() {
        String TABLE_NAME = "MEMBER";
        try{
            stmt = conn.createStatement();
            DatabaseMetaData dmn = conn.getMetaData();
            ResultSet tables = dmn.getTables(null,null,TABLE_NAME,null);
            if(tables.next()){
                System.out.println("Table "+TABLE_NAME+" exists");
            }else{
                String statement = "CREATE TABLE "+TABLE_NAME+"("
                        + "id varchar(200) primary key, \n"
                        + "name varchar(200), \n"
                        + "email varchar(200), \n"
                        + "nickname varchar(200))";
                System.out.println(statement);
                stmt.execute(statement);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createFileList() {
        String TABLE_NAME = name; // Name of the folder stored previously
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

    private void createConnection() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            conn = DriverManager.getConnection(DB_url);
        } catch (SQLException e) {
//            System.out.println("There is no such table. ");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
//            System.out.println("There is no such table. ");
            e.printStackTrace();
        } catch (InstantiationException e) {
//            System.out.println("There is no such table. ");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
//            System.out.println("There is no such table. ");
            e.printStackTrace();
        }
    }

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