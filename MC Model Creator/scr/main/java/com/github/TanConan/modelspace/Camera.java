package com.github.TanConan.modelspace;

import javafx.scene.PerspectiveCamera;

public class Camera {
	
	static PerspectiveCamera camera = new PerspectiveCamera(true);
	
	static void addCamera() {
		
		camera.setNearClip(0.1);
		camera.setFarClip(10000.0);
		
		camera.setTranslateX(0);
		camera.setTranslateY(0);
		camera.setTranslateZ(-500);
		
		ModelPane.getRoot().getChildren().add(camera);
		ModelPane.getSubScene().setCamera(camera);
	}
	
	public static PerspectiveCamera getCamera() {
		
		return camera;
	}
}