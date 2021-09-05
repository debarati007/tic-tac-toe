package main.java.com.tictactoe.model;

public class Notifier {
    private Observer observer;

    public Notifier(Observer observer) {
        this.observer = observer;
    }
    public void broadcast(Player player){
        observer.notify(player);

    }
}
