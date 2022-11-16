package com.example.moderndashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CardView cardHome,cardSettings,cardChat,cardLogout,cardWidget, cardPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardHome = findViewById(R.id.cardHome);
        cardSettings = findViewById(R.id.cardSettings);
        cardChat = findViewById(R.id.cardchat);
        cardLogout = findViewById(R.id.cardLogout);
        cardWidget = findViewById(R.id.cardWidget);
        cardPerson = findViewById(R.id.cardPerson);

        cardHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastShow("Home Clicado");

            }
        });
        cardSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastShow("Settings Clicado");

            }
        });
        cardChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastShow("Chat Clicado");

            }
        });
        cardPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastShow("Profile Clicado");

            }
        });
        cardLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastShow("Logout Clicado");

            }
        });
        cardWidget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastShow("Home Clicado");

            }
        });
    }
    private void toastShow(String message){

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}