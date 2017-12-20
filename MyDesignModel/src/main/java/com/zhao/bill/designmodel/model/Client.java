package com.zhao.bill.designmodel.model;

/**
 * 客户端
 * Created by Bill on 2017/12/20.
 */

public class Client {

    public static void main(String[] args) {

        // 构建对象
        WordDocument originDocument = new WordDocument();

        originDocument.setText("这是一篇文档");
        originDocument.setImages("图片1");
        originDocument.setImages("图片2");
        originDocument.setImages("图片3");

        originDocument.showDocu();

        // 以原始文档为对象  拷贝一份
        WordDocument cloneDocument1 = originDocument.clone();
        originDocument.showDocu();

        // 修改备份文档  不会影响原始文档
        cloneDocument1.setText("这是修改过的文档2");
        cloneDocument1.showDocu();

        originDocument.showDocu();
    }
}
