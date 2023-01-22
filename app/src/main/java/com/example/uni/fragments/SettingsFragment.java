package com.example.uni.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.uni.databinding.FragmentSettingsBinding;

import org.jetbrains.annotations.NotNull;


public class SettingsFragment extends Fragment {
    private FragmentSettingsBinding fragmentSettingsBinding;

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentSettingsBinding = FragmentSettingsBinding.inflate(getLayoutInflater());
        initFields();
        initFunc();
        setListeners();
        return fragmentSettingsBinding.getRoot();
    }
    private void initFields(){

    }
    private void initFunc(){

    }
    private void setListeners(){
        fragmentSettingsBinding.fragmentSettingsToolbarButton.setOnClickListener(v -> requireActivity().onBackPressed());
    }
}