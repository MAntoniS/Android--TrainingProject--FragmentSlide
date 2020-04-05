package com.example.fragmentslideapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;




public class ScreenSlidePageFragment extends Fragment {


    private Book mBook;

    public ScreenSlidePageFragment(Book mBook) {
        this.mBook = mBook;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = (ViewGroup)inflater.inflate(R.layout.fragment_screen_slide_page,container,false);

        TextView bookTitle =(TextView) rootView.findViewById(R.id.title);
        bookTitle.setText(mBook.getmTitle());
        TextView bookAutor = (TextView) rootView.findViewById(R.id.autor_name);
        bookAutor.setText(mBook.getmAutorName());
        TextView bookGenre= (TextView) rootView.findViewById(R.id.genre);
        bookGenre.setText(mBook.getmGenre());
        return rootView;

    }
}
