package com.example.lab4test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button WelcomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WelcomeButton = (Button)findViewById(R.id.welcomeBtn);


        WelcomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Let's Ready To Chat",Toast.LENGTH_SHORT);
                Intent it = new Intent(MainActivity.this,ChatRoomActivity.class);
                startActivity(it);
            }

        });

    }
}
