package com.example.finalprojectsally;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.apache.derby.iapi.sql.PreparedStatement;
import org.apache.derby.iapi.sql.ResultSet;
import org.apache.derby.iapi.sql.Statement;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookWindow {

    public TextField newBookTitle;
    public TextField newAuthorName;
    public ListView<Book> bookList = new ListView<>();
    public Label TitleInfo;
    public Label AuthorInfo;
    public Label AvailabilityInfo;


    public void addNewBook(ActionEvent actionEvent) {
        Book temp = new Book(newBookTitle.getText(), newAuthorName.getText(), Boolean.TRUE);
        bookList.getItems().add(temp);
        newBookTitle.clear();
        newAuthorName.clear();
    }

    public void displayBook(MouseEvent mouseEvent) {
        Book temp;
        temp = bookList.getSelectionModel().getSelectedItem();
        TitleInfo.setText(temp.getBookName());
        AuthorInfo.setText(temp.getAuthor());
        if(temp.getAvailable()){
            AvailabilityInfo.setText("Available");
        }else{
            AvailabilityInfo.setText("Not Available");
        }


    }


    public void addBookToUser(ActionEvent actionEvent) {
        Book temp;
        temp = bookList.getSelectionModel().getSelectedItem();
        temp.setAvailable(false);

        /*
       String qu =  ("UPDATE MEMBER SET BOOKS=? WHERE USERNAME =?");

*/

    }

}
