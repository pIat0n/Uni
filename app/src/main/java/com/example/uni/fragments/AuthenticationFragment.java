package com.example.uni.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.uni.databinding.FragmentAuthenticationBinding;

import org.jetbrains.annotations.NotNull;


public class AuthenticationFragment extends Fragment {
    private FragmentAuthenticationBinding fragmentAuthenticationBinding;

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentAuthenticationBinding = FragmentAuthenticationBinding.inflate(getLayoutInflater());
        initFields();
        initFunc();
        setListeners();
        return fragmentAuthenticationBinding.getRoot();
    }
    private void initFields(){

    }
    private void initFunc(){

    }
    private void setListeners(){

    }
}