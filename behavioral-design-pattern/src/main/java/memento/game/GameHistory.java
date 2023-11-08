package memento.game;

import java.util.ArrayList;
import java.util.List;

// Caretaker class: Stores and manages game progress mementos.
public class GameHistory {
    private List<GameMemento> mementos = new ArrayList<>();

    public void saveMemento(GameMemento memento) {
        mementos.add(memento);
    }

    public GameMemento getMemento(int index) {
        return mementos.get(index);
    }
}
