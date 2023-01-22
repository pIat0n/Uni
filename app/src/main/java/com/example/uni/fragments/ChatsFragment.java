package com.example.uni.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;

import com.example.uni.databinding.FragmentChatsBinding;
import com.example.uni.utilities.AppDrawer;

import org.jetbrains.annotations.NotNull;

public class ChatsFragment extends Fragment {
    private FragmentChatsBinding fragmentChatsBinding;

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentChatsBinding = FragmentChatsBinding.inflate(getLayoutInflater());
        initFields();
        initFunc();
        setListeners();
        return fragmentChatsBinding.getRoot();
    }
    private void initFields(){

    }
    private void initFunc(){
        AppDrawer.create(this, fragmentChatsBinding);
    }
    private void setListeners(){
        fragmentChatsBinding.fragmentChatsToolbarButton.setOnClickListener(v -> {
            fragmentChatsBinding.fragmentChatsDrawerLayout.openDrawer(GravityCompat.START);
        });
    }
}