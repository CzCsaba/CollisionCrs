package hu.unideb.inf.SFMCollisionCourse;


import hu.unideb.inf.SFMCollisionCourse.model.Connect;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class FXMLCamping {
    private Connect model;

    public void setModel(Connect model) {
        this.model = model;
    }

    @FXML
    private ComboBox<String> turautvonal;

    @FXML
    private ComboBox<String> campingek;

    @FXML
    private ComboBox<String> csomagok;

    @FXML
    public Label TuraAr;

    @FXML
    public Label CampingAr;

    @FXML
    public Label PackageAr;

}
