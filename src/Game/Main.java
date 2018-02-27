package Game;

public class Main {
    public static void main(String[] args) {

        Game game = new Game("MC", 3);
        game.addPlayer(new Player("Mariusz", "Kowalski", 150));
        game.addPlayer(new Player("Mariusz", "Kow", 120));
        game.addPlayer(new Player("Mariusz", "Kowal", 80));

        String winner = game.winner();
        if(winner == null){
            System.out.println("Nikt nie wygrał");
        }else{
            System.out.println("Wygrywa: " + winner);
        }
    }
}
