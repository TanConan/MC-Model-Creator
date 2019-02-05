package com.github.TanConan.menubar;

import java.util.ArrayList;

import com.github.TanConan.icons.IconsMenuFile;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;

public class MenuItemsFile {

	static void addMenuItems(Menu menu) {

		// Create Array-list for Menu-items
		ArrayList<MenuItem> menuItemsFile = new ArrayList<>();
		
		IconsMenuFile icon = new IconsMenuFile();
		
		double iconSize = 26;

		// Create Menu-item "New", add Event, add Icon and add to List
		MenuItem miNew = new MenuItem("New");
		miNew.setOnAction(event -> {
			newEvent();
		});
		miNew.setGraphic(icon.getNew(iconSize));
		menuItemsFile.add(miNew);
		
		// Add Separator
		menuItemsFile.add(new SeparatorMenuItem());

		// Create Menu-item "Save", add Event, add Icon and add to List
		MenuItem miSave = new MenuItem("Save");
		miSave.setOnAction(event -> {
			saveEvent();
		});
		miSave.setGraphic(icon.getSave(iconSize));
		menuItemsFile.add(miSave);

		// Create Menu-item "Save As...", add Event, add Icon and add to List
		MenuItem miSaveAs = new MenuItem("Save As...");
		miSaveAs.setOnAction(event -> {
			saveAsEvent();
		});
		miSaveAs.setGraphic(icon.getSaveAs(iconSize));
		menuItemsFile.add(miSaveAs);
		
		// Add Separator
		menuItemsFile.add(new SeparatorMenuItem());
		
		// Create Menu-item "Import", add Event, add Icon and add to List
		MenuItem miImport = new MenuItem("Import...");
		miImport.setOnAction(event -> {
			importEvent();
		});
		miImport.setGraphic(icon.getImport(iconSize));
		menuItemsFile.add(miImport);
		
		// Create Menu-item "Export", add Event, add Icon and add to List
		MenuItem miExport = new MenuItem("Export...");
		miExport.setOnAction(event -> {
			exportEvent();
		});
		miExport.setGraphic(icon.getExport(iconSize));
		menuItemsFile.add(miExport);
		
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

	private static void newEvent() {
		// TODO Auto-generated method stub
		System.out.println("New");
	}

	private static void saveEvent() {
		// TODO Auto-generated method stub
		System.out.println("Save");
	}

	private static void saveAsEvent() {
		// TODO Auto-generated method stub
		System.out.println("Save As...");
	}
	
	private static void importEvent() {
		// TODO Auto-generated method stub
		System.out.println("Import...");
	}
	
	private static void exportEvent() {
		// TODO Auto-generated method stub
		System.out.println("Export...");
	}
}
