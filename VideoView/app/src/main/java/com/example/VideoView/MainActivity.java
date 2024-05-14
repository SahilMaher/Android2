package com.example.VideoView;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        VideoView videoView = findViewById(R.id.videoView);


        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.sample_video;

        Uri videoUri = Uri.parse(videoPath);

        videoView.setVideoURI(videoUri);

        MediaController mediaController = new MediaController(this);


        mediaController.setAnchorView(videoView);


        videoView.setMediaController(mediaController);


        videoView.start();
    }
}
