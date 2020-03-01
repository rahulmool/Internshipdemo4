package com.example.internshipdemo4.ui.myvision;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyvisionViewModel extends ViewModel{

    private MutableLiveData<String> mText;

    public MyvisionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
