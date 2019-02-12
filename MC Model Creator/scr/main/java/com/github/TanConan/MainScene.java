package com.github.TanConan;

import com.github.TanConan.icons.IconMainApp;
import com.github.TanConan.menubar.MainMenuBar;
import com.github.TanConan.modelspace.Block;
import com.github.TanConan.modelspace.ModelPane;
import com.github.TanConan.util.Constants;

import javafx.geometry.Point3D;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class MainScene {
	
	public static void start() {
		
		// Create layout
		BorderPane layout = new BorderPane();
		
		// Add main Menu-bar
		MainMenuBar.addMenuBar(layout);
		
		// Add Model-pane
		ModelPane.addModelPane(layout);
		
		Block.addBlock(0, 0, 0, 50, 50, 50, new Point3D(0, 0, 0), "test", Color.RED);
		Block.addBlock(0, 0, 0, 50, 50, 50, new Point3D(25, 0, 0), "test2", Color.BLUE);
		
		// Create Scene
		Scene scene = new Scene(layout);
		
		// Set Stage-name
		MainApp.getStage().setTitle(Constants.MC_NAME + " " + Constants.MC_VERSION);
		
		// Set Stage-icon
		MainApp.getStage().getIcons().add(new IconMainApp().getMainAppIcon());
		
		// Add scene to stage and show stage
		MainApp.getStage().setScene(scene);
		MainApp.getStage().show();
	}
}
