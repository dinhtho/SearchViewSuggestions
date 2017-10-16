package com.example.pcpv.searchviewsuggestions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private AutoCompleteTextView autocompleteView;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=(ImageView)findViewById(R.id.ic_search);

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("ab");
        list.add("abc");
        list.add("ahc");
        list.add("bcd");
        list.add("efg");
        list.add("ef");


        AutoCompleteDogsAdapter adapter = new AutoCompleteDogsAdapter(this,list);
        autocompleteView = (AutoCompleteTextView) findViewById(R.id.autocompleteView);
        autocompleteView.setAdapter(adapter);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }


}
