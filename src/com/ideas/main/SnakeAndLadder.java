package com.ideas.main;

import java.util.HashMap;

import com.ideas.domain.Player;
import com.ideas.domain.Transporter;

public class SnakeAndLadder {
	Player player1 = null;
	Player player2 = null;
	HashMap<Integer, Transporter> transporterMap;
	int numberOfPositionsInBoard = 10 * 12;

	public static void main(String[] args) {

		int numberOfPlayer = 2;
		int numberOfSnake = 7;
		int numberOfLadder = 7;
		int numberOfPositionsInBoard = 10 * 12;
		System.out.println("------------------------------------------------------");
		System.out.println("| A new SnakeAndLadder game of board size 10 * 12 = " + numberOfPositionsInBoard +" |");
		System.out.println("| Two player are there in this game Player One and Player Two"+" |");
		System.out.println("| \t 1. snake head and tail are as \n| \t      { 31, 14 }, { 37, 17 }, { 73, 53 }, { 78, 39 }, { 92, 35 }, { 99, 7 }, { 98, 2 } "+" |");
		System.out.println("| \t 2. ladder start and end are as \n| \t    { 5, 25 }, { 10, 29 }, { 22, 41 }, { 28, 55 }, { 44, 95 }, { 70, 89 }, { 79, 81 } "+" |");
		SnakeAndLadder snakeAndLadder = new SnakeAndLadder();
		// snakeAndLadder.loadGame();
		// System.out.println(snakeAndLadder.rollDice());
		System.out.println("| A new game begin."+" |");
		System.out.println("------------------------------------------------------");
		snakeAndLadder.beginNewGame();

	}

	void loadGame() {
		// Position of snakes for eg. snake at 31 bites and fall to 14
		// String snakes = "31-14,37-17,73-53,78-39,92-35,99-7";

		// A map of transporter. All snaker and ladder key as startPoint, value
		// as Transporter object.

		int[][] snakes = { { 31, 14 }, { 37, 17 }, { 73, 53 }, { 78, 39 }, { 92, 35 }, { 99, 7 }, { 98, 2 } };
		int[][] ladders = { { 5, 25 }, { 10, 29 }, { 22, 41 }, { 28, 55 }, { 44, 95 }, { 70, 89 }, { 79, 81 } };
		transporterMap = new HashMap<Integer, Transporter>();
		for (int[] s : snakes) {
			Transporter transporter = new Transporter(s[0], s[1], "snake");
			transporterMap.put(s[0], transporter);
		}

		for (int[] ladder : ladders) {
			Transporter transporter = new Transporter(ladder[0], ladder[1], "ladder");
			transporterMap.put(ladder[0], transporter);
		}

//		System.out.println(transporterMap);

		player1 = new Player(0, "Player One");
		player2 = new Player(0, "Player Two");

		// Position of ladders for eg. Ladder at 5 takes to 25
	}

	// Is snake of a position
	// Is ladder of a position
	// getting a sanke tail position if snake bites.
	// Getting a ladder end top position if reached to a ladder.
	// rolling the dice. to get a number to move in board.

	/*
	 * A rolling dice will produce a number between 1 to 6.
	 */
	public int rollDice() {
		int i = 0;

		while (i == 0) {
			i = (int) (Math.random() * 100);
			i = i % 7;
		}
		return i;
	}

	public void beginNewGame() {
		loadGame();
		Player winner = null;
		Player player;
		int i = 0;
		while (winner == null) {
			if (i % 2 == 0) {

				player = player1;
			} else {
				player = player2;
			}
			int diceOutput = rollDice();
			System.out.println( player.getName() + " from current postion " + player.getPosition()
					+ " rolled dice and Output is:" + diceOutput);
			int aliasPosition = player.getPosition() + diceOutput;

			// Checking for transporter
			//System.out.println(transporterMap.get(aliasPosition));
			if (transporterMap.get(aliasPosition) != null) {
				Transporter transporter = transporterMap.get(aliasPosition);
				if("snake".equals(transporter.getTypeOfTransporter())){
					System.out.println(player.getName() + " got snake bite");
				}else if("ladder".equals(transporter.getTypeOfTransporter())){
					System.out.println(player.getName() + " got ladder");
				}
				player.setPosition(transporter.getEndPoint());
				
			} else {
				if (aliasPosition <= numberOfPositionsInBoard) {
					player.setPosition(aliasPosition);
				}
			}

			// Check player position for winner to be define.
			if (player.getPosition() == numberOfPositionsInBoard) {
				winner = player;
				System.out.println("!!! "+player.getName() +" won !!!");
			}
			System.out.println("");
			i++;

		}
	}
}
