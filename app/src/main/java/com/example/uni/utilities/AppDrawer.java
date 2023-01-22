package com.example.uni.utilities;

import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;

import com.example.uni.R;
import com.example.uni.databinding.FragmentChatsBinding;
import com.example.uni.fragments.ContactsFragment;
import com.example.uni.fragments.SettingsFragment;

public class AppDrawer {
    public static void create(Fragment chatsFragment, FragmentChatsBinding fragmentChatsBinding){
        fragmentChatsBinding.fragmentChatsNavigationView.setItemIconTintList(null);
        fragmentChatsBinding.fragmentChatsNavigationView.setNavigationItemSelectedListener(item -> {
            fragmentChatsBinding.fragmentChatsDrawerLayout.closeDrawer(GravityCompat.START);
            if (item.getItemId() == R.id.menuContacts){
                Replace.replaceFragment(chatsFragment, R.id.activityMain_fragmentContainerView, new ContactsFragment(), true);
            } else if (item.getItemId() == R.id.menuSettings){
                Replace.replaceFragment(chatsFragment, R.id.activityMain_fragmentContainerView, new SettingsFragment(), true);
            }
            return false;
        });
        fragmentChatsBinding.fragmentChatsNavigationView.getHeaderView(0).findViewById(R.id.header_userImage).setOnClickListener(v -> {
            fragmentChatsBinding.fragmentChatsDrawerLayout.closeDrawer(GravityCompat.START);
            Replace.replaceFragment(chatsFragment, R.id.activityMain_fragmentContainerView, new SettingsFragment(), true);
        });
    }
}
