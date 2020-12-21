package ATP;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;

public class SecondW implements Initializable {

    @FXML
    public Label result;

    public static Label static_label;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        static_label= result;
    }
}
