import org.apache.derby.impl.store.raw.log.Scan;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static DatabaseHandler handler;

    public static void retrieveInfoFile(String table) {
        String qu = "SELECT * FROM "+ table;
        ResultSet resultSet = handler.execQuery(qu);
        try{
            while (resultSet.next()){
                String name = resultSet.getString("NAME");
                String path = resultSet.getString("PATH");
                String extension = resultSet.getString("EXTENSION");
                String fileSize = resultSet.getString("FILE_SIZE");
                System.out.println("File Name: " + name + "\t| File Path: " + path + "\t| File Extension: "+ extension+"\t| File Size: " + fileSize +" bytes");
            }
        } catch (SQLException e) {
            System.out.println("There is no such table.");
//            e.printStackTrace();
        }
    }

    public static void addFiles(String name, String path, String extension, String fileSize){
        String qu = "INSERT INTO "+ DatabaseHandler.name +" (name, path, extension, file_size) VALUES (" +
                "'" + name + "'," +
                "'" + path + "'," +
                "'" + extension + "'," +
                "'" + fileSize + "')";
        handler.execAction(qu);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter 1 to create a new table / Enter 2 to retrieve information: ");
        if (myObj.nextLine().equals("1")) {
            System.out.println("Enter the absolute path of your folder: ");
            String path = myObj.nextLine();
            File folder = new File(path);
            DatabaseHandler.name= folder.getName();
            handler = DatabaseHandler.getHandler();
            Folder.ReadFiles(folder);
        } else {
            System.out.println("Enter your folder name to retrieve your information: ");
            String tableName = myObj.nextLine();
            handler = DatabaseHandler.getHandler();
            retrieveInfoFile(tableName);
        }

    }
}
