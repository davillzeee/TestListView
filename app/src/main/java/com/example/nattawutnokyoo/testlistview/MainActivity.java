package com.example.nattawutnokyoo.testlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] resId = { R.drawable.b1
                , R.drawable.b2, R.drawable.b3};


        String[] list = { "Batman", "Batgirl", "Robin"};

        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), list, resId);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {


            }
        });
    }
}
