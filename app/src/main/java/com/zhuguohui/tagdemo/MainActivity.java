package com.zhuguohui.tagdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.zhuguohui.tagdemo.util.TagUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_title = (TextView) findViewById(R.id.tv_title);
        TagUtil.setTag("热门", tv_title);
    }
}
