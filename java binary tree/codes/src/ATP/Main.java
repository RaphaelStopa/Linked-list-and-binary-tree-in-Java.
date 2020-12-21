package ATP;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;

import static ATP.linked_list.insertList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("ATP - Raphael Mendes Stopa");
        primaryStage.setScene(new Scene(root, 800, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

// This part serves only as an EXAMPLE of using lists and trees.
        
//        File directory = new File("C:\\Users\\Stopa\\Desktop\\periodo 4\\Métodos de Pesquisa e Ordenação em Estruturas de Dados\\teste\\");
//        File files[] = directory.listFiles();
//
//        linked_list linkedList = new linked_list();
//        linked_list linkedList2 = new linked_list();
//        String nha = "nha";
//        String gelo = "gelo";
//
//
//        insertList(linkedList, directory, files, nha);
//
//        insertList(linkedList2, directory, files, gelo);
//
//
//        Node node = new Node(linkedList, nha);
//        Node node2 = new Node(linkedList2, gelo);
//
//        BinaryTree arvore = new BinaryTree();
//
//        arvore.insert(node);
//        arvore.insert(node2);
//
//
//        arvore.SearchEngine("nha");
//
//        System.out.println(arvore.SearchEngine("nha"));

//        ArvoreBinaria.imprimirEmOrdem(node);
    }
}
