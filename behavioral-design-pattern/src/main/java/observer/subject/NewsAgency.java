package observer.subject;

import observer.observer.UserObserver;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<UserObserver> observers = new ArrayList<>();
    private String news;

    public void addObserver(UserObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(UserObserver observer) {
        observers.remove(observer);
    }

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    private void notifyObservers() {
        for (UserObserver observer : observers) {
            observer.update(news);
        }
    }
}
