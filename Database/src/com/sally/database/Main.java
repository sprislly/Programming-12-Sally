package com.sally.database;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static DatabaseHandler handler;


    /* Retrieve Info Files
       Retrieves all the data from the database table.
       @param table, name of the folder; Requires String;
       @return the database table information, otherwise returns "There is no such table.";
        */
    public static void retrieveInfoFile(String table) { // Retrieve info from the table given by user
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

    /* Add Files
       Adds files into the databases table.
       @param String name, String path, String extension, String fileSize; Requires String;
       @return adds the information into the table.";
        */
    public static void addFiles(String name, String path, String extension, String fileSize){ // Add files infos from given folder through its absolute path
        String qu = "INSERT INTO "+ DatabaseHandler.name +" (name, path, extension, file_size) VALUES (" +
                "'" + name + "'," +
                "'" + path + "'," +
                "'" + extension + "'," +
                "'" + fileSize + "')";
        handler.execAction(qu);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Files and Databases table.\nRetrieve the name, path, extension and size of the files inside your folder.");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter 1 to create a new table / Enter 2 to retrieve information: ");
        if (myObj.nextLine().equals("1")) {
            System.out.println("Enter the absolute path of your folder: ");
            String path = myObj.nextLine();
            File folder = new File(path);
            DatabaseHandler.name= folder.getName();
            handler = DatabaseHandler.getHandler();
            ReadFolder.ReadFiles(folder);
        } else {
            System.out.println("Enter your folder name to retrieve your information: ");
            String tableName = myObj.nextLine();
            handler = DatabaseHandler.getHandler();
            retrieveInfoFile(tableName);
        }

    }
}
