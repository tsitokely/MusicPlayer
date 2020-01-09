package com.example.android.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mPlay;
    private Button mPause;
    private MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaplayer = MediaPlayer.create(this,R.raw.song);

        mPlay = findViewById(R.id.play);
        mPlay.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast.makeText(MainActivity.this, "Playing Sound",
                        Toast.LENGTH_SHORT).show();
                mediaplayer.start();

            }
        });
        mPause = findViewById(R.id.pause);
        mPause.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast.makeText(MainActivity.this, "Pausing Sound",
                        Toast.LENGTH_SHORT).show();
                mediaplayer.pause();

            }
        });
    }



}
