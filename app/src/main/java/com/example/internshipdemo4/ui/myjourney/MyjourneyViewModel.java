package com.example.internshipdemo4.ui.myjourney;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyjourneyViewModel extends ViewModel {
    private MutableLiveData<String> mText;
    public MyjourneyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Myjourney fragment");
    }
    public LiveData<String> getText() {
        return mText;
    }

}
