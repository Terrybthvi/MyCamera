package com.example.terry.mycamera;
/**
 * @Class: MainActivity
 * @Description: 主界面
 * @author: leiqi(http://blog.csdn.net/u013132758)
 * @Date: 2016/3/15
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton b = (ImageButton) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,TakePhotoActivity.class);
                startActivity(i);
            }
        });
    }
}
