package com.github.TanConan.java.menubar;

import java.util.ArrayList;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MainMenus {
	
	public static void addMainMenus(MenuBar menuBar) {
		
		ArrayList<Menu> mainMenus = new ArrayList<>();
		
		// Create and add menu "File" to Array-list
		Menu menuFile = new Menu("File");
		mainMenus.add(menuFile);
		
		// Create and add menu items to menu "File"
		MenuItemsFile mif = new MenuItemsFile();
		for (MenuItem menuItem : mif.menuItemsFile) {
			
			menuFile.getItems().add(menuItem);
		}	
	}
}
