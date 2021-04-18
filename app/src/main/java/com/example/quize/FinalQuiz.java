package com.example.quize;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FinalQuiz extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.resultpage);
        TextView userName = findViewById(R.id.outputName2);
        userName.setText("Congratulations!  " + intent.getStringExtra("name"));
        TextView finalScore = findViewById(R.id.finalScore);
        finalScore.setText(intent.getStringExtra("totally")+"/5");
    }
    public void newQuiz(View view){
        Intent intent = getIntent();
        Intent intentStart = new Intent(this,MainActivity.class);
        intentStart.putExtra("name",intent.getStringExtra("name"));
        startActivity(intentStart);
    }

    public void finish(View view){
        finishAffinity();
    }

}

