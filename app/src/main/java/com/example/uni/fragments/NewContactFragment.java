package com.example.uni.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.uni.databinding.FragmentNewContactBinding;

import org.jetbrains.annotations.NotNull;


public class NewContactFragment extends Fragment {
   private FragmentNewContactBinding fragmentNewContactBinding;

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentNewContactBinding = FragmentNewContactBinding.inflate(getLayoutInflater());
        initFields();
        initFunc();
        setListeners();
        return fragmentNewContactBinding.getRoot();
    }
    private void initFields(){

    }
    private void initFunc(){

    }
    private void setListeners(){
        fragmentNewContactBinding.fragmentNewContactToolbarButton.setOnClickListener(v -> requireActivity().onBackPressed());
    }
}