package com.example.auser.java120402;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    FragmentTransaction ft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v){
        ft= getFragmentManager().beginTransaction();
        ft.replace(R.id.layout1,new FragmentA(),"f_a");
        ft.commit();
    }
    public void click2(View v){
        ft= getFragmentManager().beginTransaction();
        ft.replace(R.id.layout1,new FragmentB(),"f_b");
        ft.commit();
    }
}
