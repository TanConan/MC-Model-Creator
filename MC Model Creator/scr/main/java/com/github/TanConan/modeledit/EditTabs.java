package com.github.TanConan.modeledit;

import java.util.ArrayList;

import javafx.scene.control.Tab;

public class EditTabs {
	
	public static void addTabs() {
		
		ArrayList<Tab> tabs = new ArrayList<>();
		
		Tab transform = new Tab("Transform");
		transform.setClosable(false);
		tabs.add(transform);
		
		Tab texture = new Tab("Texture");
		texture.setClosable(false);
		tabs.add(texture);
		
		for (Tab tab : tabs) {
		EditPane.getEditPane().getTabs().add(tab);
		}
	}
}
