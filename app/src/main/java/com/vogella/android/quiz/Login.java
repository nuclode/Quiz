package com.vogella.android.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText username, password;
    Button login;
    TextView newUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.loginButton);
        newUser = findViewById(R.id.newUser);

        newUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this, SignUp.class);
                startActivity(i);
            }
        });

        final Toast t = Toast.makeText(this, "Enter correct details", Toast.LENGTH_SHORT);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputUserName = username.getText().toString();
                String inputPassWord = password.getText().toString();
                if(inputUserName.equals(SignUp.Username) && inputPassWord.equals(SignUp.Password)) {
                    Intent i = new Intent(Login.this, Home.class);
                    startActivity(i);
                }
                else
                    t.show();
            }
        });
    }

}
