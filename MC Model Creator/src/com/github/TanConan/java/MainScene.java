package com.github.TanConan.java;

import java.io.File;
import java.net.MalformedURLException;

import com.github.TanConan.java.menubar.MainMenuBar;
import com.github.TanConan.java.util.Constants;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainScene {
	
	public void start(Stage primaryStage) throws MalformedURLException {
		
		// Create layout
		BorderPane layout = new BorderPane();
		
		// Create and add MainMenubar to Top of layout
		MainMenuBar.addMainMenuBar(layout);
		
		// Create scene
		Scene scene = new Scene(layout);
		
		// Set Stage-name
		primaryStage.setTitle(Constants.NAME + " " + Constants.VERSION);
		
		// Set Stage-icon
		Image image = new Image(new File("/MC Model Creator/src/com/github/TanConan/resources/icons/icon64x64.png").toURI().toURL().toString());
		primaryStage.getIcons().add(image);
		//TODO Icon
		
		// Add scene to stage and show stage
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
