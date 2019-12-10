package com.androidtutz.anushka.lifecycledemo;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int clickCount=0;
    private MutableLiveData<Integer> mutableLiveData=new MutableLiveData<>();

    public void  getCurrentCount(){

        clickCount+=1;
        mutableLiveData.setValue(clickCount);

    }

    public MutableLiveData<Integer> getInitialCount(){

        mutableLiveData.setValue(clickCount);
        return mutableLiveData;
    }

}
