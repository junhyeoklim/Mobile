package com.example.dictionary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return  true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {

        switch(item.getItemId()){
            case  R.id.configuration:
                Intent intent = new Intent(MainActivity.this, Inquiry.class);
                startActivity(intent);
            return true;
            case  R.id.inquiry:
                Toast.makeText(getApplicationContext(),"문의",Toast.LENGTH_SHORT).show();
                return true;
          default:
            return super.onOptionsItemSelected(item);
        }
    }

}
