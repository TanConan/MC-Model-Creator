package com.github.TanConan;

import java.net.MalformedURLException;

import com.github.TanConan.menubar.MainMenuBar;
import com.github.TanConan.util.Constants;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainScene {
	
	public static void start(Stage primaryStage) throws MalformedURLException {
		
		// Create layout
		BorderPane layout = new BorderPane();
		
		// Create and add MainMenubar to Top of layout
		MainMenuBar.addMainMenuBar(layout);
		
		// Create scene
		Scene scene = new Scene(layout, 1600, 900);
		
		// Set Stage-name
		primaryStage.setTitle(Constants.MC_NAME + " " + Constants.MC_VERSION);
		
		// Set Stage-icon
		Image image = new Image(Constants.RESPATH_ICONS + "icon.png");
		primaryStage.getIcons().add(image);
		
		// Add scene to stage and show stage
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
