package com.example.uni.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.uni.R;
import com.example.uni.databinding.FragmentContactsBinding;
import com.example.uni.utilities.Replace;

import org.jetbrains.annotations.NotNull;


public class ContactsFragment extends Fragment {
    private FragmentContactsBinding fragmentContactsBinding;

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentContactsBinding = FragmentContactsBinding.inflate(getLayoutInflater());
        initFields();
        initFunc();
        setListeners();
        return fragmentContactsBinding.getRoot();
    }
    private void initFields(){

    }
    private void initFunc(){

    }
    private void setListeners(){
        fragmentContactsBinding.fragmentContactsToolbarButton.setOnClickListener(v -> requireActivity().onBackPressed());
        fragmentContactsBinding.fragmentContactsNewContactButton.setOnClickListener(v -> {
            Replace.replaceFragment(this, R.id.activityMain_fragmentContainerView, new NewContactFragment(), true);
        });
    }
}