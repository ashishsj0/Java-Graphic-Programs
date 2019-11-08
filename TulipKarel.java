package assignmentOne;
import stanford.karel.*;

public class TulipKarel extends SuperKarel {
	
	public void run() {
	
		while (frontIsClear()) {
			karelGoDown();
			karelGoUp();
			}
	}

	/* karel starts going down to pick tulips 
	 * 
	 * Pre-condition: karel is starting from level 1 and going down
	 * 
	 * Post-condition: karel reaches the tulip on level 0 if it exists he picks it up.
	 */
	
	private void karelGoDown() {
		move();
		turnRight();
		move();
		if (beepersPresent()) {
		pickBeeper();
	}}

	/* karel starts going up 
	 * 
	 * Pre-condition: Karel may or may not have found tulip on level 0.
	 * 
	 * Post-condition: Karel reaches top and start moving towards next tulip.
	 */
	
	private void karelGoUp() {
		turnLeft();
		turnLeft();
		move();
		turnRight();
		if (frontIsClear()) { 
			move(); 
			}
	}
}