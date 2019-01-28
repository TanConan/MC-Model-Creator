package com.github.TanConan;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {
	
	// Create Stage reference
	private static Stage stage;
	
	// Getter for Stage
	public static Stage getStage() {
		
		return stage;
	}

	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		stage = primaryStage;
		MainScene.start();
	}
}
