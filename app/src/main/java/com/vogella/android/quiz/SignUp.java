package com.vogella.android.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    EditText username, password, mobile, branch;
    Button submit;
    static String Username, Password, Mobile, Branch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        mobile = findViewById(R.id.mobile);
        branch = findViewById(R.id.branch);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Username = username.getText().toString();
                Password = password.getText().toString();
                Mobile = mobile.getText().toString();
                Branch = branch.getText().toString();
                Intent i = new Intent(SignUp.this, Login.class);
                startActivity(i);
            }
        });
    }
}
