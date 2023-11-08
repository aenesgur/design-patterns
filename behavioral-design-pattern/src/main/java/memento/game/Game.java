package memento.game;

//Originator class: Stores and restores game progress.
public class Game {
    private int level;
    private int score;

    public void playLevel(int level, int score) {
        this.level = level;
        this.score = score;
    }

    public void display() {
        System.out.println("Level: " + level + ", Score: " + score);
    }

    public GameMemento save() {
        return new GameMemento(level, score);
    }

    public void restore(GameMemento memento) {
        this.level = memento.getLevel();
        this.score = memento.getScore();
    }
}
