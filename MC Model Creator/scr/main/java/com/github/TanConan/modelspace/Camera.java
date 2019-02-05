package com.github.TanConan.modelspace;

import javafx.scene.PerspectiveCamera;

public class Camera { 
	
	static void addCamera() {
		
		PerspectiveCamera camera = new PerspectiveCamera(true);
		
		camera.setNearClip(0.1);
		camera.setFarClip(10000.0);
		
		camera.setTranslateX(0);
		camera.setTranslateY(0);
		camera.setTranslateZ(-500);
		
		ModelPane.getRoot().getChildren().add(camera);
		ModelPane.getSubScene().setCamera(camera);
	}
}
