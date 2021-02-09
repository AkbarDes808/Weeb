package com.example.nganu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.Neko){
            startActivity(new Intent(this, Neko.class));
        } else if (item.getItemId() == R.id.Xnxx) {
            startActivity(new Intent(this, Xnxx.class));
        } else if (item.getItemId() == R.id.Other) {
            startActivity(new Intent(this, Other.class));
        }

        return true;
    }
     public void OnClickButton {
     item.getItemsId() == R.id.Perpustakaan)
     startAcity(new Intens(this, Perpus.class));
}
}
