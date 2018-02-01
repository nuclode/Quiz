package com.vogella.android.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_view);

        Intent i = getIntent();
        String lang = i.getStringExtra("key");
        String arrQues[ 5];
        String quesOpt[ 20];
        String rightAns[ 5];
        if (lang.equals("C")) {
            arrQues = getResources().getStringArray(R.array.cQues);
            quesOpt = getResources().getStringArray(R.array.cOpt);
            rightAns = getResources().getStringArray(R.array.cRes);
        } else if (lang.equals("C++")) {
            arrQues = getResources().getStringArray(R.array.cppQues);
            quesOpt = getResources().getStringArray(R.array.cppOpt);
            rightAns = getResources().getStringArray(R.array.cppRes);
        }
        //else if(lang.equals("Java"))
        //else if(lang.equals("Python"))
        askQuestion(arrQues, quesOpt, rightAns);
    }

    public void askQuestion(String ques[], String opt[], final String res[]) {
        TextView question = findViewById(R.id.question);
        RadioButton opt1 = findViewById(R.id.opt1);
        RadioButton opt2 = findViewById(R.id.opt2);
        RadioButton opt3 = findViewById(R.id.opt3);
        RadioButton opt4 = findViewById(R.id.opt4);
        RadioButton none = findViewById(R.id.none);
        final RadioGroup options = findViewById(R.id.options);
        Button submit = findViewById(R.id.submit);
        Button skip = findViewById(R.id.skip);
        int i;
        for (i = 0; i < 5; ) {
            question.setText(ques[i]);
            opt1.setText(opt[4 * i]);
            opt2.setText(opt[4 * i + 1]);
            opt3.setText(opt[4 * i + 2]);
            opt4.setText(opt[4 * i + 3]);

            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int id = options.getCheckedRadioButtonId();
                    RadioButton selButton = findViewById(id);
                    if(selButton.getText().toString().equals("None"))
                        Toast.makeText(QuestionView.this, "Press skip button", Toast.LENGTH_SHORT).show();
                    else if(selButton.getText().toString().equals(res[i]));
                    Toast.makeText(QuestionView.this, "You made it", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(QuestionView.this, "Oops but you are wrong", Toast.LENGTH_SHORT).show();
                    i++;
                }

            });
        }
    }
}
