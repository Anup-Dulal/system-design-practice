package observer_design_pattern;

import java.util.List;

public class YoutubeChannel implements Subject {

    private List<Observer> subscribers = new java.util.ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer subscriber : subscribers) {
            subscriber.notified(message);
        }
    }
    
}
