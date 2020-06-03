package entity;

import com.strategy.Strategy;

/**
 * The Entity class.
 *
 * @author Christian
 * @author Eliphaz
 * @version 1.0
 */
public abstract class Entity {
	
	/** The sprite of the entity */
	private Sprite sprite;
	/** The x position of the entity */
	private int positionX;
	/** The y position of the entity */
	private int positionY;
	/** The map on which the entity is */
	private Map map;
	/** The boolean that indicates if the entity if falling or not */
	private boolean isFallen;
	/** The strategy of the entity */
	private Strategy<?> strategy;
	
	/**
	 * The Entity's constructor 
	 * @param sprite the default sprite of the entity
	 * @param x the initial x of the entity
	 * @param y the initial y of the entity
	 */
	public Entity(final Sprite sprite, int x, int y) {
		this.setSprite(sprite);
		this.positionX = x;
		this.positionY = y;
	}
	
	public Entity() {
		
	}
	
	/**
	 * The setMap method.
	 * Defines the map on which the entity evolves.
	 * @param map the new map
	 */
	public void setMap(Map map) {
		this.map = map;
	}
	
	/**
	 * The getMap method.
	 * @return the map on which the entity evolves
	 */
	public Map getMap() {
		return this.map;
	}
	
	
	/**
	 * The setSprite method.
	 * @param sprite the sprite of the entity
	 */
	public final void setSprite(final Sprite sprite) {
        this.sprite = sprite;
    }
	
	
}
