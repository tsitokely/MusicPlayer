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
    private Button mIncrease;
    private Button mDecrease;
    private MediaPlayer mediaplayer;
    private float volume = 0.5f;

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
        mIncrease = findViewById(R.id.increase_volume);
        mIncrease.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                volume = volume + 0.1f;
                mediaplayer.setVolume(volume, volume);

            }
        });
        mDecrease = findViewById(R.id.decrease_volume);
        mDecrease.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                volume = volume - 0.1f;
                mediaplayer.setVolume(volume, volume);

            }
        });
    }



}
