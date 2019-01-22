package com.github.TanConan.java.menubar;

import java.util.ArrayList;

import javafx.scene.control.MenuItem;

public class MenuItemsFile {
	
	// Create Array-list for File Menu-items
	ArrayList<MenuItem> menuItemsFile = new ArrayList<>();
	
	public MenuItemsFile() {
		
		MenuItem miNew = new MenuItem("New");
		miNew.setOnAction(event -> {
			System.out.println("Hello");
		});
		menuItemsFile.add(miNew);
	}

}
