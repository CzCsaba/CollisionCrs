package hu.unideb.inf.SFMCollisionCourse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLCamping.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("Camping-Zone");
        stage.setScene(scene);
        stage.show();
        stage.setMaximized(true);
    }
    /**
     * The main() method is ignored in correctly deployed JavaFX application.main() serves only as fallback in case the application can not be
     launched through deployment artifacts, e.g., in IDEs with limited FX
     support.
     * NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}

