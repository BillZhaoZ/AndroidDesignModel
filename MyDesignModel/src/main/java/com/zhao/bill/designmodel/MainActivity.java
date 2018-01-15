package com.zhao.bill.designmodel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.x;

/**
 * 主页设置
 */
@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);

        // 测试引用arr
      /*  String content = MyTest.getContent();
        Log.d("haha", content);*/
    }

    @Event(value = {R.id.tv_builder, R.id.tv_factory})

    private void click(View v) {
        switch (v.getId()) {

            case R.id.tv_builder:
                startActivity(new Intent(this, ImageActivity.class));
                break;

            case R.id.tv_factory:
                startActivity(new Intent(this, FactoryActivity.class));
                break;
        }
    }


}
