package com.example.uni.utilities;

import androidx.appcompat.app.AppCompatActivity;

import com.example.uni.R;
import com.example.uni.fragments.ChatsFragment;

public class SetInitialFragment {
    public static void set(AppCompatActivity mainActivity){
        mainActivity
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.activityMain_fragmentContainerView, new ChatsFragment())
                .commit();
    }
}
