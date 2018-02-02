package com.vogella.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Result extends AppCompatActivity {

    TextView language, name, correct, wrong, percent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        language = findViewById(R.id.language);
        name = findViewById(R.id.name);
        correct = findViewById(R.id.correct);
        wrong = findViewById(R.id.wrong);
        percent = findViewById(R.id.percent);

        int acc = QuestionView.acc;
        int wa = QuestionView.wa;
        double per = acc/5 * 100.00;

        language.setText(Home.language);
        name.setText(SignUp.Username);
        correct.setText("" + acc);
        wrong.setText("" + wa);
        percent.setText("" + per);

    }
}
