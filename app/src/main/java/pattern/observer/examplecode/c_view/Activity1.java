package pattern.observer.examplecode.c_view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import pattern.observer.examplecode.R;
import pattern.observer.examplecode.b_complementary_method.Observer;

public class Activity1 extends AppCompatActivity implements Observer {

    private TextView result;
    private String text;

    private static Activity1 sInstance;

    public static synchronized Activity1 getInstance() {
        if (sInstance == null) {
            sInstance = new Activity1();
        }
        return sInstance;
    }

    @Override
    protected void onStart() {
        super.onStart();
        sInstance = this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        result = this.findViewById(R.id.result);
    }

    @Override
    public void update(boolean checked) {
        if (checked) {
            text = "ON";
            Log.i("TAG", text);
            result.setText(text);
        } else {
            text = "OFF";
            Log.i("TAG", text);
            result.setText(text);
        }
    }
}
