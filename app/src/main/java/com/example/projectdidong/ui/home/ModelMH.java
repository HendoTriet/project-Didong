package com.example.projectdidong.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ModelMH extends ViewModel {

    private MutableLiveData<String> mText;

    public ModelMH ( ) {
        mText = new MutableLiveData<> ( );
        mText.setValue ( "This is home fragment" );
    }

    public LiveData<String> getText ( ) {
        return mText;
    }
}