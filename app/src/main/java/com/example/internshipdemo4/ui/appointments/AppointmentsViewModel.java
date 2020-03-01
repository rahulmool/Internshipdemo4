package com.example.internshipdemo4.ui.appointments;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AppointmentsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AppointmentsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Appointments fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
