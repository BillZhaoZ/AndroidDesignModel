package com.zhao.bill.designmodel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.zhao.bill.designmodel.factorymodel.three.DBHanlder;
import com.zhao.bill.designmodel.factorymodel.three.FileHanlder;
import com.zhao.bill.designmodel.factorymodel.three.IOFactory;
import com.zhao.bill.designmodel.factorymodel.three.IOHandler;
import com.zhao.bill.designmodel.factorymodel.three.XMLHanlder;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(R.layout.activity_factory)
public class FactoryActivity extends AppCompatActivity {

    @ViewInject(value = R.id.tv_content)
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        x.view().inject(this);

    }

    @Event(value = {R.id.tv_db, R.id.tv_file, R.id.tv_xml})

    private void click(View v) {

        String aaaaa;
        IOHandler handler;

        switch (v.getId()) {

            case R.id.tv_file:
                handler = IOFactory.getIOHandler(FileHanlder.class);
                aaaaa = handler.query("aaaaa");
                mTextView.setText(aaaaa);
                break;

            case R.id.tv_db:
                handler = IOFactory.getIOHandler(DBHanlder.class);
                aaaaa = handler.query("aaaaa");
                mTextView.setText(aaaaa);
                break;

            case R.id.tv_xml:
                handler = IOFactory.getIOHandler(XMLHanlder.class);
                aaaaa = handler.query("aaaaa");
                mTextView.setText(aaaaa);
                break;
        }
    }
}
