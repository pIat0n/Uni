package com.example.uni;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;

import com.example.uni.databinding.ActivityMainBinding;
import com.example.uni.utilities.SetInitialFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        setFragment();
    }
    private void setFragment(){
        SetInitialFragment.set(this);
    }

    @Override
    public void onBackPressed() {
        try {
            DrawerLayout drawerLayout = findViewById(R.id.fragmentChats_drawerLayout);
            if (drawerLayout.isDrawerOpen(GravityCompat.START)){
                drawerLayout.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        } catch (Exception exception){
            super.onBackPressed();
        }
    }
}