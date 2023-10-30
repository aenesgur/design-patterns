package observer;

import observer.observer.PremiumUser;
import observer.subject.NewsAgency;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        PremiumUser user1 = new PremiumUser("Alice");
        PremiumUser user2 = new PremiumUser("Bob");

        newsAgency.addObserver(user1);
        newsAgency.addObserver(user2);

        newsAgency.setNews("breaking news: news 1");

        newsAgency.removeObserver(user1);

        newsAgency.setNews("another breaking news: news 2");

    }
}
