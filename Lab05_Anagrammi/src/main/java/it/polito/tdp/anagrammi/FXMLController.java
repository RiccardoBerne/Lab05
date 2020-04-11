/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.anagrammi;

import java.net.URL;

import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	private model model;

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="txtInput"
	private TextField txtInput; // Value injected by FXMLLoader

	@FXML // fx:id="btnCerca"
	private Button btnCerca; // Value injected by FXMLLoader

	@FXML // fx:id="txtOutputCorretto"
	private TextArea txtOutputCorretto; // Value injected by FXMLLoader

	@FXML // fx:id="txtOutputErrato"
	private TextArea txtOutputErrato; // Value injected by FXMLLoader

	@FXML // fx:id="btnClear"
	private Button btnClear; // Value injected by FXMLLoader

	@FXML
	void doCerca(ActionEvent event) {
		txtOutputCorretto.setDisable(false);
		 txtOutputErrato.setDisable(false);
		String parola = txtInput.getText().toLowerCase();
		if(parola.isBlank() || parola.isEmpty()) {
			txtOutputCorretto.setText("Devi inserire una parola");
			txtOutputErrato.setDisable(true);
			return;
		}
		if(!parola.matches("[a-zA-Z]+")) {
			txtOutputCorretto.setText("Devi inserire una parola di caratteri");
			txtOutputErrato.setDisable(true);
			return;
		}
		// txtOutputCorretto.setText(parola);
		 for(String p: model.ricerca(parola)) {
        	 if(model.isAnagramma(p)==true) {
        		txtOutputCorretto.appendText(p + "\n"); 
        	 }else {
        		 txtOutputErrato.appendText(p + "\n");
        	 }
        	  
          }
	}

	@FXML
	void doClear(ActionEvent event) {
		txtOutputCorretto.clear();
		txtOutputCorretto.setDisable(true);
		txtOutputErrato.clear();
		txtOutputErrato.setDisable(true);;
		txtInput.clear();
	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert txtInput != null : "fx:id=\"txtInput\" was not injected: check your FXML file 'Scene.fxml'.";
		assert btnCerca != null : "fx:id=\"btnCerca\" was not injected: check your FXML file 'Scene.fxml'.";
		assert txtOutputCorretto != null : "fx:id=\"txtOutputCorretto\" was not injected: check your FXML file 'Scene.fxml'.";
		assert txtOutputErrato != null : "fx:id=\"txtOutputErrato\" was not injected: check your FXML file 'Scene.fxml'.";
		assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Scene.fxml'.";

	}

	public void setModel(model model) {
		this.model = model;

	}
}
