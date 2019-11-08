package assignmentOne;

import java.awt.*;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class piano extends GraphicsProgram {
	
	public void run() {
		
		for(int i = 0 ; i <= 450; i += 50) {
			add(drawRectangle(Color.white),i,0);
		}
		for(int i = 0 ; i <= 400; i += 100) {
			add(drawRectangle(Color.black),i+25,0);
		}
	}
	
	private GRect drawRectangle(Color color) {
		
		GRect rectangle = new GRect(50,200);
		rectangle.setFilled(true);
		rectangle.setFillColor(color);
		
		if(color == Color.white) {
			return rectangle;
		} else {
			rectangle.setSize(50, 100);
			rectangle.sendToFront();
			return rectangle;
		}
	}
	
}