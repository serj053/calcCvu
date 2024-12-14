module nppnha.calccvu {
    requires javafx.controls;
    requires javafx.fxml;


    opens nppnha.calccvu to javafx.fxml;
    exports nppnha.calccvu;
    exports nppnha.calccvu.controllers;
    opens nppnha.calccvu.controllers to javafx.fxml;
}