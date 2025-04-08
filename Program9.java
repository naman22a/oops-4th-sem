
import java.util.Scanner;

public class Program9 {

    final private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        playGame();
    }

    // Initialize the board with empty spaces
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Display the board
    public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    // Main game loop
    public static void playGame() {
        boolean gameEnded = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameEnded) {
            printBoard();
            System.out.println("Player " + currentPlayer + "'s turn.");

            int row, col;
            while (true) {
                System.out.print("Enter row (0, 1, 2): ");
                row = scanner.nextInt();
                System.out.print("Enter column (0, 1, 2): ");
                col = scanner.nextInt();

                if (row >= 0 && row < 3 && col >= 0 && col < 3) {
                    if (board[row][col] == ' ') {
                        board[row][col] = currentPlayer;
                        break;
                    } else {
                        System.out.println("Cell already taken. Try again.");
                    }
                } else {
                    System.out.println("Invalid input. Try again.");
                }
            }

            if (checkWin()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameEnded = true;
            } else if (checkDraw()) {
                printBoard();
                System.out.println("The game is a draw!");
                gameEnded = true;
            } else {
                // Switch player
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        scanner.close();
    }

    // Check if current player has won
    public static boolean checkWin() {
        // Check rows, columns, diagonals
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer
                    && board[i][1] == currentPlayer
                    && board[i][2] == currentPlayer) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (board[0][j] == currentPlayer
                    && board[1][j] == currentPlayer
                    && board[2][j] == currentPlayer) {
                return true;
            }
        }

        if (board[0][0] == currentPlayer
                && board[1][1] == currentPlayer
                && board[2][2] == currentPlayer) {
            return true;
        }

        if (board[0][2] == currentPlayer
                && board[1][1] == currentPlayer
                && board[2][0] == currentPlayer) {
            return true;
        }

        return false;
    }

    // Check for draw (no empty spaces left)
    public static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
