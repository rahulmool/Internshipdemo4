package com.example.internshipdemo4.ui.shareyourdetails;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShareyourdetailsViewModels extends ViewModel{

    private MutableLiveData<String> mText;

    public ShareyourdetailsViewModels() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Shareyourdetails fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

