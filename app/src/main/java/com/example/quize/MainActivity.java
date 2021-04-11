package com.example.quize;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent1 = getIntent();
        username = findViewById(R.id.Edittext);
        if(intent1.getStringExtra("name") != null){
            username.setText(intent1.getStringExtra("name"));
        }
        if(intent1.getStringExtra("finish") !=null){
            finish();
        }
    }

    public void startQuiz(View view){
        username = findViewById(R.id.Edittext);

        Intent intent = new Intent(this, QuizTest.class);
        intent.putExtra("name",username.getText().toString());
        intent.putExtra("questionNum","1");
        intent.putExtra("totally","0");
        startActivity(intent);

    }
}