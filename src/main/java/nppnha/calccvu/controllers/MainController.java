package nppnha.calccvu.controllers;

import javafx.event.ActionEvent;
import nppnha.calccvu.MainWindow;

public class MainController {

    public void itemNewTask(ActionEvent actionEvent) {
        MainWindow.setPane(0);
    }

    public void itemOpenTask(ActionEvent actionEvent) {
        MainWindow.setPane(1);
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