package com.github.TanConan.util;

public class IncrementButton {
	
	public static void increment(double x, NumberTextField textField) {
		
		double value = Double.parseDouble(textField.textProperty().getValue().toString());
		value += x;
		textField.setText(String.valueOf(value));
	}
	
	public static void decrement(double x, NumberTextField textField) {
		
		double value = Double.parseDouble(textField.textProperty().getValue().toString());
		value -= x;
		textField.setText(String.valueOf(value));
	}
}