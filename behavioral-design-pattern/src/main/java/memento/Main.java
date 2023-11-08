package memento;

import memento.game.Game;
import memento.game.GameHistory;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        GameHistory history = new GameHistory();

        game.playLevel(1, 1000);
        game.display();

        history.saveMemento(game.save());

        game.playLevel(2, 2000);
        game.display();

        game.restore(history.getMemento(0));
        game.display();
    }
}
