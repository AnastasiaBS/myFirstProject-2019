package lesson11_12;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        Croupier player1 = new Croupier();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        player1.setCroupier(true);


        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);
        game.addPlayer(player4);

        game.doFirstRound();
        game.printPlayersHands();
        game.doActionPlayers();
        game.doActionCroupier();

        game.printAllPlayersHands();
        game.printWinner();

    }
}
