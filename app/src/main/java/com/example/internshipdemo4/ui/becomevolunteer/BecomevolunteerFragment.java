package com.example.internshipdemo4.ui.becomevolunteer;
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

public class BecomevolunteerFragment extends Fragment {

    private BecomevolunteerViewModel becomevolunteerViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        becomevolunteerViewModel =
                ViewModelProviders.of(this).get(BecomevolunteerViewModel.class);
        View root = inflater.inflate(R.layout.fragment_becomevolunteer, container, false);

        return root;
    }
}