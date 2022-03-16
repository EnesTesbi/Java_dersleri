package application;
import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;

import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.TextField;

public class ders2controller {
	 @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private ChoiceBox<String> choice1;

	    @FXML
	    private Button choice_bnt_ekle;

	    @FXML
	    private Button choice_bnt_sil;

	    @FXML
	    private ComboBox<String> combo1;

	    @FXML
	    private Button combo_bnt_ekle;

	    @FXML
	    private Button combo_bnt_sil;
	    
	    @FXML
	    private TextField txt1;
	    

	    @FXML
	    private ListView<String> list1;

	    @FXML
	    void ChoiceSil(ActionEvent event) {
	    	choice1.getItems().remove(choice1.getSelectionModel().getSelectedIndex());
	    	choice1.getSelectionModel().selectNext();
//	    	choice1.getSelectionModel().selectPrevious();
//	    	choice1.getSelectionModel().selectLast();
//	    	choice1.getSelectionModel().selectFirst();
	    }

	    @FXML
	    void choiceEkle(ActionEvent event) {

	    	choice1.getItems().add(txt1.getText());
	    	choice1.getSelectionModel().selectLast();
	    }

	    @FXML
	    void comboEkle(ActionEvent event) {
	    	combo1.getItems().add(txt1.getText());
	    	combo1.getSelectionModel().selectLast();
	    }

	    @FXML
	    void comboSil(ActionEvent event) {
	    	combo1.getItems().remove(combo1.getSelectionModel().getSelectedIndex());
//	    	combo1.getItems().remove(combo1.getSelectionModel().getSelectedItem());
//	    	indis döndürür
	    }
	    @FXML
	    void initialize() {
	    	String[] dizi = {"Kahramanmaraþ","Antalya","Mersin","Antep"};
	    	ObservableList<String> cont = FXCollections.observableArrayList("Ýstanbul","Adýyaman");
//	    	arraylist gibidir obsrvablelist
	    	combo1.getItems().add("Adana");
	    	combo1.getItems().addAll("Hatay","Urfa","Ankara");
	    	combo1.getItems().addAll(dizi);
	    	choice1.getItems().addAll(dizi);
	    	combo1.getItems().add(2,"Muþ");
	    	choice1.getItems().addAll(cont);
//	    	combo1.setVisible(true); Görünürlük ayarý
//	    	combo1.setEditable(true); içeriðini deðiþtirme ayarý
//	    	list1.getSelectionModel().getSelectedItem();
	    	combo1.setEditable(true);
	    	list1.getItems().addAll(combo1.getItems());
	    	

	    }
}
