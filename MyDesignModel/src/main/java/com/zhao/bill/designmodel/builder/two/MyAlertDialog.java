package com.zhao.bill.designmodel.builder.two;

import android.app.AlertDialog;
import android.content.Context;

import com.zhao.bill.designmodel.PicApplication;
import com.zhao.bill.designmodel.R;

/**
 * 源码中的Builder模式
 * Created by Bill on 2017/12/16.
 */
public class MyAlertDialog {

    public static void main(String[] args) {
        showDialog(PicApplication.getInstance());
    }

    private static void showDialog(Context context) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        builder.setIcon(R.drawable.ic_launcher_foreground);
        builder.setTitle("Title");
        builder.setMessage("Message");
        builder.setPositiveButton("Button1", (anInterface, i) -> {

        });

        builder.setNeutralButton("Button2", (anInterface, i) -> {

        });

        builder.create();
    }
}
