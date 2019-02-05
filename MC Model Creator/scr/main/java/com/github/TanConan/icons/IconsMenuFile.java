package com.github.TanConan.icons;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class IconsMenuFile {
	
	public ImageView getNew(double size) {
		
		Image icon = new Image(getClass().getClassLoader().getResourceAsStream("icons/file/Icon_File_New.png"));
		ImageView iconView = new ImageView(icon);
		iconView.setFitHeight(size);
		iconView.setFitWidth(size);
		return iconView;
	}
	
	public ImageView getSave(double size) {
		
		Image icon = new Image(getClass().getClassLoader().getResourceAsStream("icons/file/Icon_File_Save.png"));
		ImageView iconView = new ImageView(icon);
		iconView.setFitHeight(size);
		iconView.setFitWidth(size);
		return iconView;
	}
	
	public ImageView getSaveAs(double size) {
		
		Image icon = new Image(getClass().getClassLoader().getResourceAsStream("icons/file/Icon_File_SaveAs.png"));
		ImageView iconView = new ImageView(icon);
		iconView.setFitHeight(size);
		iconView.setFitWidth(size);
		return iconView;
	}
	
	public ImageView getImport(double size) {
		
		Image icon = new Image(getClass().getClassLoader().getResourceAsStream("icons/file/Icon_File_Import.png"));
		ImageView iconView = new ImageView(icon);
		iconView.setFitHeight(size);
		iconView.setFitWidth(size);
		return iconView;
	}
	
	public ImageView getExport(double size) {
		
		Image icon = new Image(getClass().getClassLoader().getResourceAsStream("icons/file/Icon_File_Export.png"));
		ImageView iconView = new ImageView(icon);
		iconView.setFitHeight(size);
		iconView.setFitWidth(size);
		return iconView;
	}
}
