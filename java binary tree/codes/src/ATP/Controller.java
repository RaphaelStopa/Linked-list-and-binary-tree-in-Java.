package ATP;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import java.io.File;
import static ATP.linked_list.insertList;
import javafx.scene.control.Label;

public class Controller extends SecondW implements Initializable {

    public TextField field;
    public TextField wordsB;

    public Label fields;

    String dir = "";

    /*evento, botão de busca de diretório*/
    @FXML
    public void busD(ActionEvent event) {
        final DirectoryChooser dirChooser = new DirectoryChooser();

        File file = dirChooser.showDialog(null);
        if (file !=null) {
            dir = file.getAbsolutePath();
            field.setText(dir);
        }
    }

    @FXML
    public void busD1(ActionEvent event) {
    }

    public void ajuts(ActionEvent event) {

    }

    public void eventWords(ActionEvent event) {
    }

    public void busP(ActionEvent event) {

        if (field.getText().trim().isEmpty() || wordsB.getText().trim().isEmpty() ) {

            fields.setText("Operation cannot be completed. Fill in the fields.");

        }else {
            fields.setText("");
            BinaryTree tree = new BinaryTree();
            File directory = new File(field.getText());
            File files[] = directory.listFiles();
            String [] arrayString  = wordsB.getText().split(" ");

            for(int i=0;i<arrayString.length;i++){

                linked_list linkedList = new linked_list();
                insertList(linkedList, directory, files, arrayString[i]);
                Node node = new Node(linkedList, arrayString[i]);
                tree.insert(node);

            }
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("secondW.fxml"));
                Parent root = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setTitle("Search result");
                stage.setScene(new Scene(root));

                stage.show();

                static_label.setText(tree.toString());

            }catch (Exception e) {
                System.out.println("The window cannot be displayed");
            }
        }
    }
}
