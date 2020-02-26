package com.example.chelimoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText message = (EditText) findViewById(R.id.message);
        Toast.makeText(this, "sending message" + message.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}