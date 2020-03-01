package com.example.internshipdemo4.ui.myjourney;
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

public class MyjourneyFragment extends Fragment  {
    private MyjourneyViewModel myjourneyViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        myjourneyViewModel =
                ViewModelProviders.of(this).get(MyjourneyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_myjourney, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        myjourneyViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
