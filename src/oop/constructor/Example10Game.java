package oop.constructor;

public class Example10Game {
    private int id;
    private Example09Player player1;
    private Example09Player player2;

    public Example10Game(int id, Example09Player player1, Example09Player player2) {
        this.id = id;
        this.player1 = player1;
        this.player2 = player2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Example09Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Example09Player player1) {
        this.player1 = player1;
    }

    public Example09Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Example09Player player2) {
        this.player2 = player2;
    }

    @Override
    public String toString() {
        return "Example10Game{" +
                "id=" + id +
                ", player1=" + player1 +
                ", player2=" + player2 +
                '}';
    }
}
