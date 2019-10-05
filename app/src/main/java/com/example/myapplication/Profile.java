package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String firstN = extras.getString("firtsName");
        String lastN = extras.getString("lastName");

        TextView tv_first = (TextView) findViewById(R.id.tv_first_name);
        TextView tv_last = (TextView) findViewById(R.id.tv_last_name);

        tv_first.setText(firstN);
        tv_last.setText(lastN);

        Button b_back = (Button)findViewById(R.id.b_back);

        b_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(Profile.this,MainActivity.class);
                startActivity(backIntent);
            }
        });
    }
}
