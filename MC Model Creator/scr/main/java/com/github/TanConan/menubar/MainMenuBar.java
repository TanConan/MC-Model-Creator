package com.github.TanConan.menubar;

import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;

public class MainMenuBar {

	public static void addMenuBar(BorderPane layout) {

		// Create menu bar
		MenuBar menuBar = new MenuBar();

		// Create and add menus to menu bar
		Menus.addMenus(menuBar);

		// Set Menu-bar to Top of Border-pane
		layout.setTop(menuBar);
	}
}
