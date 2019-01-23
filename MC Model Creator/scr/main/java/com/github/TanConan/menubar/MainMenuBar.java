package com.github.TanConan.menubar;

import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;

public class MainMenuBar {

	public static void addMainMenuBar(BorderPane layout) {

		// Create menu bar
		MenuBar menuBar = new MenuBar();

		// Create and add menus to menu bar
		Menus.addMainMenus(menuBar);

		// Set Menu-bar to Top of Border-pane
		layout.setTop(menuBar);
	}
}
