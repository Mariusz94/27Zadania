package Game;

public class Player {
    private String name;
    private String lastName;
    private int points;

    public Player(String name, String lastName, int points) {
        this.name = name;
        this.lastName = lastName;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String fullName() {
        return name + " " + lastName;
    }
}
