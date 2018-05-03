package pattern.observer.examplecode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pattern.observer.examplecode.b_Student.Student;
import pattern.observer.examplecode.c_view.Activity1;
import pattern.observer.examplecode.c_view.Activity2;
import pattern.observer.examplecode.c_view.Activity3;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnChanged, btnActivity1, btnActivity2, btnActivity3;

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
    }

    public static String VALUE = "Check";

    @Override
    public void onClick(View v) {
        // Validate Double Click
        switch (v.getId()) {
            case R.id.btnChanged:
                executeChanges();
                break;
            case R.id.btnActivity1:
                startActivity(new Intent(HomeActivity.this, Activity1.class));
                break;
            case R.id.btnActivity2:
                startActivity(new Intent(HomeActivity.this, Activity2.class));
                break;
            case R.id.btnActivity3:
                startActivity(new Intent(HomeActivity.this, Activity3.class));
                break;
        }
    }

    private void executeChanges() {
        Student student = new Student();
        student.setName("Nguyen Van Vuong");
        btnChanged.setText(student.getName());
    }
}
