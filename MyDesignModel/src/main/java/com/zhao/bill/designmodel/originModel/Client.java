package com.zhao.bill.designmodel.originModel;

/**
 * 客户端
 * 浅拷贝：副文档的字段引用了原始文档的字段；  其中任何一个的修改，都会对另一个产生影响；
 * 深拷贝：拷贝对象时，对于引用形的字段，也采用拷贝的形式  而不是单纯的引用
 * <p>
 * Created by Bill on 2017/12/20.
 */
public class Client {

    public static void main(String[] args) {

       /* // 1、浅拷贝
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
        //cloneDocument1.setImages("哈哈.jpg");
        cloneDocument1.showDocu();

        originDocument.showDocu();*/

        // 2.深拷贝  拷贝对象时，对于引用形的字段，也采用拷贝的形式  而不是单纯的引用
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
        cloneDocument1.setImages("哈哈.jpg");
        cloneDocument1.showDocu();

        originDocument.showDocu();

    }
}
