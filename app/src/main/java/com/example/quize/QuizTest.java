package com.example.quize;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import static com.example.quize.QuestionList.getQuestion;

public class QuizTest extends AppCompatActivity {
    private int count;
    private int current;
    TextView textView_name;
    TextView progressText;
    ProgressBar progressBar;
    Button next;
    boolean click = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_page1);

        List<Question> questions = getQuestion();
         count = questions.size();
         current = 0;
        Intent intent = getIntent();
        textView_name = findViewById(R.id.outputName1);
        progressText = findViewById(R.id.progressText);

        String questionNum = intent.getStringExtra("questionNum");
        progressText.setText(questionNum + "/5");
        int numberCount = Integer.parseInt(questionNum);

        progressBar = findViewById(R.id.progressBar);

        TextView title = findViewById(R.id.question);
        TextView titleDetails = findViewById(R.id.questionDetails);
        Button button1 = findViewById(R.id.answerA);
        Button button2 = findViewById(R.id.answerB);
        Button button3 = findViewById(R.id.answerC);
        textView_name.setText("welcome!" + intent.getStringExtra("name"));
        String total = intent.getStringExtra("totally");

        switch (numberCount){
            case 1:
                progressBar.setProgress(numberCount);
                title.setText(questions.get(numberCount-1).getTitle());
                titleDetails.setText(questions.get(numberCount-1).getQuestion());
                button1.setText(questions.get(numberCount-1).getAnswerA());
                button2.setText(questions.get(numberCount-1).getAnswerB());
                button3.setText(questions.get(numberCount-1).getAnswerC());
                textView_name.setText("welcome!  " + intent.getStringExtra("name"));
                intent.putExtra("current",questions.get(numberCount-1).getAnswer());
                intent.putExtra("totally",intent.getStringExtra("totally"));
                String totally = intent.getStringExtra("totally");
                break;
            case 2:
                progressBar.setProgress(numberCount);
                title.setText(questions.get(numberCount-1).getTitle());
                titleDetails.setText(questions.get(numberCount-1).getQuestion());
                button1.setText(questions.get(numberCount-1).getAnswerA());
                button2.setText(questions.get(numberCount-1).getAnswerB());
                button3.setText(questions.get(numberCount-1).getAnswerC());
                textView_name.setText("welcome!  " + intent.getStringExtra("name"));
                intent.putExtra("totally",intent.getStringExtra("totally"));
                intent.putExtra("current",questions.get(numberCount-1).getAnswer());;
            case 3:
                progressBar.setProgress(numberCount);
                title.setText(questions.get(numberCount-1).getTitle());
                titleDetails.setText(questions.get(numberCount-1).getQuestion());
                button1.setText(questions.get(numberCount-1).getAnswerA());
                button2.setText(questions.get(numberCount-1).getAnswerB());
                button3.setText(questions.get(numberCount-1).getAnswerC());
                textView_name.setText("welcome!  " + intent.getStringExtra("name"));
                intent.putExtra("totally",intent.getStringExtra("totally"));
                intent.putExtra("current",questions.get(numberCount-1).getAnswer());
                break;
            case 4:
                progressBar.setProgress(numberCount);
                title.setText(questions.get(numberCount-1).getTitle());
                titleDetails.setText(questions.get(numberCount-1).getQuestion());
                button1.setText(questions.get(numberCount-1).getAnswerA());
                button2.setText(questions.get(numberCount-1).getAnswerB());
                button3.setText(questions.get(numberCount-1).getAnswerC());
                textView_name.setText("welcome!  " + intent.getStringExtra("name"));
                intent.putExtra("totally",intent.getStringExtra("totally"));
                intent.putExtra("current",questions.get(numberCount-1).getAnswer());
                break;
            case 5:
                progressBar.setProgress(numberCount);
                title.setText(questions.get(numberCount-1).getTitle());
                titleDetails.setText(questions.get(numberCount-1).getQuestion());
                button1.setText(questions.get(numberCount-1).getAnswerA());
                button2.setText(questions.get(numberCount-1).getAnswerB());
                button3.setText(questions.get(numberCount-1).getAnswerC());
                textView_name.setText("welcome!  " + intent.getStringExtra("name"));
                intent.putExtra("totally",intent.getStringExtra("totally"));
                intent.putExtra("current",questions.get(numberCount-1).getAnswer());
                break;
            case 6:
                Toast.makeText(this,"end quiz",Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void startQuiz(View view){
        Intent intent = getIntent();
        String questionNum = intent.getStringExtra("questionNum");

        if("5".equals(questionNum)){
            Intent intentFinally = new Intent(this,FinalQuiz.class);
            intentFinally.putExtra("name",intent.getStringExtra("name"));
            intentFinally.putExtra("totally",intent.getStringExtra("totally"));
            startActivity(intentFinally);
        }else {
            Intent intent1 = new Intent(this, QuizTest.class);
            Integer num = Integer.parseInt(questionNum)+1;
            intent1.putExtra("questionNum",num.toString());
            intent1.putExtra("name",intent.getStringExtra("name"));
            intent1.putExtra("totally",intent.getStringExtra("totally"));
            startActivity(intent1);
        }
    }

    public void buttonOne(View view){
        if(click){
            Button clicked = findViewById(R.id.answerA);
            checkAnswer(clicked);
        }
    }
    public void buttonTwo(View view){
        if(click){
            Button clicked = findViewById(R.id.answerB);
            checkAnswer(clicked);
        }
    }
    public void buttonThree(View view){
        if(click){
            Button clicked = findViewById(R.id.answerC);
            checkAnswer(clicked);
        }
    }

    private void checkAnswer(Button clicked) {
        Intent intent = getIntent();
        String currentAnswer = intent.getStringExtra("current");
        System.out.println(currentAnswer);
        if(currentAnswer.equals(clicked.getText().toString())){
            String totally = intent.getStringExtra("totally");
            int count = Integer.parseInt(totally);
            count++;
            intent.putExtra("totally",Integer.toString(count));
            String totally1 = intent.getStringExtra("totally");
            clicked.setBackgroundColor(Color.GREEN);
        }else {clicked.setBackgroundColor(Color.RED);}
        click = false;
    }


}
