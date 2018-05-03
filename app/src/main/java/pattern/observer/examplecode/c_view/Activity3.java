package pattern.observer.examplecode.c_view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import pattern.observer.examplecode.R;
import pattern.observer.examplecode.b_complementary_method.Observer;

public class Activity3 extends AppCompatActivity implements Observer {

    private TextView result;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        result = this.findViewById(R.id.result);
    }

    @Override
    public void update(boolean checked) {
        if (checked) {
            text = "ON";
        } else {
            text = "OFF";
        }
    }
}
