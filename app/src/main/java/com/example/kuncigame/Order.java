package com.example.kuncigame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Order extends AppCompatActivity {
    TextView beli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        beli = (TextView) findViewById(R.id.beli);

        beli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(Order.this, Ucapan.class);
                startActivity(loginIntent);
            }
        });
    }
}