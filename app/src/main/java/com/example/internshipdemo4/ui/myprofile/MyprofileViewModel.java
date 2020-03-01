package com.example.internshipdemo4.ui.myprofile;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyprofileViewModel extends ViewModel {
    private MutableLiveData<String> mText;
    public MyprofileViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is My profile fragment");
    }
    public LiveData<String> getText() {
        return mText;
    }

}

