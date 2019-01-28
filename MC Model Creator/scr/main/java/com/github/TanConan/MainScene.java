package com.github.TanConan;

import com.github.TanConan.icons.Icons;
import com.github.TanConan.menubar.MainMenuBar;
import com.github.TanConan.util.Constants;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class MainScene {
	
	public static void start() {
		
		// Create layout
		BorderPane layout = new BorderPane();
		
		// Add MainMenubar
		MainMenuBar.addMenuBar(layout);
		
		// Create scene
		Scene scene = new Scene(layout, 1600, 900);
		
		// Set Stage-name
		MainApp.getStage().setTitle(Constants.MC_NAME + " " + Constants.MC_VERSION);
		
		// Set Stage-icon
		MainApp.getStage().getIcons().add(Icons.MAIN);
		
		// Add scene to stage and show stage
		MainApp.getStage().setScene(scene);
		MainApp.getStage().show();
	}
}
