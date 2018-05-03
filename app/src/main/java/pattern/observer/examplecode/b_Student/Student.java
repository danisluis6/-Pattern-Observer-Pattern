package pattern.observer.examplecode.b_Student;

import java.util.ArrayList;
import java.util.List;

import pattern.observer.examplecode.a_AbstractStudent.Observer;


public class Student {
    private String name;
    private List<Observer> observers = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
