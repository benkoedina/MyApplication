package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendButton = (Button) findViewById(R.id.sign_in);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firtsName = (EditText) findViewById(R.id.editText_firstN);
                EditText lastName = (EditText) findViewById(R.id.editText_lastN);
                Button sendButton = (Button) findViewById(R.id.sign_in);

                Intent intent = new Intent(MainActivity.this, Profile.class);
                String first = firtsName.getText().toString();
                String last = lastName.getText().toString();
                if(first.isEmpty() || last.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Fill out the blanks!", Toast.LENGTH_LONG).show();
                }
                else {
                    intent.putExtra("firtsName", first);
                    intent.putExtra("lastName", last);
                    startActivity(intent);
                }
            }
        });


    }


}
