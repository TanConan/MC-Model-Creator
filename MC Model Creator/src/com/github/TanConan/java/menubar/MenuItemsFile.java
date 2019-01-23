package com.github.TanConan.java.menubar;

import java.util.ArrayList;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;

public class MenuItemsFile {

	static void addMenuItemsFile(Menu menu) {

		// Create Array-list for Menu-items
		ArrayList<MenuItem> menuItemsFile = new ArrayList<>();

		// Create Menu-item "New", add Event and add to List
		MenuItem menuItemNew = new MenuItem("New");
		menuItemNew.setOnAction(event -> {
			menuItemNewEvent();
		});
		menuItemsFile.add(menuItemNew);
		
		// Add Separator
		menuItemsFile.add(new SeparatorMenuItem());

		// Create Menu-item "Save", add Event and add to List
		MenuItem menuItemSave = new MenuItem("Save");
		menuItemSave.setOnAction(event -> {
			menuItemSaveEvent();
		});
		menuItemsFile.add(menuItemSave);

		// Create Menu-item "Save As...", add Event and add to List
		MenuItem menuItemSaveAs = new MenuItem("Save As...");
		menuItemSaveAs.setOnAction(event -> {
			menuItemSaveAsEvent();
		});
		menuItemsFile.add(menuItemSaveAs);
		
		// Add Separator
		menuItemsFile.add(new SeparatorMenuItem());
		
		// Create Menu-item "Import", add Event and add to List
		MenuItem menuItemImport = new MenuItem("Import...");
		menuItemImport.setOnAction(event -> {
			menuItemImportEvent();
		});
		menuItemsFile.add(menuItemImport);
		
		// Create Menu-item "Export", add Event and add to List
		MenuItem menuItemExport = new MenuItem("Export...");
		menuItemExport.setOnAction(event -> {
			menuItemExportEvent();
		});
		menuItemsFile.add(menuItemExport);
		
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

	private static void menuItemSaveEvent() {
		// TODO Auto-generated method stub
		System.out.println("Save");
	}

	private static void menuItemSaveAsEvent() {
		// TODO Auto-generated method stub
		System.out.println("Save As...");
	}
	
	private static void menuItemImportEvent() {
		// TODO Auto-generated method stub
		System.out.println("Import...");
	}
	
	private static void menuItemExportEvent() {
		// TODO Auto-generated method stub
		System.out.println("Export...");
	}
}
