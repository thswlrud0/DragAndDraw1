package com.bignerdranch.android.draganddraw;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DragAndDrawActivity extends SingleFragmentActivity {
    //git add test
    //왜안돼ㅁㅁ
    @Override
    protected Fragment createFragment(){
        return DragAndDrawFragment.newInstance();
    }
}
