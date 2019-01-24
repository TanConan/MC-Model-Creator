package com.github.TanConan;

import java.net.MalformedURLException;

import com.github.TanConan.icons.Icons;
import com.github.TanConan.menubar.MainMenuBar;
import com.github.TanConan.util.Constants;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainScene {
	
	public static void start(Stage primaryStage) throws MalformedURLException {
		
		// Create layout
		BorderPane layout = new BorderPane();
		
		// Add MainMenubar
		MainMenuBar.addMainMenuBar(layout);
		
		// Create scene
		Scene scene = new Scene(layout, 1600, 900);
		
		// Set Stage-name
		primaryStage.setTitle(Constants.MC_NAME + " " + Constants.MC_VERSION);
		
		// Set Stage-icon
		primaryStage.getIcons().add(Icons.MAIN);
		
		// Add scene to stage and show stage
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
