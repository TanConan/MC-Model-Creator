package com.github.TanConan.menubar;

import java.util.ArrayList;

import com.github.TanConan.MainApp;
import com.github.TanConan.modelspace.Block;

import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.shape.Box;
import javafx.scene.shape.DrawMode;

public class MenuItemsOptions {
	
	static void addMenuItems(Menu menu) {

		// Create Array-list for Menu-items
		ArrayList<MenuItem> menuItemsOptions = new ArrayList<>();

		// Create Menu-item "Always on Top", add Event and add to List
		CheckMenuItem alwaysOnTop = new CheckMenuItem("Always on Top");
		alwaysOnTop.setOnAction(event -> {
			alwaysOnTopEvent(alwaysOnTop);
		});
		menuItemsOptions.add(alwaysOnTop);
		
		// Create Menu-item "Wireframe", add Event and add to List
		CheckMenuItem wireframe = new CheckMenuItem("Wireframe");
		wireframe.setOnAction(event -> {
			wireframeEvent(wireframe);
		});
		menuItemsOptions.add(wireframe);
		
		/* 
		 * Add new Options Menu-Items here
		 * 
		 *  
		 */
		
		// Add Menu-Items to Menu
		for (MenuItem menuItems : menuItemsOptions) {

		menu.getItems().add(menuItems);
		}
	}

	private static void alwaysOnTopEvent(CheckMenuItem alwaysOnTop) {
		
		MainApp.getStage().setAlwaysOnTop(alwaysOnTop.isSelected());
	}
	
	private static void wireframeEvent(CheckMenuItem wireframe) {
		
		for (Box box : Block.getBlocks()) {
			if (wireframe.isSelected())
			box.setDrawMode(DrawMode.LINE);
			else {
			box.setDrawMode(DrawMode.FILL);
			}
		}
	}
}