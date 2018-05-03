package pattern.observer.examplecode.a_AbstractStudent;


import pattern.observer.examplecode.b_Student.Student;

public abstract class Observer {
    protected Student student;
    public abstract void update();
}
