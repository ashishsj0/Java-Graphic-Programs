package assignmentOne;

import java.awt.*;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class wall extends GraphicsProgram {
	
	public void run() {
		
	
		for(int i = 0; i<=400; i+=100) {
			
			for(int j = 0; j<=200; j+=50) {
				
				add(createRectangle(i+100,j+50));
			}
		}
	}
	
	private GRect createRectangle(int pos1, int pos2) {
		GRect oneBrick = new GRect(100, 50,pos1,pos2);	
		return oneBrick;
	}
	
	
}