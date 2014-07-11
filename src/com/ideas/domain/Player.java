package com.ideas.domain;

/**
 * This class have Player details.
 * 
 * @author vk82286
 * 
 *
 */
public class Player {
	private int id;
	/**
	 * Full Name of the player.
	 */
	private String name;

	/**
	 * Position is current point on board of a player.
	 */
	private int position;

	public Player() {

	}

	public Player(int id, int position, String name) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", position=" + position + "]";
	}

}
