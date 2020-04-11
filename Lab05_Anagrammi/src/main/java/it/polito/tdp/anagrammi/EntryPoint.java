package it.polito.tdp.anagrammi;

import javafx.application.Application;
import static javafx.application.Application.launch;

import it.polito.tdp.anagrammi.model.model;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EntryPoint extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// Step 1: Importiamo il loader
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Scene.fxml"));
		// Step 2: il nodo dell'interfaccia grafica ci viene fornita dal loader
		Parent root = loader.load();
		Scene scene = new Scene(root);
		scene.getStylesheets().add("/styles/Styles.css");
		// Step 3: Creiamo un'istanza del controller
		model model = new model();
		// Steo 4: Creiamo il metodo controller e associamolo al model
		FXMLController controller = loader.getController();
		controller.setModel(model);
		

		stage.setTitle("JavaFX and Maven");
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * The main() method is ignored in correctly deployed JavaFX application. main()
	 * serves only as fallback in case the application can not be launched through
	 * deployment artifacts, e.g., in IDEs with limited FX support. NetBeans ignores
	 * main().
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
