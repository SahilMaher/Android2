package com.example.RadioGroup_With_ImageView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private ImageView imageViewFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        imageViewFlag = findViewById(R.id.imageViewFlag);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                switch (checkedId) {
                    case R.id.radioButtonCountry1:

                        imageViewFlag.setImageResource(R.drawable.india);
                        break;
                    case R.id.radioButtonCountry2:

                        imageViewFlag.setImageResource(R.drawable.japan);
                        break;
                    case R.id.radioButtonCountry3:

                        imageViewFlag.setImageResource(R.drawable.israel);
                        break;
                }
            }
        });
    }
}
