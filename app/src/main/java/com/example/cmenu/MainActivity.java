package com.example.cmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.tv1);
        registerForContextMenu(tv);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View view , ContextMenu.ContextMenuInfo menuInfo)
    {
        View v;
        super.onCreateContextMenu(menu,view,menuInfo);
        menu.setHeaderTitle("select");
        menu.add("call");
        menu.add("sms");
    }
    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
        if(item.getTitle().toString().equals("calls"))
        {
            Toast.makeText(this, "calling", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "sms", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}