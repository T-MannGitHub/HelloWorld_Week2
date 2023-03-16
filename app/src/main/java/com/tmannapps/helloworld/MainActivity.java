package com.tmannapps.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    EditText myEditText;
    TextView myTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = findViewById(R.id.myTextView);
        myEditText = findViewById(R.id.myEditText);




        // connect variable to button

        myButton = findViewById(R.id.myButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputValue = myEditText.getText().toString();
                myTextView.setText("Welcome to SIT 708 "+inputValue + "!");

                Toast.makeText(MainActivity.this, "Hello World", Toast.LENGTH_SHORT).show();
            }
        });

    }
}