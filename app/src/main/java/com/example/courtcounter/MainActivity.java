package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView teamAScore;
    TextView teamBScore;
    Button plus1_TeamA;
    Button plus2_TeamA;
    Button plus3_TeamA;
    Button plus1_TeamB;
    Button plus2_TeamB;
    Button plus3_TeamB;
    Button reset;

    int scoreOfA = 0;
    int scoreOfB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamAScore = (TextView) findViewById(R.id.scoreA);
        teamBScore = (TextView) findViewById(R.id.scoreB);
        plus1_TeamA = (Button) findViewById(R.id.point1A);
        plus2_TeamA = (Button) findViewById(R.id.point2A);
        plus3_TeamA = (Button) findViewById(R.id.point3A);
        plus1_TeamB = (Button) findViewById(R.id.point1B);
        plus2_TeamB = (Button) findViewById(R.id.point2B);
        plus3_TeamB = (Button) findViewById(R.id.point3B);
        reset = (Button) findViewById(R.id.reset);

        plus1_TeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score =  1;
                increaseTeamAScore(score);
            }
        });

        plus2_TeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score = 2;
                increaseTeamAScore(score);
            }
        });

        plus3_TeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score  = 3;
                increaseTeamAScore(score);
            }
        });

        plus1_TeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score = 2;
                increaseTeamBScore(score);
            }
        });

        plus2_TeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score = 3;
                increaseTeamBScore(score);
            }
        });


        plus3_TeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score = 1;
                increaseTeamBScore(score);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreOfA = 0;
                scoreOfB = 0;
                teamAScore.setText(String.valueOf(scoreOfA));
                teamBScore.setText(String.valueOf(scoreOfB));
            }
        });

    }
    private void increaseTeamAScore(int score){
        scoreOfA += score;
        teamAScore.setText(String.valueOf(scoreOfA));
    }

    private void increaseTeamBScore(int score){
        scoreOfB += score;
        teamBScore.setText(String.valueOf(scoreOfB));
    }
}