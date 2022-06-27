package com.sally.database;

import java.io.File;
import java.util.Objects;

public class ReadFolder {
    /* ReadFiles
   Reads the files in the directory. Gets the name, path, extension and size of every file,
   then adds it to their directories' database table.
   @param folder the directory being taken in; Requires File;
   @return the file information into the database table;
    */
    public static void ReadFiles(File folder){
        for (File file : Objects.requireNonNull(folder.listFiles())) {
            if (!file.isDirectory()) {
                String fileName = file.getName();
                String filePath = file.getPath();
                String extension = "";
                int i = fileName.lastIndexOf('.');
                if (i > 0) {
                    extension = fileName.substring(i+1);
                }
                long fileSize = file.length();
                Main.addFiles(fileName, filePath, extension, Long.toString(fileSize));
//                System.out.println("File name = " + fileName + "\nFile path = " + filePath + "\nFile extension = " + extension + "\nFile size = " + fileSize);
            }else{
                ReadFiles(file);
            }
        }
    }

}
