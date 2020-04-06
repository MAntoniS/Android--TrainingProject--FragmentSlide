package com.example.fragmentslideapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    private static final int NUM_PAGES = 5;

    private ViewPager mPager;

    private PagerAdapter mPagerAdapter;

    private List<Book> bookList;

    private int mPosition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getExtras();

        bookList = (ArrayList) bundle.getSerializable("BOOK_LIST");

        mPosition = bundle.getInt("POSITION");

        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
        mPager.setCurrentItem(mPosition);


    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter{
        public ScreenSlidePagerAdapter(FragmentManager fragmentManager){
            super(fragmentManager);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            Book book = bookList.get(position);
            return new ScreenSlidePageFragment(book);
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }

    }
}
