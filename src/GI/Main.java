package GI;

import functions.InappropriateFunctionPointException;
import GI.FXMLMainFormController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application{
    public static GI.TabulatedFunctionDoc tabFDoc;

    public static void main(String[] args) throws InappropriateFunctionPointException, IndexOutOfBoundsException, IOException, ClassNotFoundException, CloneNotSupportedException {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        tabFDoc = new GI.TabulatedFunctionDoc();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLMainForm.fxml"));
        Parent root = loader.load();
        FXMLMainFormController ctrl = loader.getController();
        ctrl.setStage(stage);
        tabFDoc.registerRedrawFunctionController(ctrl);
        Scene scene = new Scene(root);
        stage.setTitle("Tabulated function");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}
