package com.ideas.domain;

public class Player {
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

	public Player( int position, String name) {
		super();
		this.name = name;
		this.position = position;
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
