package com.example.finalprojectsally;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.io.IOException;

public class Main extends Application {
    public static DatabaseHandler handler;
    public static void addMember(String id, String userName, String pass, String books){
        String qu = "INSERT INTO MEMBER VALUES (" +
                "'" + id + "'," +
                "'" + userName + "'," +
                "'" + pass + "'," +
                "'" + books + "')";
        handler.execAction(qu);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("sample.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        handler = new DatabaseHandler();
        launch();

        }
}