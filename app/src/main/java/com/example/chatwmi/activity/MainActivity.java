package com.example.chatwmi.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.chatwmi.R;
import com.example.chatwmi.fragment.Chat;
import com.example.chatwmi.fragment.Home;
import com.example.chatwmi.fragment.Profile;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    Button btn_Home, btn_Chat, btn_Profile, btn_Exit;

    Home fragmentHome;
    Chat fragmentChat;
    Profile fragmentProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Home    = findViewById(R.id.btnHome);
        btn_Chat    = findViewById(R.id.btnChat);
        btn_Profile = findViewById(R.id.btnProfile);
        btn_Exit    = findViewById(R.id.btnExit);

        btn_Home.setOnClickListener(this);
        btn_Chat.setOnClickListener(this);
        btn_Profile.setOnClickListener(this);
        btn_Exit.setOnClickListener(this);
    }

    void menuHome(){
        fragmentHome = new Home();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentHome);
        ft.commit();
    }

    void menuChat(){
        fragmentChat = new Chat();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentChat);
        ft.commit();
    }

    void menuProfile(){
        fragmentProfile = new Profile();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentProfile);
        ft.commit();
    }

    void menuExit(){
        finish();
    }

    @Override
    public void onClick(View v) {
        if (v == btn_Home){
            menuHome();
        }

        if (v == btn_Chat){
            menuChat();
        }

        if (v == btn_Profile){
            menuProfile();
        }

        if (v == btn_Exit){
            menuExit();
        }

    }
}