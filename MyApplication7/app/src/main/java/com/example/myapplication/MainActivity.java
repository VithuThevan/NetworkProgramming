package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText RC,BC,GC;
    private Button generate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RC = findViewById(R.id.Redcolour);
        BC = findViewById(R.id.Bluecolour);
        GC = findViewById(R.id.Greencolour);

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private boolean CheckALLFields(){
        if(RC.length()==0){
            RC.setError("Enter Red Colour");
            return false;
        }
        if(GC.length()==0){
            RC.setError("Enter Green Colour");
            return false;
        }
        if(BC.length()==0){
            RC.setError("Enter Blue Colour");
            return false;
        }
        return true;
    }

}