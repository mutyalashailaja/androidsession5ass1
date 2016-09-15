package com.example.admin.menus;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=(TextView)findViewById(R.id.textview);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         super.onCreateOptionsMenu(menu);

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);



        return true;
}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.item1) {
            TextView textView = (TextView) findViewById(R.id.textview);

            textView.setTextColor(Color.parseColor("#B71C1C"));
        }
        if(id==R.id.item2) {
            TextView textView = (TextView) findViewById(R.id.textview);

            textView.setTextColor(Color.parseColor("#4CAF50"));
        }
        if(id==R.id.item3) {
            TextView textView = (TextView) findViewById(R.id.textview);

            textView.setTextColor(Color.parseColor("#2196F3"));
        }
        return super.onOptionsItemSelected(item);
    }
}
