package assignmentOne;
import stanford.karel.SuperKarel;

public class DonkeyKarel extends SuperKarel {
	
	public void run() {
			findBeeperInFloor();
			findEntryForUpperFloor();
	}

	/* karel starts looking for beepers in the level starting from entry position 
	 * 
	 * Pre-condition: There might be n possible beepers
	 * 
	 * Post-condition: All beepers are collected and an entry point to the next level is searched for.
	 */
	
	private void findBeeperInFloor() {
		while(frontIsClear()) {
			move();
			if (beepersPresent()) {
				pickBeeper();
			}
		}
		findEntryForUpperFloor();
	}
	
	/* karel goes to the 0th position collection beepers on the way, then goes back to findBeeperInFloor method.  
	 * 
	 * Pre-condition: There might be n possible beepers 
	 * 
	 * Post-condition: All beepers are collected and an entry point to the next level is searched for.
	 */
	
	private void resetStartPoint() {
		turnLeft(); 
		while (frontIsClear()) {
			move();
			if (beepersPresent()) {
				pickBeeper();
			}
		} 
		turnAround();
		findBeeperInFloor();
	}
	
	/* after collecting all beepers from the level karel searches for an entry point to next level  
	 * 
	 * Pre-condition: All reachable beepers have been collected in current level 
	 * 
	 * Post-condition: Karel finds a new level or stops at the last level.
	 */

	private void findEntryForUpperFloor() {
		turnAround();
		while (rightIsBlocked()) {
			if (frontIsClear()) {
			move();
		}}
		turnRight();
		move();
		resetStartPoint();
	}
	
}