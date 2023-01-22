package com.example.uni.utilities;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Replace {
    public static void replaceActivity(AppCompatActivity currentActivity, AppCompatActivity newActivity, Boolean isFinish){
        Intent intent = new Intent(currentActivity, newActivity.getClass());
        if (isFinish){
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            currentActivity.startActivity(intent);
            currentActivity.finish();
        } else {
            currentActivity.startActivity(intent);
        }
    }
    public static void replaceFragment(Fragment currentFragment, Integer intContainer, Fragment newFragment, Boolean isBackStack){
        if (isBackStack){
            currentFragment
                    .getParentFragmentManager()
                    .beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .replace(intContainer, newFragment)
                    .addToBackStack(null)
                    .commit();
        } else {
            currentFragment
                    .getParentFragmentManager()
                    .beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .replace(intContainer, newFragment)
                    .commit();
        }
    }
}
