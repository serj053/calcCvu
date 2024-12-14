module nppnha.calccvu {
    requires javafx.controls;
    requires javafx.fxml;


    opens nppnha.calccvu to javafx.fxml;
    exports nppnha.calccvu;
}