package pattern.observer.examplecode.a_AbstractStudent;

import pattern.observer.examplecode.b_complementary_method.Observer;

public interface Student {
    public void register(Observer observer);
    public void unregister(Observer observer);
    public void notifyObservers();
}
