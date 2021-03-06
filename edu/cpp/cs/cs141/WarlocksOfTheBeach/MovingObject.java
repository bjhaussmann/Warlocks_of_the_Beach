package edu.cpp.cs.cs141.WarlocksOfTheBeach;

import java.io.Serializable;

/**
 * Has fields for x and y position and methods to return those values. There is
 * also a overall single integer field to represent the object's position. Has a
 * move method to change the x and y position based on the integer argument
 * given. Checks if Positions are near the edge before moving.
 * 
 * @author Cesar
 *
 */

public abstract class MovingObject implements Serializable {

	private static final long serialVersionUID = 5730821710669938689L;
	/**
	 * These are all of the fields mentioned above. The access modifiers chosen are important because we 
	 * want the game engine to know the single value position. The x and y position is only necessary for 
	 * the object itself to know.
	 */

	private int pXPosition;
	protected int pPosition;
	private int pYPosition;

	public MovingObject() {
	}
	/**
	 * The move
	 */
	public int mMove(int tMove) {

		if ((tMove == 0 && pPosition / 9 != 0) && ((pPosition != 19) || (pPosition != 22) || (pPosition != 25)
				|| (pPosition != 46) || (pPosition != 49) || (pPosition != 52) || (pPosition != 73) || (pPosition != 76)
				|| (pPosition != 79))) {
			pPosition = pPosition - 9;
			return 0;
		} else if ((tMove == 1 && pPosition % 9 != 8) && ((pPosition != 11) || (pPosition != 14) || (pPosition != 17)
				|| (pPosition != 38) || (pPosition != 41) || (pPosition != 44) || (pPosition != 65) || (pPosition != 68)
				|| (pPosition != 71))) {
			pPosition = pPosition + 1;
			return 0;
		} else if (tMove == 2 && pPosition / 9 != 8) {
			pPosition = pPosition + 9;
			return 0;
		} else if ((tMove == 3 && pPosition % 9 != 0)
				&& ((pPosition != 9) || (pPosition != 12) || (pPosition != 15) || (pPosition != 36) || (pPosition != 39)
						|| (pPosition != 42) || (pPosition != 63) || (pPosition != 66) || (pPosition != 70))) {
			pPosition = pPosition - 1;
			return 0;
		} else {
			return -1;
		}

	}
	/**
	 * The following methods are used to get and set the position values of the object. These will be useful
	 * for the Game Engine as well the Document Control classes. We will want to check the positions of the 
	 * player and ninja for many different actions in the game, hence why these methods are necessary.
	 * @return
	 */
	public int mGetPosition() {
		return pPosition;
	}

	public int mGetXPosition() {
		return pXPosition;
	}

	public int mGetYPosition() {
		return pYPosition;
	}

	public void mSetXPosition(int tXPosition) {
		pXPosition = tXPosition;
	}

	public void mSetYPosition(int tYPosition) {
		pYPosition = tYPosition;
	}

}
