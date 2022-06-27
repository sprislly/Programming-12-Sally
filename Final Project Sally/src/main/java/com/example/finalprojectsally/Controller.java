package com.example.finalprojectsally;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class Controller {

    public TextField textName;
    public PasswordField textPass;
    public Button btnSave;
    public Label success;


    public int i = 0;
    public void addUser(ActionEvent actionEvent) {

        String name = textName.getText();
        String pass = textPass.getText();

        User temp = new User(textName.getText(), textPass.getText());

        String books = "";

        Main.addMember(name, pass, books);
        success.setText("You can now check out books under user: " + name);


    }

    public void opensBooks(ActionEvent actionEvent) {
        loadWindow("bookWindow.fxml", "Books");
    }

    public void opensUser(ActionEvent actionEvent) {
        loadWindow("userWindow.fxml", "Users");

    }

    private void loadWindow(String location, String title){
        try{
            Parent parent = FXMLLoader.load(getClass().getResource("/com/example/finalprojectsally/" + location));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle(title);
            stage.setScene(new Scene(parent));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public void checkUser(ActionEvent actionEvent) {
/*
    String qu = "SELECT * FROM MEMBER";
    ResultSet resultSet = Main.handler.execQuery(qu);
    try{
        while(resultSet.next()){
            String n = resultSet.getString("USERNAME");
            String p = resultSet.getString("PASSWORD");
            if(Objects.equals(n, textName.getText()) && Objects.equals(p, textPass.getText())){
                success.setText("You can now check out books under user: " + n);
            }
        }
    } catch (Exception e) {
        throw new RuntimeException(e);
    }

 */
    }

}