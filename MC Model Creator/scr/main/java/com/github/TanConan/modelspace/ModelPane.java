package com.github.TanConan.modelspace;

import javafx.scene.Group;
import javafx.scene.SceneAntialiasing;
import javafx.scene.SubScene;
import javafx.scene.layout.BorderPane;

public class ModelPane {
	
	static Group root = new Group();

	static SubScene subScene = new SubScene(root, 1600, 900, true, SceneAntialiasing.BALANCED);
	

	static Group getRoot() {

		return root;
	}

	static SubScene getSubScene() {
		
		return subScene;
	}

	public static void addModelPane(BorderPane layout) {

		layout.setCenter(subScene);
		Camera.addCamera();
	}
}
