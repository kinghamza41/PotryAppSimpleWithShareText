package com.hamzatech.poetryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView firstLine, secondLine;
Button btnShare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstLine = findViewById(R.id.lineOne);
        secondLine = findViewById(R.id.lineTwo);
        btnShare = findViewById(R.id.shareBtn);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareFirstLine = firstLine.getText().toString();
                String sharesSecondLine = secondLine.getText().toString();
                String data = shareFirstLine + "/n" + sharesSecondLine;
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, data);

                startActivity(intent);
            }
        });
    }
}