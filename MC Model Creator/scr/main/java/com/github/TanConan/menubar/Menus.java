package com.github.TanConan.menubar;

import java.util.ArrayList;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

public class Menus {
	
	static void addMainMenus(MenuBar menuBar) {
		
		// Create Array-list for all menus
		ArrayList<Menu> menus = new ArrayList<>();
		
		// Create and add menu "File" to Array-list
		Menu menuFile = new Menu("File");
		MenuItemsFile.addMenuItemsFile(menuFile);
		menus.add(menuFile);
		
		/*
		 * Add new Menus here, like:
		 * 
		 * Menu menuFile = new Menu("File");
		 * menuFile.addMenuItemsFile();
		 * mainMenus.add(menuFile);
		 */
		
		// Add Menus to Menu-bar
		for (Menu menu : menus) {
			
			menuBar.getMenus().add(menu);
		}	
	}
}
