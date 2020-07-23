package com.myapplicationdev.android.c347p10ps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Fragment> al;
    MyFragmentAdapter adapter;
    ViewPager vPager;
    Button btnBack, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        vPager = findViewById(R.id.viewPager1);


        FragmentManager fm = getSupportFragmentManager();

        al = new ArrayList<Fragment>();
        al.add(new fragment_Orange());
        al.add(new blue());

        adapter = new MyFragmentAdapter(fm, al);

        vPager.setAdapter(adapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options, menu);
        return super.onCreateOptionsMenu(menu);
    }
   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.HomePage:
                Intent i = new Intent(getApplicationContext(), HomePage.class);
                startActivity(i);
                return true;
        }
        switch (item.getItemId()) {
            case R.id.transaction:
                Intent i = new Intent(getApplicationContext(), lvViewTransaction2.class);
                startActivity(i);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }*/


}
