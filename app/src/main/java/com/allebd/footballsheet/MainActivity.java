package com.allebd.footballsheet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int totalPointsForA = 0;
    int totalPointsForB = 0;
    int totalFoulForA = 0;
    int totalFoulForB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(totalPointsForA);
        displayForTeamB(totalPointsForB);
        displayFoulTeamA(totalFoulForA);
        displayFoulTeamB(totalFoulForB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulTeamA(int foul){
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(foul));
    }

    public void goalA(View view){
        totalPointsForA = totalPointsForA + 1;
        displayForTeamA(totalPointsForA);
    }

    public void foulA(View view){
        totalFoulForA = totalFoulForA + 1;
        displayFoulTeamA(totalFoulForA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulTeamB(int foul){
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(foul));
    }

    public void goalB(View view){
        totalPointsForB = totalPointsForB + 1;
        displayForTeamB(totalPointsForB);
    }

    public void foulB(View view){
        totalFoulForB = totalFoulForB + 1;
        displayFoulTeamB(totalFoulForB);
    }

    public void resetScore(View view){
        totalPointsForB = 0;
        totalPointsForA = 0;
        totalFoulForA = 0;
        totalFoulForB = 0;
        displayForTeamB(totalPointsForB);
        displayForTeamA(totalPointsForA);
        displayFoulTeamA(totalFoulForA);
        displayFoulTeamB(totalFoulForB);
    }
}
