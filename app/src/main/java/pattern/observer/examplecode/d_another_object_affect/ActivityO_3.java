package pattern.observer.examplecode.d_another_object_affect;


import android.util.Log;

import pattern.observer.examplecode.a_AbstractStudent.Observer;
import pattern.observer.examplecode.b_Student.Student;

public class ActivityO_3 extends Observer {

    private Student student;

    public ActivityO_3(Student student){
        this.student = student;
        this.student.attach(this);
    }

    @Override
    public void update() {
        Log.i("TAG", "ActivityO_3 :"+this.student.getName());
    }
}