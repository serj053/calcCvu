package nppnha.calccvu;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainWindow extends Application {
    private static List<AnchorPane> anchorPanes = new ArrayList<>();

    static BorderPane node;

    public static void setPane(int idWindow) {//выбираем окно из коллекции
        node.setCenter(anchorPanes.get(idWindow));
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainWindow.fxml")));


        anchorPanes.add(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("newTask.fxml"))));
        anchorPanes.add(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("openTask.fxml"))));
        anchorPanes.add(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("saveTask.fxml"))));
        anchorPanes.add(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("exportToCRM.fxml"))));
        anchorPanes.add(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("exportRequest.fxml"))));





        ObservableList<Node> nodes =root.getChildrenUnmodifiable();
        //выбираем узел в который должны вставляться окна
        node =(BorderPane) nodes.get(1);

        System.out.println(nodes);


        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}