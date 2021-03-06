package com.bhavyakaria.recyclerview.java;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.bhavyakaria.recyclerview.R;
import com.bhavyakaria.recyclerview.java.simple_recycler_view.SimpleRecyclerViewActivity;
import com.bhavyakaria.recyclerview.java.staggered_grid_recycler_view.StaggeredGridRecyclerViewActivity;
import com.bhavyakaria.recyclerview.java.two_column_recycler_view.TwoColumnRecyclerViewActivity;

public class RecyclerViewJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_java);

        ListView listView = findViewById(R.id.list_view);

        String[] typesOfRecyclerView = new String[] {
                "Simple RecyclerView",
                "Simple Two Column List",
                "Staggered Grid Layout"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, typesOfRecyclerView);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0: startActivity(new Intent(getApplicationContext(), SimpleRecyclerViewActivity.class));
                            break;

                    case 1: startActivity(new Intent(getApplicationContext(), TwoColumnRecyclerViewActivity.class));
                            break;

                    case 2: startActivity(new Intent(getApplicationContext(), StaggeredGridRecyclerViewActivity.class));
                            break;
                }
            }
        });

    }
}
