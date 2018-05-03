package pattern.observer.examplecode.a_AbstractStudent;

import pattern.observer.examplecode.b_complementary_method.Observer;

public interface Student {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
}
