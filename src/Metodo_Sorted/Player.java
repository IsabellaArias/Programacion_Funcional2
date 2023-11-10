package Metodo_Sorted;

public class Player {
    private String name;
    private int points;
    private int rank;

    public Player(String name, int points, int rank) {
        this.name = name;
        this.points = points;
        this.rank = rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getRank() {
        return rank;
    }
}
