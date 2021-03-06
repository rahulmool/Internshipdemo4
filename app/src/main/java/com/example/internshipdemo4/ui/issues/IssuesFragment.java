package com.example.internshipdemo4.ui.issues;

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

public class IssuesFragment extends Fragment {
    private IssuesViewModel issuesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        issuesViewModel =
                ViewModelProviders.of(this).get(IssuesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_issues, container, false);

        return root;
    }

}
