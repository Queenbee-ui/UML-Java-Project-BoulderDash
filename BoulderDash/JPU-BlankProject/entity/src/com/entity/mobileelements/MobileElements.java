package com.entity.mobileelements;

public class MobileElements {

	/**
	 * The loadImage method.
	 * Allows the entity to change sprite on the map depending on its movements.
	 * @param direction the direction of the entity
	 * @param entity the entity
	 */
	
	public void loadImage(char direction, Entity entity) {

		switch (direction) {

		case 'Z':
			entity.setSprite(entity.getSpriteUp());
			try {
				entity.getSprite().loadImage();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 'S':
			entity.setSprite(entity.getSpriteDown());
			try {
				entity.getSprite().loadImage();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 'Q':
			entity.setSprite(entity.getSpriteTurnLeft());
			try {
				entity.getSprite().loadImage();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 'D':
			entity.setSprite(entity.getSpriteTurnRight());
			try {
				entity.getSprite().loadImage();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 'X':
			entity.setSprite(entity.getSpriteDeath());
			try {
				entity.getSprite().loadImage();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
	}

	/**
	 * The incrementDiamondsCounter method.
	 * Increase by 1 the diamond counter of the entity.
	 */
	public void incrementDiamondsCounter() {
		this.diamondsCounter++;
	}
	
	/**
	 * The increaseDiamondsCounter method.
	 * @param increase the amount of increase of the counter.
	 */
	
	public void increaseDiamondsCounter(int increase) {
		this.diamondsCounter += increase;
	}

	/**
	 * The getDiamondsCounter methods.
	 * @return the number of diamonds the entity has
	 */
	
	public int getDiamondsCounter() {
		return this.diamondsCounter;
	}

	/**
	 * The getIsAlive method.
	 * @return the status of live of the entity (true = is living).
	 */
	public boolean getIsAlive() {
		return this.isAlive;
	}

	/**
	 * The setIsAlive method.
	 * @param isAlive define if the entity is still alive or not
	 */
	public void setIsAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	/**
	 * The getSpriteDeath method.
	 * @return the death sprite of mobile entities
	 */
	public Sprite getSpriteDeath() {
		return MobileElements.spriteDeath;
	}

}
