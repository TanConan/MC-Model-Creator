package com.github.TanConan.java.menubar;

import java.util.ArrayList;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

public class MenuItemsFile {
	
	static void addMenuItemsFile(Menu menu) {
		
		// Create Array-list for Menu-items
		ArrayList<MenuItem> menuItemsFile = new ArrayList<>();
		
		// Create Menu-item "New", add Event and add to List
		MenuItem menuItemNew = new MenuItem("New");
		menuItemNew.setOnAction(event -> {menuItemNewEvent();});
		menuItemsFile.add(menuItemNew);
		
		/*
		 * Add new "File" menu Items here
		 * 
		 * 
		 */
		
		// Add Menu-Items to Menu
		for (MenuItem menuItems : menuItemsFile) {
			
			menu.getItems().add(menuItems);
		}
	}

	private static void menuItemNewEvent() {
		// TODO Auto-generated method stub
		System.out.println("New");
	}
}
