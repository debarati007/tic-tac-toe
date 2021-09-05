package main.java.com.tictactoe.model;

public class Board {
    private char grid[][] = new char[3][3];
    private Notifier notifier;

    public Board(Notifier notifier) {
        this.notifier = notifier;
    }

    public void markNewPosition(int position, Player player) {
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                counter+=1;
                if (position == counter)
                    grid[i][j] = player.getSelectedState();
            }
        }
        if(checkIfWinningMove(player.getSelectedState())){
            notifier.broadcast(player);
        }
    }

    private boolean checkIfWinningMove(char move) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == move) {
                count++;
            }
        }
        if (count == 3)
            return true;
        return false;
    }
}
