package com.example.ppratibha16.sagy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Introduction extends AppCompatActivity {
    Button b;
    TextView t1, t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        b = (Button) findViewById(R.id.button2);
        t1 = (TextView) findViewById(R.id.textView);
        t2 = (TextView) findViewById(R.id.textView3);
        t1.setText("What is the app all about?");
        t2.setText("The SAGY app aims at providing all the relevant details about the developments taking place under the respective adopted villages by the Hon'ble MP's to turn them into an adarsh gram(ideal village).");
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Introduction.this, Login.class);
                startActivity(intent);

            }
        });

    }
}

