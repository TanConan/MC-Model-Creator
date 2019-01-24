package com.github.TanConan.menubar;

import java.util.ArrayList;

import com.github.TanConan.icons.IconsMenuFile;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;

public class MenuItemsFile {

	static void addMenuItemsFile(Menu menu) {

		// Create Array-list for Menu-items
		ArrayList<MenuItem> menuItemsFile = new ArrayList<>();
		
		double iconSize = 26;

		// Create Menu-item "New", add Event, add Icon and add to List
		MenuItem menuItemNew = new MenuItem("New");
		menuItemNew.setOnAction(event -> {
			menuItemNewEvent();
		});
		menuItemNew.setGraphic(IconsMenuFile.getNew(iconSize));
		menuItemsFile.add(menuItemNew);
		
		// Add Separator
		menuItemsFile.add(new SeparatorMenuItem());

		// Create Menu-item "Save", add Event, add Icon and add to List
		MenuItem menuItemSave = new MenuItem("Save");
		menuItemSave.setOnAction(event -> {
			menuItemSaveEvent();
		});
		menuItemSave.setGraphic(IconsMenuFile.getSave(iconSize));
		menuItemsFile.add(menuItemSave);

		// Create Menu-item "Save As...", add Event, add Icon and add to List
		MenuItem menuItemSaveAs = new MenuItem("Save As...");
		menuItemSaveAs.setOnAction(event -> {
			menuItemSaveAsEvent();
		});
		menuItemSaveAs.setGraphic(IconsMenuFile.getSaveAs(iconSize));
		menuItemsFile.add(menuItemSaveAs);
		
		// Add Separator
		menuItemsFile.add(new SeparatorMenuItem());
		
		// Create Menu-item "Import", add Event, add Icon and add to List
		MenuItem menuItemImport = new MenuItem("Import...");
		menuItemImport.setOnAction(event -> {
			menuItemImportEvent();
		});
		menuItemImport.setGraphic(IconsMenuFile.getImport(iconSize));
		menuItemsFile.add(menuItemImport);
		
		// Create Menu-item "Export", add Event, add Icon and add to List
		MenuItem menuItemExport = new MenuItem("Export...");
		menuItemExport.setOnAction(event -> {
			menuItemExportEvent();
		});
		menuItemExport.setGraphic(IconsMenuFile.getExport(iconSize));
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
