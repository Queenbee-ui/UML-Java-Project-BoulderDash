package com.collisionshandler;

import com.entity.mobileelements.Diamond;
import com.entity.mobileelements.Enemy;
import com.entity.mobileelements.Player;
import com.entity.mobileelements.Stone;
import com.entity.motionlesselements.ExitDoor;
import com.entity.motionlesselements.Path;
import com.entity.motionlesselements.Walls;

import entity.Entity;

/**
 * The CollisionsHandler Class.
 *
 * @author Christian
 * @author Eliphaz
 * @version 1.0
 */

public class CollisionsHandler {


	/**
	 * CollisionsHandler constructor.
	 * No specific manipulations.
	 */
	public CollisionsHandler() {

	}

	/**
	 * The checkForCollisions method.
	 * @param entity the bidimensional array that contains the entity
	 * @param x the entity's x 
	 * @param y the entity's y
	 * @return a boolean that indicates if there is a collision or not.
	 */
	
	public boolean checkForCollisions(Entity[][] entity, int x, int y) {
		if (entity[x][y] instanceof Stone) {
			return true;
		} else if (entity[x][y] instanceof Walls) {
			return true;
		} else if (entity[x][y] instanceof ExitDoor) {
			return true;
		} else if (entity[x][y] instanceof Enemy) {
			return true;
		} else {
			return false;
		}
	}

}
