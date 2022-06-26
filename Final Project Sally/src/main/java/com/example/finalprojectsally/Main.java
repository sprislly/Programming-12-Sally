package com.example.finalprojectsally;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    Book moby = new Book("Moby Dick", "Moby Dick", Boolean.TRUE);
    Book war = new Book("War and Peace", "Moby Dick", Boolean.TRUE);
    Book hamlet = new Book("Hamlet", "William Shakespeare", Boolean.TRUE);
    Book gatsby = new Book("The Great Gatsby", "Moby Dick", Boolean.TRUE);
    Book ulysses = new Book("Ulysses", "Moby Dick", Boolean.TRUE);
    Book potter = new Book("Harry Potter and the Sorcerer's Stone", "Moby Dick", Boolean.TRUE);

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("sample.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}