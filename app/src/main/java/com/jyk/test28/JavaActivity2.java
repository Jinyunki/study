package com.jyk.test28;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class JavaActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java2);
    }

    public void test() {

        ArrayList<String> list = new ArrayList<>();
        for (String str : list) {

        }

        for(int i = 0; i<10; i++) {

        }
    }
}