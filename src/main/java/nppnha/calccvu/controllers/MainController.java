package nppnha.calccvu.controllers;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import nppnha.calccvu.MainWindow;

import java.io.File;

public class MainController {

    private Application host;

    public void setHost(Application host) {
        this.host = host;
    }

    public void itemNewTask(ActionEvent actionEvent) {
        MainWindow.setPane(0);
    }

    public void itemOpenTask(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.setInitialDirectory(new File("c:\\"));
        File file = fileChooser.showOpenDialog(new Stage());
        HostServices hostServices = host.getHostServices();
        if (file != null) {
            hostServices.showDocument(file.getAbsolutePath());
        }
    }

    public void itemSaveTask(ActionEvent actionEvent) {
        MainWindow.setPane(2);
    }

    public void itemExportToCRM(ActionEvent actionEvent) {
        MainWindow.setPane(3);
    }

    public void itemExportRequest(ActionEvent actionEvent) {
        MainWindow.setPane(4);
    }
}