package com.example.tictactoe_byaish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    int player=1;
    boolean isWinner=false;
    int imageClicked=-1;
    int [][]winningState={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    int []gamesState={-1,-1,-1,-1,-1,-1,-1,-1,-1};
    public void load(View view)
    {

        ImageView v = (ImageView) view;
        int tag = Integer.parseInt(v.getTag().toString());
        imageClicked=gamesState[tag];
        if(isWinner==false && imageClicked==-1) {
        if (player == 1) {
            gamesState[tag] = player;
            Toast.makeText(this, tag + "" + "Cross", Toast.LENGTH_SHORT).show();
            v.setImageResource(R.drawable.cross);
            player = 0;
        } else {
            Toast.makeText(this, tag + "" + "Zero", Toast.LENGTH_SHORT).show();
            gamesState[tag] = player;
            v.setImageResource(R.drawable.zero);
            player = 1;
        }

        for (int i = 0; i < winningState.length; i++) {
            if (gamesState[winningState[i][0]] == gamesState[winningState[i][1]] && gamesState[winningState[i][1]] == gamesState[winningState[i][2]] && gamesState[winningState[i][2]] > -1) {
                Toast.makeText(this, "Winner is" + (player == 0 ? 1 : 0), Toast.LENGTH_SHORT).show();
                isWinner=true;

            }
        }
    }

    }

    public void restart(View view)
    {
        GridLayout gridLayout=findViewById(R.id.gridLayout);
        int total_images=gridLayout.getChildCount();
        for(int i=0;i<total_images;i++)
        {
            ImageView v= (ImageView) gridLayout.getChildAt(i);
            v.setImageDrawable(null);
        }
        isWinner=false;
        imageClicked=-1;
        Arrays.fill(gamesState, -1);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}