package com.example.workoutlogger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mondayButton, tuesdayButton, wednesdayButton, thursdayButton, fridayButton, saturdayButton, sundayButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mondayButton=findViewById(R.id.mondayButton);
        tuesdayButton=findViewById(R.id.tuesdayButton);
        wednesdayButton=findViewById(R.id.wednesdayButton);
        thursdayButton=findViewById(R.id.thursdayButton);
        fridayButton=findViewById(R.id.fridayButton);
        saturdayButton=findViewById(R.id.saturdayButton);
        sundayButton=findViewById(R.id.sundayButton);

        mondayButton.setOnClickListener(this);
        tuesdayButton.setOnClickListener(this);
        wednesdayButton.setOnClickListener(this);
        thursdayButton.setOnClickListener(this);
        fridayButton.setOnClickListener(this);
        saturdayButton.setOnClickListener(this);
        sundayButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, mondayActivity.class);
        startActivity(intent);
    }
}