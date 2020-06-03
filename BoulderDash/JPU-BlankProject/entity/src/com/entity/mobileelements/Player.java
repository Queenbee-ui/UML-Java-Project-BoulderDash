package com.entity.mobileelements;

import java.io.IOException;

import com.entity.motionlesselements.ExitDoor;
import com.entity.motionlesselements.Path;

import entity.Sprite;

/**
 * The Player class.
 *
 * @author Christian
 * @author Eliphaz
 * @version 1.0
 */

public class Player extends MobileElements {

	/** The basic sprite for the player */
	private static final Sprite spriteDown = new Sprite('y', "Rockford.png");
	/** The left sprite for the player */
	private static final Sprite spriteTurnLeft = new Sprite('y', "Left_Rockford.png");
	/** The right sprite for the player */
	private static final Sprite spriteTurnRight = new Sprite('y', "Right_Rockford.png");
	/** The up sprite for the player */
	private static final Sprite spriteUp = new Sprite('y', "Back_Rockford1.png");
	/** The boolean that indicates if the player won */
	private boolean isWin;

	static {
		try {
			spriteDown.loadImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * The player's constructor
	 * @param x the initial player's x
	 * @param y the initial player's y
	 */
	public Player(int x, int y) {
		super(spriteDown, x, y);
		this.isAlive = true;
		this.isWin = false;

	}

	/**
	 * The getSpriteDown method.
	 * @return Sprite the basic sprite of the player
	 */
	public Sprite getSpriteDown() {
		return spriteDown;
	}
	
	/**
	 * The getSpriteTurnLeft method.
	 * @return Sprite the left sprite of the player
	 */
	public Sprite getSpriteTurnLeft() {
		return spriteTurnLeft;
	}

	/**
	 * The getSpriteTurnRight method.
	 * @return Sprite the right sprite of the player
	 */
	public Sprite getSpriteTurnRight() {
		return spriteTurnRight;
	}

	/**
	 * The getSpriteUp method.
	 * @return Sprite the up sprite of the player
	 */
	public Sprite getSpriteUp() {
		return spriteUp;
	}

	/**
	 * The movePlayer method.
	 * Calls the MobileElements entityMove method.
	 * @param direction the direction the player wants to move, depending on the keyListener in the view
	 */
	public void movePlayer(char direction) {

		if(this.getIsAlive()) {
			switch (direction) {

			case 'Z':
				this.entityMove(0, -1, 0, direction);
				break;
			case 'Q':
				this.entityMove(-1, 0, -1, direction);
				break;
			case 'S':
				this.entityMove(0, +1, 0, direction);
				break;
			case 'D':
				this.entityMove(+1, 0, 1, direction);
				break;
			}
		}
	}
}
