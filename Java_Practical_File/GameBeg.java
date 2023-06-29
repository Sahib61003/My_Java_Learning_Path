import java.util.Scanner;

public class GameBeg {
    private char[][] board;
    private char currentPlayer;

    public GameBeg() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean makeMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }

    private boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != '-' && board[0][j] == board[1][j] && board[0][j] == board[2][j]) {
                return true;
            }
        }
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return true;
        }
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return true;
        }
        return false;
    }
    private boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
    private void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
    public static void main(String[] args) {
        GameBeg game = new GameBeg();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Current board:");
            game.printBoard();

            System.out.println("Player " + game.currentPlayer + ", enter your move (row [0-2] and column [0-2]):");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (game.makeMove(row, col)) {
                if (game.checkWin()) {
                    System.out.println("Player " + game.currentPlayer + " wins!");
                    break;
                } else if (game.checkDraw()) {
                    System.out.println("It's a draw!");
                    break;
                } else {
                    game.switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
        scanner.close();
        System.out.println("Sahib Preet Singh 00713211621");
    } 
}

