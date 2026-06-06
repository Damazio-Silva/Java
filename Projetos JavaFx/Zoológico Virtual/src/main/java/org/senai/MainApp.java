package org.senai;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ZooController-view.fxml"));

        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("Senai - Gerenciamento de Alunos");
        //stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
