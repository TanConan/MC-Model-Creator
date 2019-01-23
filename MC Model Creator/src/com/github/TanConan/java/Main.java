package com.github.TanConan.java;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		MainScene mainScene = new MainScene();
		mainScene.start(primaryStage);
	}
}
