package com.example.concepcionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audio=MediaPlayer.create(this,R.raw.audio);
        audio.start();

        TimerTask inicioapp=new TimerTask() {
            @Override
            public void run() {

                Intent nuevaActividad=new Intent(MainActivity.this,Hone.class);
                startActivity(nuevaActividad);
            }
        };
        Timer tiempo =new Timer();
        tiempo.schedule(inicioapp,7000);
    }
}