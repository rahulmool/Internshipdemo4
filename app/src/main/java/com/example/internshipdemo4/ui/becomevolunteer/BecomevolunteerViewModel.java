package com.example.internshipdemo4.ui.becomevolunteer;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BecomevolunteerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BecomevolunteerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Becomevolunteer fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}