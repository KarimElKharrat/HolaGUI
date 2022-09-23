package dad.holagui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HolaMundoFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label saludoLabel = new Label();
		saludoLabel.setText("Aqui saldrá el saludo.");
		saludoLabel.setLayoutX(20);
		saludoLabel.setLayoutY(20);
		
		Button saludoButton = new Button();
		saludoButton.setText("Saludar");
		saludoButton.setLayoutX(20);
		saludoButton.setLayoutY(80);
		saludoButton.setOnAction(event -> saludoLabel.setText("¡Hola Mundo!"));
		
		Pane rootPanel = new Pane();
		rootPanel.getChildren().addAll(saludoLabel, saludoButton);
		
		Scene scene = new Scene(rootPanel, 320, 200);
		
		primaryStage.setTitle("Hola Mundo en Java FX");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
