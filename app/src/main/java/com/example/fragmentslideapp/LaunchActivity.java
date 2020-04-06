package com.example.fragmentslideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class LaunchActivity extends AppCompatActivity {

    Button mButton;
    ArrayList<Book> mBookList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        mBookList = new ArrayList<>();
        mBookList.add(new Book("Lord of the rings","J.R.R. Tolkiesn","Fantasy",""));
        mBookList.add(new Book("Dawnfall of the Roman Empire","E. Gibbon","History",""));
        mBookList.add(new Book("American Gods","N. Geilman","Fantasy",""));
        mBookList.add(new Book("Moving Pictures","T. Prattchet","Fantasy",""));
        mBookList.add(new Book("Thinking in Java","B. Eckel","IT",""));
        mButton = (Button)findViewById(R.id.button_main_activity);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LaunchActivity.this, MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("POSITION",3);
                bundle.putSerializable("BOOK_LIST",mBookList);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
