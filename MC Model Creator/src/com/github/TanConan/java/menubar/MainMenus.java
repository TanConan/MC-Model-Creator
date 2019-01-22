package com.github.TanConan.java.menubar;

import java.util.ArrayList;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MainMenus {
	
	static void addMainMenus(MenuBar menuBar) {
		
		// Create Array-list for all menus
		ArrayList<Menu> mainMenus = new ArrayList<>();
		
		// Create and add menu "File" to Array-list
		Menu menuFile = new Menu("File");
		MenuItemsFile.addMenuItemsFile(menuFile);
		mainMenus.add(menuFile);
		
		/*
		 * Add new Menus here, like:
		 * 
		 * Menu menuFile = new Menu("File");
		 * menuFile.addMenuItemsFile();
		 * mainMenus.add(menuFile);
		 */
		
		// Add Menus to Menu-bar
		for (Menu menus : mainMenus) {
			
			menuBar.getMenus().add(menus);
		}	
	}
}
