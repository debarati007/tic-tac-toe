package main.java.com.tictactoe;

import main.java.com.tictactoe.model.*;

import java.util.Arrays;
import java.util.List;


public class GameManager implements Observer {
    private Board board;
    private List<Player> playerList;
    private Player winningPlayer = null;

    public GameManager() {
        Player player1 = new Player("Subho", State.O);
        Player player2 = new Player("Debarati", State.X);
        playerList = Arrays.asList(player1, player2);
        Notifier notifier = new Notifier(this);
        board = new Board(notifier);
    }

    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        gameManager.start();
    }

    private void start() {
        System.out.println("game started");
        //continue the game while a player has not won the game
        int playerTurn = 0;
        while (winningPlayer==null) {
            Player player = playerList.get(playerTurn++ % 2);
            player.markInBoard(board);
        }
        System.out.println("winning player:"+winningPlayer);
    }

    @Override
    public void notify(Player player) {
        this.winningPlayer = player;
    }
}
