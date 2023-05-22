package com.example.dictionary;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Inquiry extends AppCompatActivity {

    TextView TextView_get;

    //main(String[] args)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inquiry); //activity 매칭

        TextView_get = findViewById(R.id.TextView_get);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras(); //Extra들을 가져옴
        String email = bundle.getString("email");   //가져온 Extars 중에서 꺼내기
        String password = bundle.getString("password");

        TextView_get.setText(email + "/" + password);


    }
}
