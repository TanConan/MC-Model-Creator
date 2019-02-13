package com.github.TanConan.modelspace;

import javafx.scene.Group;
import javafx.scene.SceneAntialiasing;
import javafx.scene.SubScene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

public class ModelPane {
	
	static Group root = new Group();

	static SubScene subScene = new SubScene(root, 0, 0, true, SceneAntialiasing.BALANCED);
	
	static StackPane subSceneHolder = new StackPane(subScene);
	

	static Group getRoot() {

		return root;
	}

	static SubScene getSubScene() {
		
		return subScene;
	}

	public static void addModelPane(BorderPane layout, double prefWidth, double prefHeight) {
		
		subSceneHolder.setPrefSize(prefWidth, prefHeight);
		layout.setCenter(subSceneHolder);
		subScene.heightProperty().bind(subSceneHolder.heightProperty());
		subScene.widthProperty().bind(subSceneHolder.widthProperty());
		subScene.setManaged(false);
		Camera.addCamera();
	}
}
