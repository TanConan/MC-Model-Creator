package com.github.TanConan.modeledit;

import java.util.ArrayList;

import com.github.TanConan.util.IncrementButton;
import com.github.TanConan.util.NumberTextField;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class EditTabs {
	
	static GridPane gPTransform = new GridPane();
	static ScrollPane sPTransform = new ScrollPane(gPTransform);
	
	static GridPane gPTexture = new GridPane();
	static ScrollPane sPTexture = new ScrollPane(gPTexture);
	
	public static GridPane getGridTransform() {
		
		return gPTransform;
	}
	
	public static GridPane getGridTexture() {
		
		return gPTexture;
	}
	
	public static void addTabs() {
		
		ArrayList<Tab> tabs = new ArrayList<>();
		
		Tab transform = new Tab("Transform");
		transform.setClosable(false);
		transform.setContent(sPTransform);
		addTransformContent();
		tabs.add(transform);
		
		Tab texture = new Tab("Texture");
		texture.setClosable(false);
		transform.setContent(sPTexture);
		addTextureContent();
		tabs.add(texture);
		
		for (Tab tab : tabs) {
		EditPane.getTabPane().getTabs().add(tab);
		}
	}
	
	private static void addTransformContent() {
		
		// Position X Number-field and Buttons
		NumberTextField tFX = new NumberTextField();
		tFX.setText("0");
		tFX.setPrefWidth(60);
		
		Button buttonXUp = new Button("/\\");
		buttonXUp.setOnAction(event -> {
			IncrementButton.increment(1.0, tFX);
		});
		
		Button buttonXDown = new Button("\\/");
		buttonXDown.setOnAction(event -> {
			IncrementButton.decrement(1.0, tFX);
		});
		
		// Position Y Number-field and Buttons
		NumberTextField tFY = new NumberTextField();
		tFY.setText("0");
		tFY.setPrefWidth(60);
		
		Button buttonYUp = new Button("/\\");
		buttonYUp.setOnAction(event -> {
			IncrementButton.increment(1.0, tFY);
		});
		
		Button buttonYDown = new Button("\\/");
		buttonYDown.setOnAction(event -> {
			IncrementButton.decrement(1.0, tFY);
		});
		
		// Position Z Number-field and Buttons
		NumberTextField tFZ = new NumberTextField();
		tFZ.setText("0");
		tFZ.setPrefWidth(60);
		
		Button buttonZUp = new Button("/\\");
		buttonZUp.setOnAction(event -> {
			IncrementButton.increment(1.0, tFZ);
		});
		
		Button buttonZDown = new Button("\\/");
		buttonZDown.setOnAction(event -> {
			IncrementButton.decrement(1.0, tFZ);
		});
		
		// Add Everything
		gPTexture.setPadding(new Insets(10, 10, 10, 10));
		gPTexture.add(new Text("Position:"), 0, 0);
		gPTexture.add(buttonXUp, 0, 1);
		gPTexture.add(buttonYUp, 1, 1);
		gPTexture.add(buttonZUp, 2, 1);
		gPTexture.add(tFX, 0, 2);
		gPTexture.add(tFY, 1, 2);
		gPTexture.add(tFZ, 2, 2);
		gPTexture.add(buttonXDown, 0, 3);
		gPTexture.add(buttonYDown, 1, 3);
		gPTexture.add(buttonZDown, 2, 3);
	}
	
	private static void addTextureContent() {
		
	}
}