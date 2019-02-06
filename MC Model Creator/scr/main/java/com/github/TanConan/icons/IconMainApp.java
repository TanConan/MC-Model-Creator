package com.github.TanConan.icons;

import javafx.scene.image.Image;

public class IconMainApp {
	
	public Image getMainAppIcon() {
		
		Image icon = new Image(getClass().getClassLoader().getResourceAsStream("icons/main/Icon.png"));

		return icon;
	}
}
