package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    String[] names = new String[]{"老先覺", "三媽臭臭鍋", "來來軒拉麵", "班長包子","八方雲集", "海之蚵", "廟口意麵", "88食堂","九龍城炒飯"};
    Timer timer;
    private Button button;
    public  String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("等下吃什麼");

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this , search.class);
                intent.putExtra("meal",str);
                startActivity(intent);
            }
        });
    }
        public void start (View bu){
            Button btn = (Button) bu;
            String title = btn.getText().toString();
            if (title.equals("開抽")) {
                btn.setText("就決定是你了");
                timer = new Timer();
                timer.schedule(new TimerTask() {

                    public void run() {
                        produceOnePerson();

                    }


                }, 0, 100);

            } else {
                //btn.setText("開抽");
                timer.cancel();
            }
        }
        public void produceOnePerson () {
            Random random = new Random();
            int index = Math.abs(random.nextInt()) % names.length;

            String name = names[index];

            TextView tv = findViewById(R.id.textView);
            tv.setText(name);
            str=name;

        }
        public  void tra(){
            Intent in = new Intent();

            Bundle bundle = new Bundle();

            bundle.putString("餐點",str);
            in.putExtras(bundle);
            in.setClass(MainActivity.this,search.class);
        }





}