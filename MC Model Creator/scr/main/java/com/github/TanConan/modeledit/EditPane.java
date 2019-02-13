package com.github.TanConan.modeledit;

import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;

public class EditPane {
	
	static TabPane tabPane = new TabPane();
	
	public static TabPane getEditPane() {
		
		return tabPane;
	}
	
	public static void addEditPane(BorderPane layout, double minWidth) {
		
		tabPane.setMinWidth(minWidth);
		tabPane.getStyleClass().add("floating");
		tabPane.setStyle("-fx-background-color: silver");
		layout.setRight(tabPane);
		EditTabs.addTabs();
	}
}
