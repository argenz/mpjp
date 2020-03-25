package ex;

import java.util.Arrays;
import java.util.Scanner;

public class SinkThem {
	static public final char SHIP = 'S';
	static public final char WRECK = 'W'; // UTENTE
	static public final char MISS = 'X'; // UTENTE
	static public final char EMPTY = '_';
	static public final char UNKNOWN = '?'; // UTENTE

	static public final int POINTS_FOR_SINK = 5;
	static public final int POINTS_FOR_MISS = 1;

	/** the battlefield */
	private char[][] board;

	/** ships on board */
	private int counter;

	/** current player score */
	private int points;

	/**
	 * Create the squared board game filled with EMPTY cells
	 * 
	 * @param dimension board size
	 */
	public SinkThem(int dimension) {
		board = new char[dimension][dimension]; // perchè non si mette this qua?

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = '_';
			}
		}

	}

	/**
	 * @return the current score
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * @return true if no more ships
	 */
	public boolean done() {
		return counter == 0;
	}

	/**
	 * The board is a square
	 * 
	 * @return board size
	 */
	public int getBoardSize() {
		return board.length;
	}

	/**
	 * A user representation for the board
	 * 
	 * Only MISS and WRECK should be shown
	 * 
	 * UNKWNOWN should hide EMPTY and SHIP
	 * 
	 * @return a string
	 */
	public String getBoard() {
		StringBuilder sb = new StringBuilder();

		// non toccare indici
		for (int i = 0; i <= board.length; i++) {
			sb.append(i + " ");
		}
		sb.append("\n");

		for (int i = 1; i <= board.length; i++) {
			sb.append(i + " ");

			for (int j = 0; j < board[i - 1].length; j++) {
				int elem = board[i - 1][j];
				if (elem == 'W') {
					sb.append('W');
				} else if (elem == 'M') {
					sb.append('M');
				} else if (elem == 'X') {
					sb.append('X'); 
				}
				else {
					sb.append('?');
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	/**
	 * Place a ship on the board
	 * 
	 * @param row
	 * @param col
	 * @return false if it can't be placed
	 */
	public boolean place(int row, int col) {
		// in case you want to add ships in middle of the game. place entra conditions
		// to ensure a ship is not added on top of a wreck.

		if ((row < board.length) && (col < board.length)) {
			board[row][col] = 'S';
			counter += 1;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Shoot to a cell
	 * 
	 * a miss would cost POINTS_FOR_MISS, a center would give POINTS_FOR_SINK
	 * 
	 * @param row
	 * @param col
	 * @return true for a sink
	 */
	public boolean shoot(int row, int col) {
		if ((row <= board.length) && (col <= board.length)) {
			if (board[row - 1][col - 1] == 'S') {
				board[row - 1][col - 1] = 'W';

				points += 5;
				counter -= 1;
				System.out.print("You got one!");
				return true;
			} else if (board[row - 1][col - 1] == 'W') {
				points -= 1;
				System.out.println("You already got this one. You wasted your shot.");
			}
			else {
				board[row - 1][col - 1] = 'X';
				points -= 1;
				System.out.print("You missed.");
			}
		}
		return false;

	}

	@Override
	public String toString() {
		return Arrays.deepToString(board);
	}

	/**
	 * Apply a simple strategy to the game
	 * 
	 * @param st the game
	 */
//	public static void shootAll(SinkThem st) {
//		for (int i = 0; i < st.getBoardSize(); i++) {
//			for (int j = 0; j < st.getBoardSize(); j++) {
//				System.out.println(st.getBoard());
//				if (st.shoot(i, j)) {
//					System.out.println("Hit!");
//					if (st.done()) {
//						// System.out.println("You win!");
//						return;
//					}
//				} else {
//					// System.out.println("Miss ...");
//				}
//			}
//		}
//	}

	public static void main(String[] args) {

		// Create the board size
		int boardSize;
	
		Scanner scanner = new Scanner(System.in);
		
		do{
		System.out.print("Choose the size of your board, it must be a small integer larger than 2: ");
		System.out.println();
		String boardSize2 = scanner.next();
		boardSize = Integer.parseInt(boardSize2);
	
		}while( boardSize <= 2 );

		SinkThem st = new SinkThem(boardSize);

		int numberOfShips = boardSize * 2; // the greater the board size the harder the game (

		while (st.counter != numberOfShips) {
			int x = (int) (Math.random() * (boardSize));
			int y = (int) (Math.random() * (boardSize));
			if (st.board[x][y] != 'S') {
				st.place(x, y);
			}
		}

		// Start Rounds

		while (!st.done()) {

			// show board

			System.out.println("You have " + st.counter + " shipts left to sink.");
			System.out.println();
			System.out.println(st.getBoard());

			// ask for input
			System.out.println("Pick the new row to shoot:  ");
			int row = scanner.nextInt();

			System.out.println("Pick the new colum to shoot:  ");
			int col = scanner.nextInt();

			st.shoot(row, col);

			System.out.println("Your score: " + st.getPoints());

		}
		scanner.close();

		System.out.println("You won!");

	}
}
