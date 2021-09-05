package main.java.com.tictactoe.model;

import java.util.Scanner;

public class Player {
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name;
    private State selectedState;

    public Player(String name, State selectedState) {
        this.name = name;
        this.selectedState = selectedState;
    }

    public void markInBoard(Board board) {
        int position=getPosition();
        board.markNewPosition(position,this);
    }

    private int getPosition() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter position for Player:"+this.name);
        int position= sc.nextInt();
        return position;
    }

    public char getSelectedState() {
        return selectedState.toString().charAt(0);
    }
}
