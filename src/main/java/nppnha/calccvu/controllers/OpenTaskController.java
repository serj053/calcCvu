package nppnha.calccvu.controllers;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.fxml.Initializable;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class OpenTaskController {
    Application host;


    public OpenTaskController() {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.setInitialDirectory(new File("c:\\"));
 //     HostServices hostServices = host.getHostServices();
//        File file = fileChooser.showOpenDialog(new Stage());
//        if (file != null) {
//            hostServices.showDocument(file.getAbsolutePath());
//        }
    }

    public void setHost(Application host) {
        this.host = host;
    }
//
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//
//    }
}
