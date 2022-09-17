package ort.techtown.sharecalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {

    private EditText edt_email;
    private EditText edt_pwd;
    private Button btn_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        edt_email = findViewById(R.id.edt_email);
        edt_pwd = findViewById(R.id.edt_pwd);

        btn_signup = (Button)findViewById(R.id.btn_signup);
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String memail = edt_email.getText().toString();
                String mpwd = edt_pwd.getText().toString();

            }
        });
    }

}