package com.example.internshipdemo4.ui.myprofile;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.internshipdemo4.R;

public class MyprofileFragment extends Fragment  {
    private MyprofileViewModel myprofileViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        myprofileViewModel =
                ViewModelProviders.of(this).get(MyprofileViewModel.class);
        View root = inflater.inflate(R.layout.fragment_myprofile, container, false);

        return root;
    }
}
