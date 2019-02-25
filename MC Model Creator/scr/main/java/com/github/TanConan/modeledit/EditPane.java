package com.github.TanConan.modeledit;

import javafx.scene.control.ScrollPane;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class EditPane {
	
	static BorderPane editPane = new BorderPane();
	static VBox vBox = new VBox();
	static ScrollPane scrollPane = new ScrollPane(vBox);
	static TabPane tabPane = new TabPane();
	
	public static BorderPane getEditPane() {
		
		return editPane;
	}
	
	public static VBox getVBox() {
		
		return vBox;
	}
	
	public static ScrollPane getScrollPane() {
		
		return scrollPane;
	}
	
	public static TabPane getTabPane() {
		
		return tabPane;
	}
	
	public static void addEditPane(BorderPane layout, double minWidth, double minHeigt) {
		
		scrollPane.setMinWidth(minWidth);
		scrollPane.setMinHeight(minHeigt);

		tabPane.setMinWidth(minWidth);
		tabPane.getStyleClass().add("floating");
		tabPane.setStyle("-fx-background-color: silver");
		EditTabs.addTabs();
		
		editPane.setTop(scrollPane);
		editPane.setCenter(tabPane);
		layout.setRight(editPane);
	}
}