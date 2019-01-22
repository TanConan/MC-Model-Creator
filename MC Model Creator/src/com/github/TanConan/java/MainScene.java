package com.github.TanConan.java;

import com.github.TanConan.java.menubar.MainMenuBar;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainScene {
	
	public static void start(Stage primaryStage) {
		
		// Create layout
		BorderPane layout = new BorderPane();
		
		// Create and add MainMenubar to Top of layout
		MainMenuBar.addMainMenuBar(layout);
		
		// Create scene
		Scene scene = new Scene(layout);
		
		// Add scene to stage and show stage
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
