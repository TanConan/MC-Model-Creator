package com.github.TanConan.modelspace;

import java.util.ArrayList;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.geometry.Point3D;
import javafx.scene.Cursor;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class Block {
	
	static ArrayList<Box> allBlocks = new ArrayList<>();

	public static void addBlock(double x, double y, double z, double dx, double dy, double dz, Point3D pivot, String name, Color color) {
		
		Box box = new Box(dx, dy, dz);
		Rotate xRotation = new Rotate(0, pivot.getX(), pivot.getY(), pivot.getZ(), Rotate.X_AXIS);
		Rotate yRotation = new Rotate(0, pivot.getX(), pivot.getY(), pivot.getZ(), Rotate.Y_AXIS);
		Rotate zRotation = new Rotate(0, pivot.getX(), pivot.getY(), pivot.getZ(), Rotate.Z_AXIS);
		box.getTransforms().addAll(xRotation, yRotation, zRotation);
		box.translateXProperty().set(x);
		box.translateYProperty().set(y);
		box.translateZProperty().set(z);

		box.setCursor(Cursor.HAND);
		box.setId(name);

		// test
		final Timeline rotationAnimation = new Timeline();
		rotationAnimation.getKeyFrames().add(new KeyFrame(Duration.seconds(10), new KeyValue(zRotation.angleProperty(), 360)));								   
		rotationAnimation.setCycleCount(Animation.INDEFINITE);
		rotationAnimation.play();
		// test

		box.setMaterial(new PhongMaterial(color));
		ModelPane.getRoot().getChildren().add(box);
		allBlocks.add(box);
	}
	
	public static ArrayList<Box> getBlocks() {
		return allBlocks;
	}
}
