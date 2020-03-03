package com.example.internshipdemo4.ui.shareyourdetails;

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

public class ShareyourdetailsFragment extends Fragment{
    private ShareyourdetailsViewModels shareyourdetailsViewModels;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        shareyourdetailsViewModels =
                ViewModelProviders.of(this).get(ShareyourdetailsViewModels.class);
        View root = inflater.inflate(R.layout.fragment_shareyourdetails, container, false);

        return root;
    }
}
