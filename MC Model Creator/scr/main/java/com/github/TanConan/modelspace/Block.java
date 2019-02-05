package com.github.TanConan.modelspace;

import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;

public class Block {

	public static void addBlock(double x, double y, double z, double dx, double dy, double dz, String name) {

		Box box = new Box(dx, dy, dz);
		box.translateXProperty().set(x);
		box.translateYProperty().set(y);
		box.translateZProperty().set(z);
		box.setId(name);

		box.setMaterial(new PhongMaterial(Color.RED));
		ModelPane.getRoot().getChildren().add(box);
	}
}
