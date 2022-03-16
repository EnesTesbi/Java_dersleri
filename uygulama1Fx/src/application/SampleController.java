package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;


public class SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn1;

    @FXML
    private TextField txt1;

    @FXML
    private TextArea txt2;

    @FXML
    private ListView<String> list1;

    @FXML
    private ListView<String> list2;

    @FXML
    private Button btn2;
   

    @FXML
    void btn1click(ActionEvent event) {
    double x = Double.parseDouble(txt1.getText());
    double sonuc = x*x+4*x+4;;
    txt2.setText(String.valueOf(sonuc));
    list1.getItems().add(String.valueOf(x));
    list2.getItems().add(String.valueOf(String.valueOf(sonuc)));
    }

    @FXML
    void btn2click(ActionEvent event) {
    	list1.getItems().remove(list1.getSelectionModel().getSelectedIndex());
    	list2.getItems().remove(list1.getSelectionModel().getSelectedIndex()+1);

    }
    @FXML
    void initialize() {
      
    }

}
