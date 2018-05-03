package pattern.observer.examplecode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import pattern.observer.examplecode.a_AbstractStudent.Student;
import pattern.observer.examplecode.b_complementary_method.Observer;
import pattern.observer.examplecode.c_view.Activity1;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener, Student{

    private Button btnChanged, btnActivity1, btnActivity2, btnActivity3;
    private List<Observer> observers;

    private Activity1 mActivity1;

    public HomeActivity() {
        observers = new ArrayList<>();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnChanged = this.findViewById(R.id.btnChanged);
        btnActivity1 = this.findViewById(R.id.btnActivity1);
        btnActivity2 = this.findViewById(R.id.btnActivity2);
        btnActivity3 = this.findViewById(R.id.btnActivity3);

        btnChanged.setOnClickListener(this);
        btnActivity1.setOnClickListener(this);
        btnActivity2.setOnClickListener(this);
        btnActivity3.setOnClickListener(this);

        mActivity1 = Activity1.getInstance();

        this.register(mActivity1);
    }

    public static boolean VALUE = true;

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnChanged:
                executeChanges();
                break;
            case R.id.btnActivity1:
                startActivity(new Intent(HomeActivity.this, Activity1.class));
                break;
        }
    }

    private void executeChanges() {
        btnChanged.setText("ON");
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (final Observer observer : observers) {
            observer.update(VALUE);
        }
    }
}
