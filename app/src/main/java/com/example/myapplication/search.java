package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class search extends AppCompatActivity {



    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        Intent intent = getIntent();
        String m = intent.getStringExtra("meal");
        Log.d("HKT","餐點"+m);

        /*TextView tv = findViewById(R.id.textView2);
        tv.setText(m);*/
        ImageView im = findViewById(R.id.imageView);

        switch (m){
            case "老先覺":
                im.setImageResource(R.drawable.a01);
                break;
            case "三媽臭臭鍋":
                im.setImageResource(R.drawable.a02);
                break;
            case "來來軒拉麵":
                im.setImageResource(R.drawable.a03);
                break;
            case "班長包子" :
                im.setImageResource(R.drawable.a04);
                break;
            case "八方雲集" :
                im.setImageResource(R.drawable.a05);
                break;
            case  "海之蚵":
                im.setImageResource(R.drawable.a06);
                break;
            case "廟口意麵":
                im.setImageResource(R.drawable.a07);
                break;
            case "88食堂" :
                im.setImageResource(R.drawable.a08);
                break;
            case "九龍城炒飯":
                im.setImageResource(R.drawable.a09);
                break;
        }

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(search.this , MainActivity.class);
                startActivity(intent);
            }
        });



    }

}